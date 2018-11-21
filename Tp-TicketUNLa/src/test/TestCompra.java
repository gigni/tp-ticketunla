package test;
import java.util.GregorianCalendar;

import ticketUNLa.*;

public class TestCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaTicketUNLA sis = new SistemaTicketUNLA();
		try{
			sis.agregarAuditorio("unla", "cine", "calle falsa 123");
			sis.agregarAuditorio("lavalle", "cine", "lavalle 780");
//			System.out.println(sis.getauditorios());
			Auditorio auditorio=sis.traerAuditorio(1);
			auditorio.agregarSector("pullman", 60, 4, 2, 1);
			auditorio.agregarSector("palco", 6, 6, 1, 0);
			sis.agregarEvento("juanito y los clonosaurios",0,0.7);//nombre evento,descuento estudiante,descuento jubilado
			System.out.println(sis.geteventos());
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
			//			System.out.println(sis.getclientes());
			
			
			
			
			Cliente cliente1=sis.traerCliente(1);
			Cliente cliente2=sis.traerCliente(2);
			//creo la compra.
			System.out.println(sis.imprimirEventos());
			sis.agregarCompra(cliente1);
			sis.agregarCompra(cliente2);
			System.out.println("\n### Creo las compras ########");
			Compra compra = sis.traerCompra(1);
			compra.agregarEntrada(evento, cliente1, 1, "palco", true, 1, 0);
			compra.agregarEntrada(evento, cliente1, 1, "palco", true, 2, 0);
			compra.agregarEntrada(evento, cliente1, 1, "palco", true, 3, 0);
			compra.agregarEntrada(evento, cliente1, 1, "palco", true, 4, 0);
			compra.agregarEntrada(evento, cliente1, 2, "palco", true, 1, 0);
			System.out.println(sis.traerCompra(1));
			compra=sis.traerCompra(2);
			compra.agregarEntrada(evento, cliente2, 1, "pullman", true, 1, 0);
			compra.agregarEntrada(evento, cliente2, 1, "palco", true, 5, 0);
			compra.agregarEntrada(evento, cliente2, 1, "pullman", false, 0, 0);
			System.out.println(sis.traerCompra(2));
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
		try {	
			//intento comprar otra entrada con misma ubicacion
			System.out.println("\n######################################### Intento comprar entrada con la misma ubicacion #####################################");
			Evento evento=sis.traerEvento(1);
			Cliente cliente1=sis.traerCliente(1);
			Compra compra = sis.traerCompra(1);
			System.out.println(sis.traerCompra(1));
			sis.agregarCompra(cliente1);
			compra = sis.traerCompra(1);
			System.out.println("\nPido la segunda entrada");
			compra.agregarEntrada(evento, cliente1, 1, "palco", true, 1, 0);
			System.out.println(sis.traerCompra(1));
			
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
		
		try {	
			//intento comprar otra entrada con misma ubicacion
			System.out.println("\n######################################### Intento comprar entrada con la misma ubicacion con distinto cliente #####################################");

			Evento evento=sis.traerEvento(1);

			Cliente cliente2=sis.traerCliente(2);
			//creo la compra.
			Compra compra = sis.traerCompra(1);

			System.out.println(sis.traerCompra(1));
			compra=sis.traerCompra(2);
			System.out.println("\nPido una butaca ya ocupada para una compra distinta de otro cliente");
			compra.agregarEntrada(evento, cliente2, 1, "palco", true, 1, 0);
			System.out.println(sis.traerCompra(2));
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
		try{
			System.out.println("\n################################# Compruebo que no me deje comprar si se lleno la popular #######################################");
			Evento evento=sis.traerEvento(1);
			Cliente cliente1=sis.traerCliente(1);
			Compra compra = sis.traerCompra(1);
			compra.agregarEntrada(evento, cliente1, 1, "pullman", false, 1, 0);
			System.out.println(sis.traerCompra(1));
			compra.agregarEntrada(evento, cliente1, 1, "pullman", false, 2, 0);
			System.out.println(sis.traerCompra(2));
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
	}
}
