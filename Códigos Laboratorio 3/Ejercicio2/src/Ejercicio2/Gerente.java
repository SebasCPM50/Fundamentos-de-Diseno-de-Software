package Ejercicio2;

public class Gerente extends Empleado{
	
	private double bono;

	public Gerente(int id, String nombre, double salario, double bono) {
		super(id, nombre, salario);
		this.bono = bono;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salario + bono ;
	}
	
	

}
