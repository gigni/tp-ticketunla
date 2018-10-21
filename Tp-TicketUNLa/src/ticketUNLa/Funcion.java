package ticketUNLa;
import java.util.*;

public class Funcion {
	
	private int funcionNumero;
	private GregorianCalendar fecha;
	private Auditorio auditorio;
	private double descuentoDia;
	

	public Funcion(int funcionNumero, GregorianCalendar fecha, Auditorio auditorio,  double descuentoDia) {
		this.funcionNumero = funcionNumero;
		this.fecha = fecha;
		setAuditorio(auditorio);
		this.descuentoDia = descuentoDia;
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
		Auditorio aux = new Auditorio();
		aux=auditorio;
		this.auditorio = aux;
	}

	public double getDescuentoDia() {
		return descuentoDia;
	}

	public void setDescuentoDia(double descuentoDia) {
		this.descuentoDia = descuentoDia;
	}

}
