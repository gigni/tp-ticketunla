package ticketUNLa;
import java.util.*;

public class Funcion {
	
	protected int funcionNumero;
	protected GregorianCalendar horarioInicio;
	protected GregorianCalendar horarioFinalizacion;
	
	public Funcion(int funcionNumero, GregorianCalendar horarioInicio, GregorianCalendar horarioFinalizacion) {
		super();
		this.funcionNumero = funcionNumero;
		this.horarioInicio = horarioInicio;
		this.horarioFinalizacion = horarioFinalizacion;
	}

	public int getFuncionNumero() {
		return funcionNumero;
	}

	public void setFuncionNumero(int funcionNumero) {
		this.funcionNumero = funcionNumero;
	}

	public GregorianCalendar getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(GregorianCalendar horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public GregorianCalendar getHorarioFinalizacion() {
		return horarioFinalizacion;
	}

	public void setHorarioFinalizacion(GregorianCalendar horarioFinalizacion) {
		this.horarioFinalizacion = horarioFinalizacion;
	}

}
