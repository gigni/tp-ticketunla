package ticketUNLa;
import java.util.ArrayList;
import java.util.List;
import ticketUNLa.UbicacionDisponible;

public class Sector {
	protected int idSector;
	List <UbicacionDisponible> Lista = new ArrayList<UbicacionDisponible>();
	/**
	 * @param idSector
	 * @param lista
	 */
	public Sector(int idSector, List<UbicacionDisponible> lista) {
		super();
		this.idSector = idSector;
		Lista = lista;
	}
	public int getIdSector() {
		return idSector;
	}
	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}
	public List<UbicacionDisponible> getLista() {
		return Lista;
	}
	public void setLista(List<UbicacionDisponible> lista) {
		Lista = lista;
	}
	
}
