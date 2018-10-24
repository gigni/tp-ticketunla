package ticketUNLa;
import java.util.List;
import java.util.ArrayList;

public class Auditorio {
	
	private long id;
	private String nombre;
	private String tipoAuditorio;
	private String direccion;
	private List<Sector> sectores = new ArrayList<Sector>();
	


	public Auditorio(long id, String nombre, String tipoAuditorio, String direccion) {
		this.id = id;
		this.nombre = nombre;
		this.tipoAuditorio = tipoAuditorio;
		this.direccion = direccion;
	}

	public Auditorio() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	public void agregarSector(String nombreSector, int capacidadSector, int cantidadFilas, int cantidadColumnas, int cantidadPopulares) throws Exception {
		Sector sector = new Sector(nombreSector, capacidadSector, cantidadFilas, cantidadColumnas, cantidadPopulares);
		sectores.add(sector);
	}
	
	public Sector buscarSector(String nombreSector) throws Exception {
		int p=0;
		boolean localizado=false;
		Sector sector= null;
		while(p<getSectores().size()&&localizado==false) {
			sector = getSectores().get(p);
			if(sector.getnombreSector()==nombreSector) localizado=true;
			p++;
		}
		if(localizado=false) throw new Exception("Error: No se encontro el sector.");
		return sector;
	}
	public String imprimirSectores() {
		String sectores="";
		for(int p=0;p<this.sectores.size();p++) {
			sectores=sectores+this.sectores.get(p).imprimirSector();
		}
		return sectores;
	}
	
	public String imprimirAuditorio() {
		return "Auditorio: nombre=" + nombre + " direccion="+direccion+ "\nsectores="+imprimirSectores();
	}

	@Override
	public String toString() {
		return "Auditorio: id=" + id + ", nombre=" + nombre + ", tipoAuditorio=" + tipoAuditorio + ", direccion="
				+ direccion + ", sectores=" + sectores + "\n";
	}


}
