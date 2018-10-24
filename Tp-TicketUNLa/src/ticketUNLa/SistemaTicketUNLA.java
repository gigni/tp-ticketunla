package ticketUNLa;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class SistemaTicketUNLA {
	List<Cliente>clientes = new ArrayList<Cliente>();
	List<Compra>compras = new ArrayList<Compra>();
	List<Evento>eventos = new ArrayList<Evento>();
	List<Auditorio>auditorios = new ArrayList<Auditorio>();
	List<Funcion>funciones = new ArrayList<Funcion>();
	TipoDescuento descuento;
	
	public SistemaTicketUNLA(List<Cliente> clientes, List<Compra> compras, List<Evento> eventos,
			List<Auditorio> auditorios, List<Funcion> funciones) {
		this.clientes = clientes;
		this.compras = compras;
		this.eventos = eventos;
		this.auditorios = auditorios;
		this.funciones = funciones;
		descuento = new TipoDescuento(-1,-1);

	}
	
	public SistemaTicketUNLA() {
		descuento = new TipoDescuento(-1,-1);
	}
	
	public void setDescuento(double descuentoEstudiante, double descuentoJubilado) {
		this.descuento.setDescuentoEstudiante(descuentoEstudiante);
		this.descuento.setDescuentoJubilado(descuentoJubilado);
	}
	
	public TipoDescuento getDescuento() {
		return descuento;
	}

	public List<Cliente> getclientes() {
		return clientes;
	}

	public void setclientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Compra> getcompras() {
		return compras;
	}

	public void setcompras(List<Compra> compras) {
		this.compras = compras;
	}

	public List<Evento> geteventos() {
		return eventos;
	}

	public void seteventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public List<Auditorio> getauditorios() {
		return auditorios;
	}

	public void setauditorios(List<Auditorio> auditorios) {
		this.auditorios = auditorios;
	}

	public List<Funcion> getfunciones() {
		return funciones;
	}

	public void setfunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}
	
	public void agregarCliente(int dni, String nombre, String apellido, GregorianCalendar nacimiento, boolean esEstudiante, boolean esJubilado) {
		long id=-1;
		if(clientes.isEmpty()) id=1;
		else id=clientes.get(clientes.size()-1).getId()+1;
		Cliente cliente = new Cliente(id, dni, apellido, apellido, nacimiento, esEstudiante, esJubilado);
		clientes.add(cliente);
	}
	
	public void modificarCliente(long id, int dni, String nombre, String apellido, GregorianCalendar nacimiento, boolean esEstudiante, boolean esJubilado) throws Exception {	//A partir del id modifico los demas datos del Cliente. Id es lo unico no permito modifcar
		boolean localizado=false;
		int p=0;
		while(p<clientes.size()&&localizado==false) {
			Cliente cliente=clientes.get(p);
			if(cliente.getId()==id) {
				localizado=true;
				cliente.setDni(dni);
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setNacimiento(nacimiento);
				cliente.setEstudiante(esEstudiante);
				cliente.setJubilado(esJubilado);
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro el Cliente");
	}
	
	public void eliminarCliente (long id) throws Exception {
		boolean localizado=false;
		int p=0;
		while(p<clientes.size()&&localizado==false) {
			Cliente cliente=clientes.get(p);
			if(cliente.getId()==id) {
				clientes.remove(p);
				localizado=true;
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro el Cliente");
	}
	
	public Cliente buscarCliente(long id) throws Exception {
		Cliente cliente = null;
		boolean localizado=false;
		int p=0;
		while(p<clientes.size()&&localizado==false) {
			cliente=clientes.get(p);
			if(cliente.getId()==id) {
				localizado=true;
				cliente=clientes.get(p);
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro el Cliente");
		return cliente;
	}
	
	public void agregarCompra (Cliente cliente) {
		long id=-1;
		if(compras.isEmpty()) id=1;
		else id=compras.get(compras.size()-1).getId()+1;
		Compra compra = new Compra(id,cliente);
		compras.add(compra);
	}
	
	public void eliminarCompra(long id) throws Exception {
		boolean localizado=false;
		int p=0;
		while(p<compras.size()&&localizado==false) {
			Compra compra=compras.get(p);
			if(compra.getId()==id) {
				compras.remove(p);
				localizado=true;
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro la Compra");
	}
	
	public Compra buscarCompra(long id) throws Exception{
		Compra compra=null;
		boolean localizado=false;
		int p=0;
		while(p<compras.size()&&localizado==false) {
			compra=compras.get(p);
			if(compra.getId()==id) {
				localizado=true;
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro la Compra");
		return compra;
	}
	
	public void agregarAuditorio(String nombre, String tipoAuditorio, String direccion) {
		long id=1;
		if(auditorios.isEmpty()) id=1;
		else id=auditorios.get(auditorios.size()-1).getId()+1;
		Auditorio auditorio = new Auditorio(id,nombre,tipoAuditorio,direccion);
		auditorios.add(auditorio);
	}
	
	public void modificarAuditorio(long id, String nombre, String tipoAuditorio, String direccion) throws Exception {
		boolean localizado=false;
		int p=0;
		while(p<auditorios.size()&&localizado==false) {
			Auditorio auditorio=auditorios.get(p);
			if(auditorio.getId()==id) {
				localizado=true;
				auditorio.setNombre(nombre);
				auditorio.setTipoAuditorio(tipoAuditorio);
				auditorio.setDireccion(direccion);
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro el Auditorio");
	}
	
	public void eliminarAuditorio(long id) throws Exception {
		boolean localizado=false;
		int p=0;
		while(p<auditorios.size()&&localizado==false) {
			Auditorio auditorio=auditorios.get(p);
			if(auditorio.getId()==id) {
				auditorios.remove(p);
				localizado=true;
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro el Auditorio");
	}
	
	public Auditorio buscarAuditorio(long id) throws Exception{
		Auditorio auditorio=null;
		boolean localizado=false;
		int p=0;
		while(p<auditorios.size()&&localizado==false) {
			auditorio=auditorios.get(p);
			if(auditorio.getId()==id) {
				localizado=true;
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encuntro el Auditorio");
		return auditorio;
	}
	
	public void agregarEvento(String nombre) {
		long id=-1;
		if(eventos.isEmpty()) id=1;
		else id=eventos.get(eventos.size()-1).getId()+1;
		Evento evento = new Evento(id,nombre);
		eventos.add(evento);
	}
	
	public void modificarEvento(long id, String nombre) throws Exception {
		boolean localizado=false;
		int p=0;
		while(p<eventos.size()&&localizado==false) {
			Evento evento=eventos.get(p);
			if(evento.getId()==id) {
				localizado=true;
				evento.setNombre(nombre);
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro el Evento");
	}
	
	public void eliminarEvento(long id) throws Exception {
		boolean localizado=false;
		int p=0;
		while(p<eventos.size()&&localizado==false) {
			Evento evento=eventos.get(p);
			if(evento.getId()==id) {
				localizado=true;
				eventos.remove(p);
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro el Evento");
	}
	
	public Evento buscarEvento(long id) throws Exception{
		Evento evento = null;
		boolean localizado=false;
		int p=0;
		while(p<eventos.size()&&localizado==false) {
			evento=eventos.get(p);
			if(evento.getId()==id) {
				localizado=true;
			}
			p++;
		}
		if(!localizado) throw new Exception("Error: No se encontro el Evento");
		return evento;
	}
	
	public String imprimirEventos() {
		String eventos="";
		for(int p=0;p<this.eventos.size();p++) {
			eventos=eventos+this.eventos.get(p).imprimirEvento();
		}
		
		return eventos;
	}
	
}
