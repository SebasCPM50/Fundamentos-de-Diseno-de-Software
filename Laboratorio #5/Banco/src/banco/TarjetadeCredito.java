package banco;

public class TarjetadeCredito extends Cuenta implements IDepositable {
	
	private int cupo;
	private String fechaUltimaCompra;
	private String valorUltimaCompra;
	
	public TarjetadeCredito(int numProducto, int añoApertura, Titular titular, double saldo, int cupo) {
		super(numProducto, añoApertura, titular);
		this.cupo = cupo;
	}

	@Override
	public void deposito(int valor) {
		System.out.println("Deposito de la Tarjeta de Crédito: ");
		
	}
	
	
}
