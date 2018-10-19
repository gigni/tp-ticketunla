package ticketUNLa;
import java.util.ArrayList;
import java.util.List;
import ticketUNLa.Entrada;

public class Compra {
	private List<Entrada> listaEntradas = new ArrayList<Entrada>();
	private Usuario usuario;
	

	public Compra(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Entrada> getListaEntradas() {
		return listaEntradas;
	}

	public void setListaEntradas(List<Entrada> listaEntradas) {
		this.listaEntradas = listaEntradas;
	}

	@Override
	public String toString() {
		return "Compra [listaEntradas=" + listaEntradas + ", usuario=" + usuario + "]";
	}
}
