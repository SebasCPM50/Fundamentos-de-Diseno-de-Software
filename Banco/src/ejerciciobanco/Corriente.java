package ejerciciobanco;

public class Corriente extends Cuenta{
	private int sobregiro;

	/**
	 * @param numero
	 * @param saldo
	 * @param titular
	 * @param sobregiro
	 */
	public Corriente(int numero, long saldo, Persona titular, int sobregiro) {
		super(numero, saldo, titular);
		this.sobregiro = sobregiro;
	}

	/**
	 * @return the sobregiro
	 */
	public int getSobregiro() {
		return sobregiro;
	}

	/**
	 * @param sobregiro the sobregiro to set
	 */
	public void setSobregiro(int sobregiro) {
		this.sobregiro = sobregiro;
	}

	@Override
	public String toString() {
		return super.toString() + "Sobregiro=" + sobregiro;
	}
	
}
