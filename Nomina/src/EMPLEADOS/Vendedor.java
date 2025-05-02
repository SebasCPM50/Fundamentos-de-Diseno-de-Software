package EMPLEADOS;

public class Vendedor extends Empleado {
	
	private double totalVentas;

	public Vendedor(int id, String nombre, int edad, int añoIngreso, double salarioBasico, double totalVentas) {
		super(id, nombre, edad, añoIngreso, salarioBasico);
		this.totalVentas = totalVentas;
	}

	@Override
	public double liquidarNomina() {
		
		if (this.añoIngreso > 20) {
			
		return ((this.salarioBasico + 100000) + (totalVentas * 0.15)) - 0.10;
		}
		
		return (this.salarioBasico + (totalVentas * 0.15)) - 0.10;
	}
	
}
