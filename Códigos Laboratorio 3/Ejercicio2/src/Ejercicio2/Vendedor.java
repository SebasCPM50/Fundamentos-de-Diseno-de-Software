package Ejercicio2;

public class Vendedor extends Empleado{
	
	private int totalVentas;

	public Vendedor(int id, String nombre, double salario, int totalVentas) {
		super(id, nombre, salario);
		this.totalVentas = totalVentas;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salario + (0.05 * totalVentas);
	}

	

}
