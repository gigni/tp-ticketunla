package ticketUNLa;
import java.util.ArrayList;
import java.util.List;
import ticketUNLa.Entrada;

public class Compra {
	private List<Entrada> entradas = new ArrayList<Entrada>();
	private Cliente cliente;
	private long id;
	

	public Compra(long id, Cliente cliente) {
		this.id = id;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(List<Entrada> entradas) {
		this.entradas = entradas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public void agregarEntrada(Evento evento,Cliente cliente, int funcionNumero, String nombreSector, boolean esNumerado, int posicionX, int posicionY) throws Exception {
		long id=-1;
		if(entradas.isEmpty()) id=1;
		else id=entradas.get(entradas.size()-1).getId()+1;
		Entrada entrada = new Entrada(id,evento,cliente,funcionNumero,nombreSector,esNumerado,posicionX,posicionY);
		entrada.setValorFinalEntrada(cliente,evento.getDescuento() , nombreSector);
		entradas.add(entrada);
	}
	
	public void eliminarEntrada(long id) throws Exception {
		boolean localizado=false;
		int p=0;
		while(p<this.entradas.size()&&!localizado) {
			if(entradas.get(p).getId()==id) { 
				entradas.get(p).quitarReserva();
				entradas.remove(p);
				
			}
			p++;
		}
		
	}
	

	@Override
	public String toString() {
		return "Compra: cliente=" + cliente+" Entradas:"+ entradas;
	}
}
