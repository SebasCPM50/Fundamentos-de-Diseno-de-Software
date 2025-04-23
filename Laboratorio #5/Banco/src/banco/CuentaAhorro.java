package banco;

import java.time.LocalDate;

public class CuentaAhorro extends Cuenta implements IDepositable, IRetirable{
	
	private LocalDate fechaUltimoRetiro;
	private double valorUltimoRetiro;
	
	public CuentaAhorro(int numProducto, int añoApertura, Titular titular) {
		super(numProducto, añoApertura, titular);
		
	}

	@Override
	public void retiro(int valor) {
		if (valor > saldo){
		System.out.println("No es posible realizar el retiro. Saldo Insuficiente.");	
		}else {
		this.saldo -= valor;
		this.fechaUltimoRetiro = LocalDate.now();
		this.valorUltimoRetiro =  valor;
		}
	}

	@Override
	public void deposito(int valor) {
		this.saldo += valor;
		
	}

	@Override
	public String toString() {
		return "La fecha del último retiro es: " + fechaUltimoRetiro + "El valor del último retiro es: " + valorUltimoRetiro + "Valor del deposito: " + saldo;
	}
		
}
