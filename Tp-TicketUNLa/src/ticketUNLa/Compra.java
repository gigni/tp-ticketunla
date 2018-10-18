package ticketUNLa;
import java.util.ArrayList;
import java.util.List;
import ticketUNLa.Entrada;

public class Compra {
	private List<Entrada> listaEntradas = new ArrayList<Entrada>();

	public List<Entrada> getListaEntradas() {
		return listaEntradas;
	}

	public void setListaEntradas(List<Entrada> listaEntradas) {
		this.listaEntradas = listaEntradas;
	}
}
