package test;

import ticketUNLa.*;
import java.util.*;


public class TestABMEvento {



	public static void main(String[] args) {
		SistemaTicketUNLA s = new SistemaTicketUNLA();
		try {
			System.out.println("##################################### Agrego un Evento #######################################");
			System.out.println("##################################### Agrego un Evento #######################################");
			System.out.println("##################################### Agrego un Evento #######################################");
			s.agregarEvento("Juanito y los Clonosaurios",0.05 , 0.15);
			s.agregarEvento("La vela puerca", 0.30, 0.50);
			s.agregarEvento("Fragil", 0.25, 0.35);
			s.agregarAuditorio("unla", "cine", "calle falsa 123");
			s.agregarAuditorio("lavalle", "cine", "lavalle 780");
			s.agregarAuditorio("geba", "teatro", "uriarte 1400");
			Auditorio auditorio=s.traerAuditorio(1);
			Auditorio auditorio2=s.traerAuditorio(2);
			Auditorio auditorio3=s.traerAuditorio(3);
			auditorio.agregarSector("pullman", 5, 2, 2, 1);
			auditorio.agregarSector("palco", 10, 2, 3, 4);
			auditorio2.agregarSector("popular", 5, 0, 0, 5);
			auditorio2.agregarSector("platea", 15, 3, 5, 0);
			auditorio3.agregarSector("popular", 5, 0, 0, 5);
			auditorio3.agregarSector("plate", 3, 3, 1, 0);
			GregorianCalendar f1 = new GregorianCalendar(2018,11,19,20,30,00);	
			GregorianCalendar f2 = new GregorianCalendar(2018,10,30,17,00,00);
			Evento evento = s.traerEvento(1);
			evento.agregarFuncion(f1,auditorio, 0.05);
			evento.agregarTarifa(230,auditorio.traerSector("pullman"));
			Evento evento2 = s.traerEvento(2);
			evento2.agregarFuncion(f2, auditorio2, 0.09);
			evento2.agregarTarifa(450, auditorio2.traerSector("popular"));
			Evento evento3 = s.traerEvento(3);
			evento3.agregarFuncion(f1, auditorio3, 0.25);
			evento3.agregarTarifa(400, auditorio3.traerSector("plate"));
			System.out.println(s.imprimirEventos());
		}
		catch(Exception e) {
			System.out.println("Excepcion:"+ e.getMessage());
		}
			
		try {
			System.out.println("##################################### Modifico un Evento #######################################");
			s.modificarEvento(2, "La Lampara puerca");
			
			
			System.out.println(s.imprimirEventos());
		}
		catch(Exception e) {
			System.out.println("Excepcion:"+ e.getMessage());
		}
	try {
		System.out.println("##################################### Elimino un Evento #######################################");
		Auditorio auditorio=s.traerAuditorio(1);
		Auditorio auditorio2=s.traerAuditorio(2);
		auditorio.agregarSector("pullman", 5, 2, 2, 1);
		auditorio.agregarSector("palco", 10, 2, 3, 4);
		auditorio2.agregarSector("popular", 5, 0, 0, 5);
		auditorio2.agregarSector("platea", 15, 3, 5, 0);

		GregorianCalendar f1 = new GregorianCalendar(2018,11,19,20,30,00);	
		GregorianCalendar f2 = new GregorianCalendar(2018,10,30,17,00,00);
		
		Evento evento = s.traerEvento(1);
		evento.agregarFuncion(f1,auditorio, 0.05);
		evento.agregarTarifa(230,auditorio.traerSector("pullman"));
		Evento evento2 = s.traerEvento(2);
		evento2.agregarFuncion(f2, auditorio2, 0.09);
		evento2.agregarTarifa(450, auditorio2.traerSector("popular"));
		
		s.eliminarEvento(1);
		System.out.println(s.imprimirEventos());
		System.out.println("##################################### Lo vuelvo a agregar #######################################");
		System.out.println("##################################### Lo vuelvo a agregar #######################################");
		s.agregarEvento("Juanito y los Clonosaurios",0.05 , 0.15);
		Evento evento4 = s.traerEvento(4);
		evento4.agregarFuncion(f1,auditorio, 0.05);
		evento4.agregarTarifa(230,auditorio.traerSector("pullman"));
		System.out.println(s.imprimirEventos());
		
		
	}
	catch(Exception e) {
		System.out.println("Excepcion:" + e.getMessage());
	}
			

		}
		
	
}
