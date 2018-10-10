package ticketUNLa;
import java.util.*;

public class Funcion {
	
	private int funcionNumero;
	private GregorianCalendar fecha;
	
	public Funcion(int funcionNumero, GregorianCalendar fecha) {
		super();
		this.funcionNumero = funcionNumero;
		this.fecha = fecha;
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
	


	


	

}
