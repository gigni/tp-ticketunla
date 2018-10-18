package ticketUNLa;

import java.util.List;
import java.util.ArrayList;

public class Sector {
	private String nombreSector;
	private int capacidadSector;
	private int cantidadFilas;
	private int cantidadColumnas;
	private int cantidadPopulares;
	private SectorPopular populares;
	private List<Butaca> butacas = new ArrayList<Butaca>();
	

	public Sector(String nombreSector, int capacidadSector, int cantidadFilas, int cantidadColumnas, int cantidadPopulares) throws Exception{
		if(cantidadFilas*cantidadColumnas>capacidadSector) throw new Exception("Error:La cantidad de butacas es superior a la capacidad maxima del sector.");
		if(cantidadPopulares>capacidadSector)throw new Exception("Error:La cantidad de populares es superior a la capacidad del sector");
		if(cantidadFilas*cantidadColumnas+cantidadPopulares>capacidadSector) throw new Exception("Error: La cantidad de ubicaciones supera el maximo permitido por el sector");
		this.nombreSector = nombreSector;
		this.capacidadSector = capacidadSector;
		this.cantidadFilas = cantidadFilas;
		this.cantidadColumnas = cantidadColumnas;
		this.cantidadPopulares = cantidadPopulares;
		this.populares = new SectorPopular(cantidadPopulares);
		setButacas(cantidadFilas,cantidadColumnas);
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
	@Override
	public String toString() {
		return "Sector [nombreSector=" + nombreSector + ", capacidadSector=" + capacidadSector + ", cantidadFilas="
				+ cantidadFilas + ", cantidadColumnas=" + cantidadColumnas + ", cantidadPopulares=" + cantidadPopulares
				+ ", populares=" + populares + ", butacas=" + butacas + "]";
	}
	
}
