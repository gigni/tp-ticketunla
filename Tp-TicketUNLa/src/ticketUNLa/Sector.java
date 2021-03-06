package ticketUNLa;

import java.util.List;
import java.util.ArrayList;

public class Sector {
	private long id;
	private String nombreSector;
	private int capacidadSector;
	private int cantidadFilas;
	private int cantidadColumnas;
	private int cantidadPopulares;
	private SectorPopular populares;
	private List<Butaca> butacas = new ArrayList<Butaca>();
	

	public Sector(long id,String nombreSector, int capacidadSector, int cantidadFilas, int cantidadColumnas, int cantidadPopulares) throws Exception{
		if(cantidadFilas*cantidadColumnas>capacidadSector) throw new Exception("Error:La cantidad de butacas es superior a la capacidad maxima del sector.");
		if(cantidadPopulares>capacidadSector)throw new Exception("Error:La cantidad de populares es superior a la capacidad del sector");
		if((cantidadFilas*cantidadColumnas)+cantidadPopulares>capacidadSector) throw new Exception("Error: La cantidad de ubicaciones supera el maximo permitido por el sector");
		if(cantidadFilas==0&&cantidadColumnas!=0) throw new Exception("Error: Si no hay filas no puede haber columnas");
		if(cantidadColumnas==0&&cantidadFilas!=0) throw new Exception("Error: Si no hay columnas no puede haber filas");
		this.id=id;
		this.nombreSector = nombreSector;
		this.capacidadSector = capacidadSector;
		this.cantidadFilas = cantidadFilas;
		this.cantidadColumnas = cantidadColumnas;
		this.cantidadPopulares = cantidadPopulares;
		this.populares = new SectorPopular(cantidadPopulares);
		setButacas(cantidadFilas,cantidadColumnas);
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getnombreSector() {
		return nombreSector;
	}

	public void setnombreSector(String nombreSector) {
		this.nombreSector = nombreSector;
	}

	public int getCapacidadSector() {
		return capacidadSector;
	}

	public void setCapacidadSector(int capacidadSector) {
		this.capacidadSector = capacidadSector;
	}

	public int getCantidadFilas() {
		return cantidadFilas;
	}

	public void setCantidadFilas(int cantidadFilas) {
		this.cantidadFilas = cantidadFilas;
	}

	public int getCantidadColumnas() {
		return cantidadColumnas;
	}

	public void setCantidadColumnas(int cantidadColumnas) {
		this.cantidadColumnas = cantidadColumnas;
	}

	public int getCantidadPopulares() {
		return cantidadPopulares;
	}

	public void setCantidadPopulares(int cantidadPopulares) {
		this.cantidadPopulares = cantidadPopulares;
	}

	public SectorPopular getPopulares() {
		return populares;
	}

	public void setPopulares(SectorPopular populares) {
		this.populares = populares;
	}


	public List<Butaca> getButacas() {
		return butacas;
	}

	public void setButacas(List<Butaca> butacas) {
		this.butacas = butacas;
	}

	public void setButacas(int cantidadFilas,int cantidadColumnas) {
		for (int i = 0; i < cantidadFilas; i++) {
			for (int j = 0; j < cantidadColumnas; j++) {
				Butaca butaca = new Butaca(i,j,false);
				butacas.add(butaca);
			}
		}
	}
	
	public Butaca traerButaca(int posicionX,int posicionY) throws Exception {
		int p=0;
		boolean localizado=false;
		Butaca butaca=null;
		while(p<getButacas().size()&&!localizado) {
			butaca=getButacas().get(p);
			if(butaca.getPosicionX()==posicionX&&butaca.getPosicionY()==posicionY) {
				localizado=true;
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No existe la butaca");
		return butaca;
	}
	
	public int ubicacionesLibres() {
		int sum=0;
		for(int i=0;i<getButacas().size();i++) {
			if(!getButacas().get(i).isOcupado()) {
				sum=sum+1;
			}
		}
		sum=sum+getPopulares().getCantidadMaxima();
		return sum;
	}
	
	public String imprimirSector() {
		return "Sector: nombre="+nombreSector+"\nbutacas="+butacas+ "\n"+populares;
	}

	@Override
	public String toString() {
		return "Sector: nombreSector=" + nombreSector + ", capacidadSector=" + capacidadSector + ", cantidadFilas="
				+ cantidadFilas + ", cantidadColumnas=" + cantidadColumnas + ", cantidadPopulares=" + cantidadPopulares
				+ ", populares=" + populares + ", butacas=" + butacas + "\n";
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
