package bancoo;

public abstract class Cuenta {
	
	protected int numeroProducto;
    protected int añoApertura;
    protected Titular titular;
    protected double saldo;
    
	public Cuenta(int numeroProducto, int añoApertura, Titular titular, double saldo) {
		super();
		this.numeroProducto = numeroProducto;
		this.añoApertura = añoApertura;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumeroProducto() {
		return numeroProducto;
	}

	public void setNumeroProducto(int numeroProducto) {
		this.numeroProducto = numeroProducto;
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
  
	public void depositar(double valor) {
	    saldo += valor;
	}

	public void retirar(double valor) {
	    if (saldo >= valor) {
	            saldo -= valor;}
	}

	    public abstract String getTipo();
	    public abstract String mostrarDetalles();
}
