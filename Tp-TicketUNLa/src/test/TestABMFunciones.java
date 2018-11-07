package test;
import ticketUNLa.*;
import java.util.*;

public class TestABMFunciones {

	public static void main(String[] args) {
		try {
			System.out.println("##################################### Agrego una funcion #######################################");
			SistemaTicketUNLA e = new SistemaTicketUNLA();
			GregorianCalendar f1 = new GregorianCalendar(2018,10,19,20,30,00);
			GregorianCalendar f2 = new GregorianCalendar(2018,11,1,21,00,00);
			e.agregarEvento("Juanito y los Clonosaurios",0.05 , 0.15);
			e.agregarAuditorio("unla", "cine", "calle falsa 123");
			Evento evento = e.traerEvento(1);
			Auditorio auditorio=e.traerAuditorio(1);
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
			SistemaTicketUNLA e = new SistemaTicketUNLA();
			GregorianCalendar f1 = new GregorianCalendar(2018,10,19,20,30,00);
			GregorianCalendar f2 = new GregorianCalendar(2018,11,1,21,00,00);
			e.agregarEvento("Juanito y los Clonosaurios",0.05 , 0.15);
			e.agregarAuditorio("unla", "cine", "calle falsa 123");
			e.agregarAuditorio("lavalle", "cine", "lavalle 780");
			Evento evento = e.traerEvento(1);
			Auditorio auditorio=e.traerAuditorio(1);
			auditorio.agregarSector("pullman", 5, 2, 2, 1);
			Auditorio auditorio2 = e.traerAuditorio(2);
			auditorio2.agregarSector("popular", 5, 1, 1, 4);
			evento.agregarFuncion(f1, auditorio, 0.32);
			System.out.println("Evento:" + evento.getNombre() + "\n"+ evento.imprimirFunciones());
			System.out.println("################################ imprimo modificado#############");
			evento.modificarFuncion(1, f2, auditorio2, 0.10);
			System.out.println("Evento:" + evento.getNombre() + "\n"+ evento.imprimirFunciones());
		}
		catch(Exception e) {
			System.out.println("Excepcion:"+ e.getMessage());
		}
	
	

		try {
			System.out.println("##################################### Elimino una funcion #######################################");
			SistemaTicketUNLA e = new SistemaTicketUNLA();
			GregorianCalendar f1 = new GregorianCalendar(2018,10,19,20,30,00);
			GregorianCalendar f2 = new GregorianCalendar(2018,11,1,21,00,00);
			e.agregarEvento("Juanito y los Clonosaurios",0.05 , 0.15);
			e.agregarAuditorio("unla", "cine", "calle falsa 123");
			e.agregarAuditorio("lavalle", "cine", "alemania 2222");
			Evento evento = e.traerEvento(1);
			Auditorio auditorio=e.traerAuditorio(1);
			auditorio.agregarSector("pullman", 5, 2, 2, 1);
			evento.agregarFuncion(f1, auditorio, 0.50);
			evento.agregarFuncion(f2, auditorio, 0.50);
			System.out.println( e.imprimirEventos());
			System.out.println("###########Imprimo el evento sin la funcion 1##########");
			evento.eliminarFuncion(1);
			System.out.println(e.imprimirEventos());
			
		}
		catch(Exception e) {
			System.out.println("Excepcion:"+ e.getMessage());
		}
	}
}

