package banco;

public class Cuenta {
	
	protected int numProducto;
	protected int añoApertura;
	protected Titular titular;
	protected double saldo;
	
	public Cuenta(int numProducto, int añoApertura, Titular titular) {
		super();
		this.numProducto = numProducto;
		this.añoApertura = añoApertura;
		this.titular = titular;
		
	}

	public int getNumProducto() {
		return numProducto;
	}

	public void setNumProducto(int numProducto) {
		this.numProducto = numProducto;
	}

	public int getAñoApertura() {
		return añoApertura;
	}

	public void setAñoApertura(int añoApertura) {
		this.añoApertura = añoApertura;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
