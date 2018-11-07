package ticketUNLa;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Evento {
	
	private long id;
	private String nombre;
	private List<Funcion>funciones = new ArrayList<Funcion>();
	private List<Tarifa> tarifas = new ArrayList<Tarifa>();
	TipoDescuento descuento;


	public Evento(long id, String nombre, double descuentoEstudiante, double descuentoJubilado) {
		this.id = id;
		this.nombre = nombre;
		this.descuento = new TipoDescuento(descuentoEstudiante,descuentoJubilado);
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
	
	public void setDescuento(double descuentoEstudiante, double descuentoJubilado) {
		this.descuento.setDescuentoEstudiante(descuentoEstudiante);
		this.descuento.setDescuentoJubilado(descuentoJubilado);
	}
	
	public TipoDescuento getDescuento() {
		return descuento;
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
		while(p<funciones.size()&&!localizado) {
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
		while(p<funciones.size()&&!localizado) {
			Funcion funcion=funciones.get(p);
			if(funcion.getId()==id) {
				localizado=true;
				funciones.remove(p);
			}
		}
		if(!localizado) throw new Exception("Error: No se encontro el Evento");
	}
	
	public Funcion traerFuncion(long id) throws Exception{
		Funcion funcion = null;
		boolean localizado=false;
		int p=0;
		while(p<funciones.size()&&!localizado) {
			funcion=funciones.get(p);
			if(funcion.getId()==id) {
				localizado=true;
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro la Funcion");
		return funcion;
	}
	
	public void agregarTarifa(double precioSector, Sector sector) {
		Tarifa tarifa = new Tarifa(precioSector,sector);
		tarifas.add(tarifa);
	}
	
	public int ubicacionesLibresAuditorio(long idAuditorio) throws Exception{
		int reporte=0;
		for(int i=0;i<funciones.size();i++) {
			if(funciones.get(i).getAuditorio().getId()==idAuditorio) {
				reporte=reporte+funciones.get(i).ubicacionesLibres();
			}
		}
		if(reporte==0) throw new Exception ("Error: Este evento no se desarrollo en ese auditorio");
		return reporte;
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
