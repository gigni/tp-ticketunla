package test;
import ticketUNLa.*;
import java.util.*;

public class TestABMFunciones {

	public static void main(String[] args) {
		SistemaTicketUNLA s = new SistemaTicketUNLA();
		GregorianCalendar f1 = new GregorianCalendar(2018,10,19,20,30,00);
		GregorianCalendar f2 = new GregorianCalendar(2018,11,1,21,00,00);
		try {
			System.out.println("##################################### Agrego una funcion #######################################");
			s.agregarEvento("Juanito y los Clonosaurios",0.05 , 0.15);
			s.agregarAuditorio("unla", "cine", "calle falsa 123");
			Evento evento = s.traerEvento(1);
			Auditorio auditorio=s.traerAuditorio(1);
			auditorio.agregarSector("pullman", 5, 2, 2, 1);
			evento.agregarFuncion(f1, auditorio, 0.32);
			evento.agregarFuncion(f2, auditorio, 0.50);
			System.out.println("Evento:"+ evento.getNombre() +" \n"+ evento.imprimirFunciones());
		}
		catch(Exception e) {
			System.out.println("Excepcion:"+ e.getMessage());
		}
	

		try {
			System.out.println("##################################### Modifico una funcion #######################################");
			Evento evento = s.traerEvento(1);
			Auditorio auditorio=s.traerAuditorio(1);
			auditorio.agregarSector("pullman", 5, 2, 2, 1);
			s.agregarAuditorio("lavalle", "cine", "lavalle 780");
			Auditorio auditorio2 = s.traerAuditorio(2);
			System.out.println("################################ imprimo modificado#############");
			evento.modificarFuncion(1, f2, auditorio2, 0.10);
			System.out.println("Evento:" + evento.getNombre() + "\n"+ evento.imprimirFunciones());
		}
		catch(Exception e) {
			System.out.println("Excepcion:"+ e.getMessage());
		}
	
	

		try {
			System.out.println("##################################### Elimino una funcion #######################################");
			Evento evento = s.traerEvento(1);
			evento.eliminarFuncion(1);
			System.out.println(s.imprimirEventos());
			
		}
		catch(Exception e) {
			System.out.println("Excepcion:"+ e.getMessage());
		}
	}
}

