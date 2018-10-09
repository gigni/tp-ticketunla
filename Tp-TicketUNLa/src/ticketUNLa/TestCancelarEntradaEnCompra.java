package ticketUNLa;

public class TestCancelarEntradaEnCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra compra = new Compra();
		Entrada entrada1 = new Entrada(1,400,"pullman");
		Entrada entrada2 = new Entrada(2,1000,"palco");
		compra.listaEntradas.add(entrada1);
		compra.listaEntradas.add(entrada2);
		for(int p=0;p<compra.listaEntradas.size();p++) {
		System.out.println(compra.listaEntradas.get(p));
		}
		//Voy a cancelar entrada1 en este caso
		compra.listaEntradas.remove(entrada1);
		System.out.println("################################################");
		for(int p=0;p<compra.listaEntradas.size();p++) {
			System.out.println(compra.listaEntradas.get(p));
			}
	}

}
