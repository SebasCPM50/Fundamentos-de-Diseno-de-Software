package ejerciciobanco;

public class Cuenta {
	protected int numero;
	protected long saldo;
	protected Persona titular;
	/**
	 * @param numero
	 * @param saldo
	 * @param titular
	 */
	public Cuenta(int numero, long saldo, Persona titular) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the saldo
	 */
	public long getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the titular
	 */
	public Persona getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	@Override
	public String toString() {
		return "El numero de cuenta es" + numero + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
}
