package ticketUNLa;

import java.util.GregorianCalendar;

public class Cliente extends Usuario {
	protected String tipoCliente;

	public Cliente(long id, int dni, String nombre, String apellido, GregorianCalendar nacimiento,String tipoCliente) {
		super(id, dni, nombre, apellido, nacimiento);
		// TODO Auto-generated constructor stub
		this.tipoCliente=tipoCliente;
	}

}
