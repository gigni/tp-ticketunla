package ticketUNLa;
import ticketUNLa.Usuario;
import java.util.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar Fecha = new GregorianCalendar (1998,04,21); //arreglar la diferencia de los meses
		Usuario Usuario1 = new Usuario (123456789, 41142737, "Thomas", "Medina",Fecha);
		System.out.println(Usuario1.calcularEdad());
		
		try
		{
		Sector sector = new Sector(1, 7, 3, 2, 1);
		System.out.println(sector);
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
	}

}
