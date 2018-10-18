package ticketUNLa;


public class Tarifa {
	
	private double precioFinal;
	private Sector sector;
	
	public Tarifa(double precioFinal, Sector sector) {
		super();
		this.precioFinal = precioFinal;
		this.sector = sector;
	}
	
	public double getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	
	public double calcularPrecioFinal(Cliente cliente,TipoDescuento descuento) {
		double precio;
		precio=descuento.descuentoCategoria(cliente.isEstudiante(),cliente.isJubilado())*precioFinal;
		return precio;
	}


}
