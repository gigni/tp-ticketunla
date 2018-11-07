package ticketUNLa;



public class Entrada {
	
	private long id;
	private Evento evento;
	private Funcion funcion;
	private double valorFinalEntrada;
	private String nombreSector;
	private boolean esNumerado;
	private int posicionX;
	private int posicionY;
	
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
	
	public String getNombreSector() {
		return nombreSector;
	}



	public void setNombreSector(String nombreSector) {
		this.nombreSector = nombreSector;
	}



	public boolean isEsNumerado() {
		return esNumerado;
	}



	public void setEsNumerado(boolean esNumerado) {
		this.esNumerado = esNumerado;
	}



	public int getPosicionX() {
		return posicionX;
	}



	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}



	public int getPosicionY() {
		return posicionY;
	}



	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}



	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}



	public void setValorFinalEntrada(Cliente cliente, TipoDescuento descuento, String nombreSector) {
		//calcular Tarifa
			for(int p=0;p<evento.getTarifas().size();p++) {
				Tarifa tarifa=evento.getTarifas().get(p);
				if(tarifa.getSector().getnombreSector().equals(nombreSector)) {
					this.valorFinalEntrada=tarifa.calcularPrecioFinal(cliente, descuento)*funcion.getDescuentoDia();
				}
			}
				
		
	}


	// funcion para setear una butaca o sector popular
	public void setUbicacionSeleccionada(String nombreSector, boolean esNumerado, int posicionX, int posicionY) throws Exception{
		Sector sector = funcion.getAuditorio().traerSector(nombreSector);//busca el nombre del sector
		if(esNumerado) {
			Butaca butaca = sector.traerButaca(posicionX, posicionY);
			if(butaca.isOcupado()) throw new Exception("Error:Butaca ya ocupada.");//excepcion para butacas ocupadas
			butaca.setOcupado();
			this.nombreSector=sector.getnombreSector();
			this.esNumerado=esNumerado;
			this.posicionX = posicionX;
			this.posicionY = posicionY;
		}
		else {
			SectorPopular popular= sector.getPopulares();
			if(popular.getCantidadMaxima()==0) throw new Exception("Error: No queda lugar en popular");
			popular.setCantidadMaxima(popular.getCantidadMaxima()-1);
			this.esNumerado=false;
			this.posicionX=-1;
			this.posicionY=-1;
		}
	}

		
	public void quitarReserva () throws Exception{
		Sector sector = funcion.getAuditorio().traerSector(nombreSector);
		if(this.esNumerado) {
			Butaca butaca = sector.traerButaca(posicionX, posicionY);
			butaca.setOcupado();
		}
		else {
			SectorPopular popular= sector.getPopulares();
			popular.setCantidadMaxima(popular.getCantidadMaxima()+1);
		}
	}
	
	
	
	@Override
	public String toString() {
		String imprimir= "\nEntrada: numeroEntrada=" + id + " Evento="+evento.getNombre()+", funcion=" + funcion.getId() +"Fecha="+Funciones.traerFechaCortaHora(funcion.getFecha()) +", valorfinalEntrada="
				+ valorFinalEntrada + " Sector: "+ nombreSector;
		 if (esNumerado) {
			 imprimir=imprimir+" Posicion X: "+posicionX +" Posicion Y: "+ posicionY;
			 }
		 else imprimir=imprimir+" Sector Popular";
		 return imprimir;
	}

	
	
//public String imprimirTicket() {//agregar cantidad de tikets comprada por un usuario y usarlo para imprimir distintas partes de la lista
	
	
//}
}