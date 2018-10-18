package ticketUNLa;

public class Butaca {
	private int posicionX;
	private int posicionY;
	private boolean Ocupado;

	public Butaca(int posicionX, int posicionY, boolean ocupado) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		Ocupado = ocupado;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	public boolean isOcupado() {
		return Ocupado;
	}
	public void setOcupado(boolean ocupado) {
		Ocupado = ocupado;
	}
	@Override
	public String toString() {
		return "\nButaca [posicionX=" + posicionX + ", posicionY=" + posicionY + ", Ocupado=" + Ocupado + "]";
	}
}
