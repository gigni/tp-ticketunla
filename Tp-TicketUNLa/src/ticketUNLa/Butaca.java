package ticketUNLa;

public class Butaca {
	private int posicionX;
	private int posicionY;
	private boolean ocupado;

	public Butaca(int posicionX, int posicionY, boolean ocupado) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.ocupado = ocupado;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado() {
		ocupado = !ocupado;
	}
	@Override
	public String toString() {
		return "Butaca: posicionX=" + posicionX + ", posicionY=" + posicionY + ", Ocupado=" + ocupado + "\n";
	}
	
	@Override
	public Object clone(){  
	    try{  
	        return super.clone();  
	    }catch(Exception e){ 
	        return null; 
	    }
	}
}
