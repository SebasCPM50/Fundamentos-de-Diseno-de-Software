package banco;

public class CuentaVivienda extends Cuenta implements IDepositable {
	
	private double precioVivienda;
	private String tipoVIvienda;
	
	public CuentaVivienda(int numProducto, int añoApertura, Titular titular, double saldo, double precioVivienda) {
		super(numProducto, añoApertura, titular);
	}
	
	@Override
	public void deposito(int valor) {
		System.out.println("Deposito de la cuenta Vivienda: ");
		
	}
	
	
}
