package ticketUNLa;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Evento {
	
	private long id;
	private String nombre;
	private List<Funcion>funciones = new ArrayList<Funcion>();
	private List<Tarifa> tarifas = new ArrayList<Tarifa>();
	


	public Evento(long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	public void agregarFuncion(GregorianCalendar fecha, Auditorio auditorio,  double descuentoDia) {
		long id=-1;
		if(funciones.isEmpty()) id=1;
		else id=funciones.get(funciones.size()-1).getId()+1;
		Funcion funcion = new Funcion(id, fecha, auditorio, descuentoDia);
		funciones.add(funcion);
	}
	
	public void modificarFuncion(long id, GregorianCalendar fecha, Auditorio auditorio,  double descuentoDia) throws Exception {
		boolean localizado=false;
		int p=0;
		while(p<funciones.size()&&localizado==false) {
			Funcion funcion=funciones.get(p);
			if(funcion.getId()==id) {
				localizado=true;
				funcion.setFecha(fecha);
				funcion.setAuditorio(auditorio);
				funcion.setDescuentoDia(descuentoDia);
			}
		}
		if(!localizado) throw new Exception("Error: No se encontro el Evento");
	}
	
	public void eliminarFuncion(long id) throws Exception {
		boolean localizado=false;
		int p=0;
		while(p<funciones.size()&&localizado==false) {
			Funcion funcion=funciones.get(p);
			if(funcion.getId()==id) {
				localizado=true;
				funciones.remove(p);
			}
		}
		if(!localizado) throw new Exception("Error: No se encontro el Evento");
	}
	
	public void agregarTarifa(double precioSector, Sector sector) {
		Tarifa tarifa = new Tarifa(precioSector,sector);
		tarifas.add(tarifa);
	}
	public String imprimirFunciones() {
		String funciones="";
		for(int p=0;p<this.funciones.size();p++) {
			funciones=funciones+this.funciones.get(p).imprimirFuncion();
		}
		return funciones;
	}
	
	public String imprimirTarifas() {
		String tarifas="";
		for(int p=0;p<this.tarifas.size();p++) {
			tarifas=tarifas+this.tarifas.get(p).imprimirTarifa();
		}
		return tarifas;
	}
	
	public String imprimirEvento() {
		return "Evento: id="+id+" nombre="+nombre+"\ntarifas="+imprimirTarifas()+"\n funciones="+imprimirFunciones()+ "\n";
	}

	@Override
	public String toString() {
		return "Evento: id=" + id + ", nombre=" + nombre + ", funciones=" + funciones + ", tarifas=" + tarifas + "\n";
	}
	
}
