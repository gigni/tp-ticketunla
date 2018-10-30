package test;
import java.util.GregorianCalendar;

import ticketUNLa.*;

public class TestCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			SistemaTicketUNLA sis = new SistemaTicketUNLA();
			sis.agregarAuditorio("unla", "cine", "calle falsa 123");
			sis.agregarAuditorio("lavalle", "cine", "lavalle 780");
//			System.out.println(sis.getauditorios());
			Auditorio auditorio=sis.buscarAuditorio(1);
			auditorio.agregarSector("pullman", 9, 4, 2, 1);
			auditorio.agregarSector("palco", 5, 5, 1, 0);
			sis.agregarEvento("juanito y los clonosaurios",1,0.7);
			System.out.println(sis.geteventos());
			Evento evento=sis.buscarEvento(1);
			GregorianCalendar fecha = new GregorianCalendar (2018,9,21,20,00);
			evento.agregarFuncion(fecha, auditorio, 0.5);
			evento.agregarTarifa(500, auditorio.buscarSector("pullman"));
			evento.agregarTarifa(1000,auditorio.buscarSector("palco"));
			GregorianCalendar fechaNacimiento = new GregorianCalendar(1998,04,21);
			sis.agregarCliente(12345678, "walter", "medina", fechaNacimiento, false, true);
			//			System.out.println(sis.getclientes());
			Cliente cliente=sis.buscarCliente(1);
			
			
			//creo la compra.
			System.out.println(sis.imprimirEventos());
			sis.agregarCompra(cliente);
			Compra compra = sis.buscarCompra(1);
			compra.agregarEntrada(evento, cliente, 1, "palco", true, 1, 0);
			System.out.println(sis.buscarCompra(1));
			
			//intento comprar otra entrada con misma ubicacion
			System.out.println("\n################# Intento comprar otra entrada con misma ubicacion ##############");
			System.out.println(sis.imprimirEventos());
			sis.agregarCompra(cliente);
			compra = sis.buscarCompra(1);
			compra.agregarEntrada(evento, cliente, 1, "palco", true, 1, 0);
			System.out.println(sis.buscarCompra(1));
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
	}
}
