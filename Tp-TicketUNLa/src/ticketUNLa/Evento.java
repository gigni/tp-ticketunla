package ticketUNLa;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	
	private String nombre;
	private List<Funcion>funciones = new ArrayList<Funcion>();
	private List<Tarifa> tarifas = new ArrayList<Tarifa>();
	


	public Evento(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}

	public List<Tarifa> getTarifas() {
		return tarifas;
	}

	public void setTarifas(List<Tarifa> tarifas) {
		this.tarifas = tarifas;
	}

}
