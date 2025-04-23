package banco;

import java.time.LocalDate;

public class CuentaCorriente extends Cuenta implements IDepositable, IRetirable{
	
	private LocalDate fechaUltimoMovimiento;
	private double valor;
	private String tipoOperacion;
	
	public CuentaCorriente(int numProducto, int añoApertura, Titular titular) {
		super(numProducto, añoApertura, titular);
	}

	
	@Override
	public void retiro(int valor) {
		if (valor > saldo){
			System.out.println("No es posible realizar el retiro. Saldo Insuficiente.");	
			} else {
			this.saldo -= valor;
			this.fechaUltimoMovimiento = LocalDate.now();
			}
	}

	@Override
	public void deposito(int valor) {
		this.saldo += valor;
		
	}
	
}
