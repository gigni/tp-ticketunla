package ticketUNLa;
import java.util.*;

public class Funcion {
	
	private int funcionNumero;
	private GregorianCalendar fecha;
	private Auditorio auditorio;
	

	public Funcion(int funcionNumero, GregorianCalendar fecha, Auditorio auditorio) {
		this.funcionNumero = funcionNumero;
		this.fecha = fecha;
		this.auditorio = auditorio;
	}

	public int getFuncionNumero() {
		return funcionNumero;
	}

	public void setFuncionNumero(int funcionNumero) {
		this.funcionNumero = funcionNumero;
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

	public void setAuditorio(Auditorio auditorio) {
		this.auditorio = auditorio;
	}

}
