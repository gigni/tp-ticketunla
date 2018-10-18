package test;
import ticketUNLa.Usuario;
import java.util.*;

import ticketUNLa.Cliente;
import ticketUNLa.Sector;
import ticketUNLa.Tarifa;
import ticketUNLa.TipoDescuento;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar Fecha = new GregorianCalendar (1998,04,21); //arreglar la diferencia de los meses
		Usuario Usuario1 = new Usuario (123456789, 41142737, "Thomas", "Medina",Fecha);
		System.out.println(Usuario1.calcularEdad());
		

		
				try
				{
				Sector sector = new Sector("pullman", 7, 3, 2, 1);
				TipoDescuento descuento = new TipoDescuento (0.10, 0.80);		
				Cliente cliente1 = new Cliente (false, true, 0, 0, null, null, Fecha);
				Tarifa tarifa1 = new Tarifa (500, sector);
				System.out.println(tarifa1.calcularPrecioFinal(cliente1, descuento));
				}
				catch(Exception e){
					System.out.println("Excepcion:"+ e.getMessage());
				}
		
	}

}
