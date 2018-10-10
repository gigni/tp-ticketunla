package ticketUNLa;
import ticketUNLa.Usuario;
import java.util.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar Fecha = new GregorianCalendar (1997,28,13); //arreglar la diferencia de los meses
		Usuario Usuario1 = new Usuario (123456789, 41142737, "Thomas", "Medina",Fecha);
		System.out.println(Usuario1.calcularEdad());

	}

}
