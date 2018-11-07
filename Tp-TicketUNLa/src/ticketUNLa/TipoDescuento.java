package ticketUNLa;

public class TipoDescuento {
	private double descuentoEstudiante;
	private double descuentoJubilado;
	public TipoDescuento(double descuentoEstudiante, double descuentoJubilado) {
		super();
		this.descuentoEstudiante = 1-descuentoEstudiante;
		this.descuentoJubilado = 1-descuentoJubilado;
	}
	public double getDescuentoEstudiante() {
		return descuentoEstudiante;
	}
	public void setDescuentoEstudiante(double descuentoEstudiante) {
		this.descuentoEstudiante = descuentoEstudiante;
	}
	public double getDescuentoJubilado() {
		return descuentoJubilado;
	}
	public void setDescuentoJubilado(double descuentoJubilado) {
		this.descuentoJubilado = descuentoJubilado;
	}
	

	public double descuentoCategoria(boolean estudiante, boolean jubilado){
		double descuento;
		descuento=0;
			if(estudiante) {
				descuento=descuentoEstudiante;
			}
			if(jubilado) {
				descuento=descuentoJubilado;
			}
			
			return descuento;
	}
	@Override
	public String toString() {
		return "TipoDescuento [descuentoEstudiante=" + descuentoEstudiante + ", descuentoJubilado=" + descuentoJubilado
				+ "]";
	}



}

	