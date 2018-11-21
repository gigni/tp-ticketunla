package test;
import ticketUNLa.*;
public class TestABMAuditorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaTicketUNLA s = new SistemaTicketUNLA();
		try {
			
			s.agregarAuditorio("Rex sala 1", "cine", "9 de Julio 845");
			s.agregarAuditorio("Zotero", "teatro", "Pichincha 342");
			s.agregarAuditorio("Pico y Pala", "estadio", "Allende 1658");
			System.out.println(s.getauditorios());
			Auditorio auditorio=s.traerAuditorio(1);
			auditorio.agregarSector("sector", 10, 5, 2, 0);
			auditorio=s.traerAuditorio(2);
			auditorio.agregarSector("palco 1", 6, 3, 2, 0);
			auditorio.agregarSector("palco 2", 6, 3, 2, 0);
			auditorio.agregarSector("general", 9, 3, 3, 0);
			auditorio=s.traerAuditorio(3);
			auditorio.agregarSector("platea", 4, 4, 1, 0);
			auditorio.agregarSector("popular", 6, 0, 0, 6);
			System.out.println(s.getauditorios());
		}			
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
		
		try {
			System.out.println("############################ Modifico Auditorio 2 ######################");
			s.modificarAuditorio(2, "Finale", "teatro", "Campichuelo 2452");
			System.out.println(s.getauditorios());
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
			
		try {	
			System.out.println("############################ Elimino Auditorio 3######################");
			
			s.eliminarAuditorio(3);
			System.out.println(s.getauditorios());
			
		}
		catch(Exception e){
			System.out.println("Excepcion:"+ e.getMessage());
		}
	}

}
