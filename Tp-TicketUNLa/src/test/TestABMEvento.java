package test;

import ticketUNLa.*;
import java.util.*;


public class TestABMEvento {



	public static void main(String[] args) {
		try {
			SistemaTicketUNLA e = new SistemaTicketUNLA();
			
			e.agregarEvento("Juanito y los Clonosaurios",0.05 , 0.15);
			e.agregarEvento("La vela puerca", 0.30, 0.50);
			e.agregarEvento("Fragil", 0.25, 0.35);
			e.agregarAuditorio("unla", "cine", "calle falsa 123");
			e.agregarAuditorio("lavalle", "cine", "lavalle 780");
			e.agregarAuditorio("geba", "teatro", "uriarte 1400");
			Auditorio auditorio=e.traerAuditorio(1);
			Auditorio auditorio2=e.traerAuditorio(2);
			Auditorio auditorio3=e.traerAuditorio(3);
			auditorio.agregarSector("pullman", 5, 2, 2, 1);
			auditorio.agregarSector("palco", 10, 2, 3, 4);
			auditorio2.agregarSector("popular", 5, 0, 0, 5);
			auditorio2.agregarSector("platea", 15, 3, 5, 0);
			auditorio3.agregarSector("popular", 5, 0, 0, 5);
			auditorio3.agregarSector("plate", 3, 3, 1, 0);
			GregorianCalendar f1 = new GregorianCalendar(2018,11,19);	
			GregorianCalendar f2 = new GregorianCalendar(2018,10,31);
			Evento evento = e.traerEvento(1);
			evento.agregarFuncion(f1,auditorio, 0.05);
			evento.agregarTarifa(230,auditorio.traerSector("pullman"));
			Evento evento2 = e.traerEvento(2);
			evento2.agregarFuncion(f2, auditorio2, 0.09);
			evento2.agregarTarifa(450, auditorio2.traerSector("popular"));
			Evento evento3 = e.traerEvento(3);
			evento3.agregarFuncion(f1, auditorio3, 0.25);
			evento3.agregarTarifa(400, auditorio3.traerSector("pullman"));
			System.out.println(e.imprimirEventos());
			
			
			
			
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}

	}
}
