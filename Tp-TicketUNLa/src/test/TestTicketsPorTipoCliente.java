package test;

import java.util.GregorianCalendar;

import ticketUNLa.Auditorio;
import ticketUNLa.Cliente;
import ticketUNLa.Compra;
import ticketUNLa.Evento;
import ticketUNLa.SistemaTicketUNLA;

public class TestTicketsPorTipoCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			SistemaTicketUNLA sis = new SistemaTicketUNLA();
			sis.agregarAuditorio("unla", "cine", "calle falsa 123");
			sis.agregarAuditorio("lavalle", "cine", "lavalle 780");
			Auditorio auditorio=sis.traerAuditorio(1);
			auditorio.agregarSector("pullman", 9, 4, 2, 1);
			auditorio.agregarSector("palco", 5, 5, 1, 0);
			sis.agregarEvento("juanito y los clonosaurios",1,0.7);
			Evento evento=sis.traerEvento(1);
			GregorianCalendar fecha = new GregorianCalendar (2018,9,21,20,00);
			evento.agregarFuncion(fecha, auditorio, 0.5);
			evento.agregarTarifa(500, auditorio.traerSector("pullman"));
			evento.agregarTarifa(1000,auditorio.traerSector("palco"));
			GregorianCalendar fechaNacimiento = new GregorianCalendar(1998,04,21);
			sis.agregarCliente(12345678, "nombre", "apellido", fechaNacimiento, false, true);
			Cliente cliente=sis.traerCliente(1);
			sis.agregarCompra(cliente);
			Compra compra = sis.traerCompra(1);
			compra.agregarEntrada(evento, cliente, 1, "palco", true, 1, 0);
			compra.agregarEntrada(evento, cliente, 1, "palco", true, 2, 0);
			compra.agregarEntrada(evento, cliente, 1, "palco", true, 3, 0);
			compra.agregarEntrada(evento, cliente, 1, "palco", true, 4, 0);
			
			System.out.println("\n################################# cantidad de entradas vendidas entre fechas #####################################");
			System.out.println(sis.generarReporteDescuentoTipoClientePeriodo(false, true, new GregorianCalendar(2018,8,10), new GregorianCalendar(2018,11,7)));
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
	}

}
