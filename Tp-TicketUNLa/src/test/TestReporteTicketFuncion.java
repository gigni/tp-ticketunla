package test;

import java.util.GregorianCalendar;

import ticketUNLa.Auditorio;
import ticketUNLa.Cliente;
import ticketUNLa.Compra;
import ticketUNLa.Evento;
import ticketUNLa.SistemaTicketUNLA;

public class TestReporteTicketFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaTicketUNLA sis = new SistemaTicketUNLA();
		try{
			sis.agregarAuditorio("unla", "cine", "calle falsa 123");
			sis.agregarAuditorio("lavalle", "cine", "lavalle 780");
			Auditorio auditorio=sis.traerAuditorio(1);
			auditorio.agregarSector("pullman", 9, 4, 2, 1);
			auditorio.agregarSector("palco", 6, 6, 1, 0);
			sis.agregarEvento("juanito y los clonosaurios",0,0.7);//nombre evento,descuento estudiante,descuento jubilado
			Evento evento=sis.traerEvento(1);
			GregorianCalendar fecha1 = new GregorianCalendar (2018,9,21,20,00);
			GregorianCalendar fecha2 = new GregorianCalendar (2018,10,29,21,00,00);
			evento.agregarFuncion(fecha1, auditorio, 0.5); //fecha de la funcion,descuento por dia.
			evento.agregarFuncion(fecha2, auditorio, 0);
			evento.agregarTarifa(500, auditorio.traerSector("pullman"));
			evento.agregarTarifa(1000,auditorio.traerSector("palco"));
			GregorianCalendar nacimiento1 = new GregorianCalendar(1998,04,21);
			GregorianCalendar nacimiento2 = new GregorianCalendar(1995,10,19);
			sis.agregarCliente(12345678, "walter", "medina", nacimiento1, false, true);
			sis.agregarCliente(12553467, "martin", "noy", nacimiento2, true, false);
			Cliente cliente1=sis.traerCliente(1);
			Cliente cliente2=sis.traerCliente(2);
			sis.agregarCompra(cliente1);
			sis.agregarCompra(cliente2);
			Compra compra = sis.traerCompra(1);
			compra.agregarEntrada(evento, cliente1, 1, "palco", true, 1, 0);
			compra.agregarEntrada(evento, cliente1, 1, "palco", true, 2, 0);
			compra.agregarEntrada(evento, cliente1, 1, "palco", true, 3, 0);
			compra.agregarEntrada(evento, cliente1, 1, "palco", true, 4, 0);
			compra.agregarEntrada(evento, cliente1, 2, "palco", true, 1, 0);
			compra=sis.traerCompra(2);
			compra.agregarEntrada(evento, cliente2, 1, "pullman", true, 1, 0);
			compra.agregarEntrada(evento, cliente2, 1, "palco", true, 5, 0);
			compra.agregarEntrada(evento, cliente2, 1, "pullman", false, 0, 0);
			
			System.out.println(sis.generarReporteXFuncion(2));
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
	}

}
