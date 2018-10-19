package ticketUNLa;

import java.util.GregorianCalendar;

public class Cliente extends Usuario {
	private boolean estudiante;
	private boolean jubilado;
	public Cliente(boolean estudiante, boolean jubilado,long id, int dni, String nombre, String apellido, GregorianCalendar nacimiento) {
		super(id, dni, nombre, apellido, nacimiento);
		this.estudiante = estudiante;
		this.jubilado = jubilado;
	}
	public boolean isEstudiante() {
		return estudiante;
	}
	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}
	public boolean isJubilado() {
		return jubilado;
	}
	public void setJubilado(boolean jubilado) {
		this.jubilado = jubilado;
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	


}
