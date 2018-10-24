package ticketUNLa;


public class Tarifa {
	
	private double precioSector;
	private Sector sector;
	
	public Tarifa(double precioSector, Sector sector) {
		this.precioSector = precioSector;
		this.sector = sector;
	}
	
	public double getPrecioSector() {
		return precioSector;
	}
	public void setPrecioSector(double precioSector) {
		this.precioSector = precioSector;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	
	public double calcularPrecioFinal(Cliente cliente,TipoDescuento descuento) {
		double precio;
		precio=descuento.descuentoCategoria(cliente.isEstudiante(),cliente.isJubilado())*precioSector;
		return precio;
	}

	public String imprimirTarifa() {
		return "Tarifa: sector="+sector.getnombreSector()+"precioSector="+precioSector+"\n";
	}
	@Override
	public String toString() {
		return "Tarifa [precioSector=" + precioSector + ", sector=" + sector + "]";
	}


}
