package test;
import ticketUNLa.*;

import java.util.GregorianCalendar;

import ticketUNLa.Auditorio;
import ticketUNLa.Cliente;
import ticketUNLa.Compra;

public class TestCancelarEntradaEnCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			SistemaTicketUNLA sis = new SistemaTicketUNLA();
			sis.agregarAuditorio("unla", "cine", "calle falsa 123");
			sis.agregarAuditorio("lavalle", "cine", "lavalle 780");
//			System.out.println(sis.getauditorios());
			Auditorio auditorio=sis.traerAuditorio(1);
			auditorio.agregarSector("pullman", 9, 4, 2, 1);
			auditorio.agregarSector("palco", 5, 5, 1, 0);
			sis.agregarEvento("juanito y los clonosaurios",1,0.7);
			System.out.println(sis.geteventos());
			Evento evento=sis.traerEvento(1);
			GregorianCalendar fecha = new GregorianCalendar (2018,9,21,20,00);
			evento.agregarFuncion(fecha, auditorio, 0.5);
			evento.agregarTarifa(500, auditorio.traerSector("pullman"));
			evento.agregarTarifa(1000,auditorio.traerSector("palco"));
			GregorianCalendar fechaNacimiento = new GregorianCalendar(1998,04,21);
			sis.agregarCliente(12345678, "nombre", "apellido", fechaNacimiento, false, true);
			//			System.out.println(sis.getclientes());
			Cliente cliente=sis.traerCliente(1);
			
			
			//creo la compra con varias entradas
			System.out.println(sis.imprimirEventos());
			sis.agregarCompra(cliente);
			Compra compra = sis.traerCompra(1);
			compra.agregarEntrada(evento, cliente, 1, "palco", true, 1, 0);
			System.out.println(sis.traerCompra(1));
			System.out.println(sis.imprimirEventos());
			compra = sis.traerCompra(1);
			compra.agregarEntrada(evento, cliente, 1, "palco", true, 2, 0);
			System.out.println(sis.traerCompra(1));
			System.out.println("Muestro los eventos con sus ubicaciones \n"+sis.imprimirEventos());
			compra = sis.traerCompra(1);
			compra.agregarEntrada(evento, cliente, 1, "palco", true, 3, 0);
			System.out.println(sis.traerCompra(1));
			
			System.out.println("\n\n################################ Elimino una entrada #####################################");
			compra.eliminarEntrada(2);
			System.out.println(sis.traerCompra(1));

			
			System.out.println("\n\n################################## compro otra entrada  ########################");
			compra.agregarEntrada(evento, cliente, 1, "palco", true, 2, 0);
			System.out.println(sis.traerCompra(1));
			
			System.out.println(sis.generarReporteXFuncion(1));
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
	}
}


