package test;
import java.util.GregorianCalendar;

import ticketUNLa.Auditorio;
import ticketUNLa.Cliente;
import ticketUNLa.Compra;
import ticketUNLa.Entrada;
import ticketUNLa.Evento;
import ticketUNLa.Funcion;
import ticketUNLa.Sector;
import ticketUNLa.Tarifa;
import ticketUNLa.TipoDescuento;

public class TestCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
				{
				GregorianCalendar Fecha = new GregorianCalendar (1998,04,21);
				Sector sector1 = new Sector("pullman", 7, 3, 2, 1);
				Sector sector2 = new Sector("palco",5,5,1,0);
				Auditorio auditorio1= new Auditorio("unla", "cine", "calle falsa 123");
				auditorio1.getSectores().add(sector1);
				auditorio1.getSectores().add(sector2);
				Evento evento1 = new Evento("juanito y los clonosaurios");
				Funcion funcion1 = new Funcion(1, Fecha, auditorio1,0.50);
				evento1.getFunciones().add(funcion1);
				Tarifa tarifa1 = new Tarifa(500, sector1);
				Tarifa tarifa2 = new Tarifa(1000,sector2);
				evento1.getTarifas().add(tarifa1);
				evento1.getTarifas().add(tarifa2);
				TipoDescuento descuento = new TipoDescuento(0.10, 0.80);		
				Cliente cliente1 = new Cliente(false, true, 0, 12345678, "nombre", "apellido", Fecha);
				
				//genero un ticket
				Entrada entrada1 = new Entrada(evento1,cliente1, 1, "palco", true, 1, 0);
				entrada1.setValorFinalEntrada(cliente1,  descuento,"palco");
				Compra compra = new Compra(cliente1);
				compra.getListaEntradas().add(entrada1);
				System.out.println(compra.toString());
				
				
				//intento comprar otra entrada con misma ubicacion
				System.out.println("################# Intento comprar otra entrada con misma ubicacion ##############");
				Entrada entrada2 = new Entrada(evento1,cliente1, 1, "palco", true, 1, 0);
				entrada2.setValorFinalEntrada(cliente1,  descuento,"palco");
				compra.getListaEntradas().add(entrada2);
				System.out.println(compra.toString());
				
				}
				catch(Exception e){
					System.out.println("Excepcion:"+ e.getMessage());
				}

	}

}
