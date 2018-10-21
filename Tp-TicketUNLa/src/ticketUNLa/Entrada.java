package ticketUNLa;



public class Entrada {
	
	private int numeroEntrada;
	private Evento evento;
	private Funcion funcion;
	private double valorFinalEntrada;
	private String ubicacionSeleccionada;
	
	public Entrada( Evento evento,Cliente cliente, int funcionNumero, String nombreSector, boolean esNumerado, int posicionX, int posicionY) throws Exception{
		setNumeroEntrada();
		this.evento = evento;
		setFuncion(evento,funcionNumero);
		valorFinalEntrada=-1;
		setUbicacionSeleccionada(nombreSector,esNumerado,posicionX,posicionY);
	}

	

	private void setNumeroEntrada() {
		numeroEntrada=0;
	}

	public int getNumeroEntrada() {
		return numeroEntrada;
	}

	public void setNumeroEntrada(int numeroEntrada) {
		this.numeroEntrada = numeroEntrada;
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



	public void setFuncion(Evento evento, int funcionNumero) {
		for(int o=0;o<evento.getFunciones().size();o++) {
			Funcion funcion=evento.getFunciones().get(o);
			if(funcion.getFuncionNumero()==funcionNumero) {
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
		for(int p=0;p<funcion.getAuditorio().getSectores().size();p++) {
			Sector sector = funcion.getAuditorio().getSectores().get(p);
			if(sector.getnombreSector()==nombreSector) {
				if(esNumerado) {
					for(int q=0;q<sector.getButacas().size();q++) {
						Butaca butaca=sector.getButacas().get(q);
						if(butaca.getPosicionX()==posicionX&&butaca.getPosicionY()==posicionY) {
							if(butaca.isOcupado()) {
								throw new Exception("Error:Butaca ya ocupada.");
							}
							else butaca.setOcupado();
							ubicacionSeleccionada=sector.getnombreSector()+" Posicion X = " + posicionX+ " Posicion Y = " +posicionY;
						}
					}
				}
				else if(sector.getPopulares().getCantidadMaxima()!=0) {
					SectorPopular popular= sector.getPopulares();
					popular.setCantidadMaxima(popular.getCantidadMaxima()-1);
					ubicacionSeleccionada=sector.getnombreSector()+"Popular";
				}
			}
		}
	}

		
	
	
	@Override
	public String toString() {
		return "Entrada: numeroEntrada=" + numeroEntrada + " Evento="+evento.getNombre()+", funcion=" + funcion.getFuncionNumero() +"Fecha="+Funciones.traerFechaCorta(funcion.getFecha()) +", valorfinalEntrada="
				+ valorFinalEntrada + ",\n ubicacionSeleccionada=" + ubicacionSeleccionada;
	}

	
	
//public String imprimirTicket() {//agregar cantidad de tikets comprada por un usuario y usarlo para imprimir distintas partes de la lista
	
	
//}
}