package ticketUNLa;



public class Entrada {
	
	private long id;
	private Evento evento;
	private Funcion funcion;
	private double valorFinalEntrada;
	private String ubicacionSeleccionada;
	
	public Entrada( long id, Evento evento,Cliente cliente, int funcionNumero, String nombreSector, boolean esNumerado, int posicionX, int posicionY) throws Exception{
		this.id=id;
		this.evento = evento;
		setFuncion(evento,funcionNumero);
		valorFinalEntrada=-1;
		setUbicacionSeleccionada(nombreSector,esNumerado,posicionX,posicionY);
	}

	

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Funcion getFuncion() {
		return funcion;
	}



	public void setFuncion(Evento evento, long id) {
		for(int o=0;o<evento.getFunciones().size();o++) {
			Funcion funcion=evento.getFunciones().get(o);
			if(funcion.getId()==id) {
				this.funcion = funcion;
			}
		}
	}



	public double getValorFinalEntrada() {
		return valorFinalEntrada;
	}

	public void setValorFinalEntrada(double valorFinalEntrada) {
		this.valorFinalEntrada = valorFinalEntrada;
	}
	
	public void setValorFinalEntrada(Cliente cliente, TipoDescuento descuento, String nombreSector) {
		//calcular Tarifa
			for(int p=0;p<evento.getTarifas().size();p++) {
				Tarifa tarifa=evento.getTarifas().get(p);
				if(tarifa.getSector().getnombreSector()==nombreSector) {
					this.valorFinalEntrada=tarifa.calcularPrecioFinal(cliente, descuento)*funcion.getDescuentoDia();
				}
			}
				
		
	}

	public String getUbicacionSeleccionada() {
		return ubicacionSeleccionada;
	}

	public void setUbicacionSeleccionada(String ubicacionSeleccionada) {
		this.ubicacionSeleccionada = ubicacionSeleccionada;
	}

	public void setUbicacionSeleccionada(String nombreSector, boolean esNumerado, int posicionX, int posicionY) throws Exception{
		Sector sector = funcion.getAuditorio().buscarSector(nombreSector);
		if(esNumerado) {
			Butaca butaca = sector.buscarButaca(posicionX, posicionY);
			if(butaca.isOcupado()) throw new Exception("Error:Butaca ya ocupada.");
			butaca.setOcupado();
			ubicacionSeleccionada=sector.getnombreSector()+" Posicion X = " + posicionX+ " Posicion Y = " +posicionY;
		}
		else {
			SectorPopular popular= sector.getPopulares();
			if(popular.getCantidadMaxima()==0) throw new Exception("Error: No queda lugar en popular");
			popular.setCantidadMaxima(popular.getCantidadMaxima()-1);
			ubicacionSeleccionada=sector.getnombreSector()+"Popular";
		}
	}

		
	
	
	@Override
	public String toString() {
		return "Entrada: numeroEntrada=" + id + " Evento="+evento.getNombre()+", funcion=" + funcion.getId() +"Fecha="+Funciones.traerFechaCorta(funcion.getFecha()) +", valorfinalEntrada="
				+ valorFinalEntrada + ",\n ubicacionSeleccionada=" + ubicacionSeleccionada;
	}

	
	
//public String imprimirTicket() {//agregar cantidad de tikets comprada por un usuario y usarlo para imprimir distintas partes de la lista
	
	
//}
}