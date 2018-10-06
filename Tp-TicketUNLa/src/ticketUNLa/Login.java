package ticketUNLa;
import ticketUNLa.UsuarioEspecial;


public class Login {
	private String idusuario;
	private String contrasenia;
	private UsuarioEspecial usuarioEspecial;
	public Login(String idusuario, String contrasenia, ticketUNLa.UsuarioEspecial usuarioEspecial) {
		this.setIdusuario(idusuario);
		this.setContrasenia(contrasenia);
		this.setUsuarioEspecial(usuarioEspecial);
	}
	public String getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public UsuarioEspecial getUsuarioEspecial() {
		return usuarioEspecial;
	}
	public void setUsuarioEspecial(UsuarioEspecial usuarioEspecial) {
		this.usuarioEspecial = usuarioEspecial;
	}
	


	
	
}
