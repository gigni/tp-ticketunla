package ticketUNLa;

import java.util.List;
import java.util.ArrayList;

public class Sector {
	private int idSector;
	private int capacidadSector;
	private int cantidadFilas;
	private int cantidadColumnas;
	private int cantidadPopulares;
	private Popular populares;
	private List<Butaca> butacas = new ArrayList<Butaca>();
	

	public Sector(int idSector, int capacidadSector, int cantidadFilas, int cantidadColumnas, int cantidadPopulares) throws Exception{
		if(cantidadFilas*cantidadColumnas>capacidadSector) throw new Exception("Error:La cantidad de butacas es superior a la capacidad maxima del sector.");
		if(cantidadPopulares>capacidadSector)throw new Exception("Error:La cantidad de populares es superior a la capacidad del sector");
		if(cantidadFilas*cantidadColumnas+cantidadPopulares>capacidadSector) throw new Exception("Error: La cantidad de ubicaciones supera el maximo permitido por el sector");
		this.idSector = idSector;
		this.capacidadSector = capacidadSector;
		this.cantidadFilas = cantidadFilas;
		this.cantidadColumnas = cantidadColumnas;
		this.cantidadPopulares = cantidadPopulares;
		this.populares = new Popular(cantidadPopulares);
		setButacas(cantidadFilas,cantidadColumnas);
	}

	public int getIdSector() {
		return idSector;
	}

	public void setIdSector(int idSector) {
		this.idSector = idSector;
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

	public Popular getPopulares() {
		return populares;
	}

	public void setPopulares(Popular populares) {
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
		return "Sector [idSector=" + idSector + ", capacidadSector=" + capacidadSector + ", cantidadFilas="
				+ cantidadFilas + ", cantidadColumnas=" + cantidadColumnas + ", cantidadPopulares=" + cantidadPopulares
				+ ", populares=" + populares + ", butacas=" + butacas + "]";
	}
	
}
