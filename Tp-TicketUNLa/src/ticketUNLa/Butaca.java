package ticketUNLa;
import ticketUNLa.UbicacionDisponible;

public class Butaca extends UbicacionDisponible {
	
	private int x;
	private int y;
	
	public Butaca() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Butaca(int x, int y,boolean disponibilidad) {
		super(disponibilidad);
		this.x = x;
		this.y = y;
	}
	
	
	

}
