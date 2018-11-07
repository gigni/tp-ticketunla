package ticketUNLa;

public class SectorPopular {
	private int cantidadMaxima;

	public SectorPopular(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	@Override
	public String toString() {
		return "Popular: cantidadMaxima=" + cantidadMaxima + "\n";
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
