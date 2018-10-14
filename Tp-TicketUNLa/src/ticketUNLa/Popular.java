package ticketUNLa;

public class Popular {
	private int cantidadMaxima;

	public Popular(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	@Override
	public String toString() {
		return "Popular [cantidadMaxima=" + cantidadMaxima + "]";
	}
}
