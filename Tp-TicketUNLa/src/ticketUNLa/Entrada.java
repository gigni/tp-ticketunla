package ticketUNLa;

public class Entrada {
	
	private int numeroEntrada;
	private double valorfinalEntrada;
	private String ubicacionSeleccionada;
	
	public Entrada(int numeroEntrada, double valorfinalEntrada, String ubicacionSeleccionada) {
		this.numeroEntrada = numeroEntrada;
		this.valorfinalEntrada = valorfinalEntrada;
		this.ubicacionSeleccionada = ubicacionSeleccionada;
	}

	public int getNumeroEntrada() {
		return numeroEntrada;
	}

	public void setNumeroEntrada(int numeroEntrada) {
		this.numeroEntrada = numeroEntrada;
	}

	public double getValorfinalEntrada() {
		return valorfinalEntrada;
	}

	public void setValorfinalEntrada(double valorfinalEntrada) {
		this.valorfinalEntrada = valorfinalEntrada;
	}

	public String getUbicacionSeleccionada() {
		return ubicacionSeleccionada;
	}

	public void setUbicacionSeleccionada(String ubicacionSeleccionada) {
		this.ubicacionSeleccionada = ubicacionSeleccionada;
	}

	@Override
	public String toString() {
		return "Entrada [numeroEntrada=" + numeroEntrada + ", valorfinalEntrada=" + valorfinalEntrada
				+ ", ubicacionSeleccionada=" + ubicacionSeleccionada + "]";
	}

	
	
//public String imprimirTicket() {//agregar cantidad de tikets comprada por un usuario y usarlo para imprimir distintas partes de la lista
	
	
//}
}