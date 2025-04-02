package ejerciciobanco;

public class Ahorro extends Cuenta{
	private int interes;

	/**
	 * @param numero
	 * @param saldo
	 * @param titular
	 * @param interes
	 */
	public Ahorro(int numero, long saldo, Persona titular, int interes) {
		super(numero, saldo, titular);
		this.interes = interes;
	}

	/**
	 * @return the interes
	 */
	public int getInteres() {
		return interes;
	}

	/**
	 * @param interes the interes to set
	 */
	public void setInteres(int interes) {
		this.interes = interes;
	}

	@Override
	public String toString() {
		return super.toString() + "El interes es:" + interes;
	}
	
}
