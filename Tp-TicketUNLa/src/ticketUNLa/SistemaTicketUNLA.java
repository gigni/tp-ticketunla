package ticketUNLa;
import java.util.List;
import java.util.ArrayList;

public class SistemaTicketUNLA {
	List<Usuario>listaUsuario = new ArrayList<Usuario>();
	List<Compra>listaCompras = new ArrayList<Compra>();
	List<Evento>listaEventos = new ArrayList<Evento>();
	List<Auditorio>listaAuditorios = new ArrayList<Auditorio>();
	List<Funcion>listaFunciones = new ArrayList<Funcion>();
	
	public SistemaTicketUNLA(List<Usuario> listaUsuario, List<Compra> listaCompras, List<Evento> listaEventos,
			List<Auditorio> listaAuditorios, List<Funcion> listaFunciones) {
		this.listaUsuario = listaUsuario;
		this.listaCompras = listaCompras;
		this.listaEventos = listaEventos;
		this.listaAuditorios = listaAuditorios;
		this.listaFunciones = listaFunciones;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public List<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public List<Evento> getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(List<Evento> listaEventos) {
		this.listaEventos = listaEventos;
	}

	public List<Auditorio> getListaAuditorios() {
		return listaAuditorios;
	}

	public void setListaAuditorios(List<Auditorio> listaAuditorios) {
		this.listaAuditorios = listaAuditorios;
	}

	public List<Funcion> getListaFunciones() {
		return listaFunciones;
	}

	public void setListaFunciones(List<Funcion> listaFunciones) {
		this.listaFunciones = listaFunciones;
	}
}
