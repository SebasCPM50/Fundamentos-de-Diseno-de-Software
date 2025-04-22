package bancoo;

public class CuentaAhorro extends Cuenta {
	
    private String fechaUltimoRetiro;
    private double valorUltimoRetiro;
    
    
	public CuentaAhorro(int numeroProducto, int añoApertura, Titular titular, double saldo, String fechaUltimoRetiro,
			double valorUltimoRetiro) {
		super(numeroProducto, añoApertura, titular, saldo);
		this.fechaUltimoRetiro = fechaUltimoRetiro;
		this.valorUltimoRetiro = valorUltimoRetiro;
	}
    
    public String getTipo() {
        return "Cuenta Ahorro";
    }

    public String mostrarDetalles() {
        return getTipo() + " - " + numeroProducto + " - " + titular.getNombre() + " - " + fechaUltimoRetiro + " - " + valorUltimoRetiro;
    }    

}
