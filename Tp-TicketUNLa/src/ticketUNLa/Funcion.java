package ticketUNLa;
import java.util.*;

public class Funcion {
	
	private long id;
	private GregorianCalendar fecha;
	private Auditorio auditorio;
	private double descuentoDia;
	

	public Funcion(long id, GregorianCalendar fecha, Auditorio auditorio,  double descuentoDia) throws Exception {
		this.id = id;
		this.fecha = fecha;
		setAuditorio(auditorio);
		this.descuentoDia = 1-descuentoDia;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public Auditorio getAuditorio() {
		return auditorio;
	}

	public void setAuditorio(Auditorio auditorio) throws Exception{
		Auditorio aux = new Auditorio(auditorio.getId(),auditorio.getNombre(), auditorio.getTipoAuditorio(), auditorio.getDireccion());
		List<Sector> sectores = new ArrayList<Sector>();
		for(int i=0;i<auditorio.getSectores().size();i++) {
			Sector auxSector=auditorio.getSectores().get(i);
			Sector sector=new Sector(auxSector.getId(),auxSector.getnombreSector(),auxSector.getCapacidadSector(),auxSector.getCantidadFilas(),auxSector.getCantidadColumnas(), auxSector.getCantidadPopulares());
			sectores.add(sector);
		}
		aux.setSectores(sectores);
		this.auditorio = aux;
	}

	public double getDescuentoDia() {
		return descuentoDia;
	}

	public void setDescuentoDia(double descuentoDia) {
		this.descuentoDia = descuentoDia;
	}
	
	public int ubicacionesLibres() {
		return getAuditorio().ubicacionesLibres();
	}
	public String imprimirFuncion() {
		return "Funcion: id=" + id + ", fecha=" + Funciones.traerFechaCortaHora(fecha)+ ", descuentoDia=" + descuentoDia + ", auditorio=" + auditorio.imprimirAuditorio() + "\n";
	}

	@Override
	public String toString() {
		return "Funcion: id=" + id + ", fecha=" + Funciones.traerFechaCortaHora(fecha) + ", auditorio=" + auditorio + ", descuentoDia=" + descuentoDia
				+ "\n";
	}

}
