package test;

import java.util.*;
import ticketUNLa.*;


public class TestABMCliente {


 
	public static void main(String[] args) {
		SistemaTicketUNLA c = new SistemaTicketUNLA();
		GregorianCalendar f1= new GregorianCalendar(1995,10,19);
		GregorianCalendar f2= new GregorianCalendar(1990,11,18);
		GregorianCalendar f3= new GregorianCalendar(1994,11,18);
		try {
			c.agregarCliente(12553467, "martin", "noy", f1, true, false);//dni,nombre,apellido,fecha de nacimiento,es estudiante, es jubilado.
			c.agregarCliente(37281921, "mafia", "dominguez", f2, false, true);
			c.agregarCliente(26374891,"chino","miyagui",f2,true,false);
			System.out.println(c.getclientes());
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
		
		try {
			System.out.println("##################################### Modifico un cliente #######################################");
			c.modificarCliente(3, 11111111, "chino", "millagui", f3, false, true);
			System.out.println(c.getclientes());
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
			
		try {
			System.out.println("##################################### Elimino un cliente y agrego otro #######################################");
			c.eliminarCliente(1);
			System.out.println(c.getclientes());
			c.agregarCliente(41141234, "martincito", "noycito", f1, false, true);
			System.out.println(c.getclientes());
			
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
	}
}

