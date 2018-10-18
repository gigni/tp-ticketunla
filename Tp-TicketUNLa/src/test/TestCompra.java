package test;
import ticketUNLa.Compra;
import ticketUNLa.Entrada;

public class TestCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra compra = new Compra();
		Entrada entrada1 = new Entrada(1,400,"pullman");
		Entrada entrada2 = new Entrada(2,1000,"palco");
		compra.getListaEntradas().add(entrada1);
		compra.getListaEntradas().add(entrada2);
		for(int p=0;p<compra.getListaEntradas().size();p++) {
		System.out.println(compra.getListaEntradas().get(p));
		}

	}

}
