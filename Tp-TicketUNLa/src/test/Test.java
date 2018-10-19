package test;
import ticketUNLa.Usuario;
import java.util.*;

import ticketUNLa.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		agregar 2 auditorios
//		agregar 2 eventos cada a
//		agregar 2 funciones cada e
//		agregar el tarifario
//		agregar tipo cliente
//		agregar 2 cliente
//		agregar 2 sectores

		
//		traerCliente(1)
//		trarA 1
//		evento 1
//		funcion 1
//		new Compra(tickets,cliente,funciones,tarifa,precioFinal)
//		System.out compra

//		traerCliente(2)
//		trearA 1
//		evento 1
//		funcion 1
//		sector 1
//		no permitir misma ubicación
		
		GregorianCalendar Fecha = new GregorianCalendar (1998,04,21); //arreglar la diferencia de los meses
		Usuario Usuario1 = new Usuario (123456789, 41142737, "Thomas", "Medina",Fecha);
		System.out.println(Usuario1.calcularEdad());
		

		
				try
				{
				Sector sector1 = new Sector("pullman", 7, 3, 2, 1);
				Sector sector2 = new Sector("palco",5,0,0,5);
				Auditorio auditorio1= new Auditorio("unla", "cine", "calle falsa 123");
				auditorio1.getSectores().add(sector1);
				auditorio1.getSectores().add(sector2);
				Evento evento1 = new Evento("juanito y los clonosaurios");
				Funcion funcion1 = new Funcion(1, Fecha, auditorio1);
				evento1.getFunciones().add(funcion1);
				Tarifa tarifa1 = new Tarifa(500, sector1);
				Tarifa tarifa2 = new Tarifa(1000,sector2);
				evento1.getTarifas().add(tarifa1);
				evento1.getTarifas().add(tarifa2);
				TipoDescuento descuento = new TipoDescuento(0.10, 0.80);		
				Cliente cliente1 = new Cliente(false, true, 0, 12345678, "nombre", "apellido", Fecha);
				
				//genero un ticket
				Entrada entrada1 = new Entrada(funcion1,cliente1, "palco", true, 1, 0);
				Compra compra = new Compra(cliente1);
				compra.getListaEntradas().add(entrada1);
				System.out.println(compra.toString());//falta agregar calculo del precio
				
				System.out.println(tarifa1.calcularPrecioFinal(cliente1, descuento));
				System.out.println(sector1.toString());
				System.out.println(sector2.toString());
				}
				catch(Exception e){
					System.out.println("Excepcion:"+ e.getMessage());
				}
		
	}

}
