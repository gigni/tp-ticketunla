package ticketUNLa;

public class usuarioEspecial {
	private int codigoUsuario;
	private String permisos;
	public usuarioEspecial(int codigoUsuario, String permisos) {
		this.setCodigoUsuario(codigoUsuario);
		this.setPermisos(permisos);
	}
	public int getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getPermisos() {
		return permisos;
	}
	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}

	
	
}
