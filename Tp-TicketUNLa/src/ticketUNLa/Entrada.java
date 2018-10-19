package ticketUNLa;

public class Entrada {
	
	private int numeroEntrada;
	private Funcion funcion;
	private double valorFinalEntrada;
	private String ubicacionSeleccionada;
	
	public Entrada( Funcion funcion,Cliente cliente, String nombreSector, boolean esNumerado, int posicionX, int posicionY) {
		setNumeroEntrada();
		this.funcion = funcion;
		setValorFinalEntrada(cliente,nombreSector);
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

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}

	public double getValorFinalEntrada() {
		return valorFinalEntrada;
	}

	public void setValorFinalEntrada(double valorFinalEntrada) {
		this.valorFinalEntrada = valorFinalEntrada;
	}
	
	public void setValorFinalEntrada(Cliente cliente, String nombreSector) {
		//calcular Tarifa
	}

	public String getUbicacionSeleccionada() {
		return ubicacionSeleccionada;
	}

	public void setUbicacionSeleccionada(String ubicacionSeleccionada) {
		this.ubicacionSeleccionada = ubicacionSeleccionada;
	}

	public void setUbicacionSeleccionada(String nombreSector, boolean esNumerado, int posicionX, int posicionY) {
		for(int p=0;p<funcion.getAuditorio().getSectores().size();p++) {
			Sector sector = funcion.getAuditorio().getSectores().get(p);
			if(sector.getnombreSector()==nombreSector) {
				if(esNumerado) {
					for(int q=0;q<sector.getButacas().size();q++) {
						Butaca butaca=sector.getButacas().get(q);
						if(butaca.getPosicionX()==posicionX&&butaca.getPosicionY()==posicionY) {
							if(butaca.isOcupado()) {
								
							}
							else butaca.setOcupado(true);
							ubicacionSeleccionada="Posicion X =" + posicionX+ "Posicion Y =" +posicionY;
						}
					}
				}
				else if(sector.getPopulares().getCantidadMaxima()!=0) {
					SectorPopular popular= sector.getPopulares();
					popular.setCantidadMaxima(popular.getCantidadMaxima()-1);
					ubicacionSeleccionada="Popular";
				}
			}
		}
	}
	
	@Override
	public String toString() {
		return "Entrada [numeroEntrada=" + numeroEntrada + ", funcion=" + funcion.getFuncionNumero() + ", valorfinalEntrada="
				+ valorFinalEntrada + ", ubicacionSeleccionada=" + ubicacionSeleccionada + "]";
	}

	
	
//public String imprimirTicket() {//agregar cantidad de tikets comprada por un usuario y usarlo para imprimir distintas partes de la lista
	
	
//}
}