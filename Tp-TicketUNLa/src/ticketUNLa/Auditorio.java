package ticketUNLa;

public class Auditorio {
	
	protected String nombre;
	protected String tipoAuditorio;
	protected String direccion;
	
	public Auditorio(String nombre, String tipoAuditorio, String direccion) {
		super();
		this.nombre = nombre;
		this.tipoAuditorio = tipoAuditorio;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoAuditorio() {
		return tipoAuditorio;
	}

	public void setTipoAuditorio(String tipoAuditorio) {
		this.tipoAuditorio = tipoAuditorio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


}
