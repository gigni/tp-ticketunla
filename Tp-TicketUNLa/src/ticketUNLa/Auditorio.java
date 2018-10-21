package ticketUNLa;
import java.util.List;
import java.util.ArrayList;

public class Auditorio {
	
	private String nombre;
	private String tipoAuditorio;
	private String direccion;
	private List<Sector> sectores = new ArrayList<Sector>();
	


	public Auditorio(String nombre, String tipoAuditorio, String direccion) {
		this.nombre = nombre;
		this.tipoAuditorio = tipoAuditorio;
		this.direccion = direccion;
	}

	public Auditorio() {
		// TODO Auto-generated constructor stub
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

	public List<Sector> getSectores() {
		return sectores;
	}

	public void setSectores(List<Sector> sectores) {
		this.sectores = sectores;
	}


}
