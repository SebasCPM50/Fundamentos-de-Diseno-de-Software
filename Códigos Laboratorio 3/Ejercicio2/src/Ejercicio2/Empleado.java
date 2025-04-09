package Ejercicio2;

public abstract class Empleado {
	
	protected int id;
	protected String nombre;
	protected double salario;
	
	
	public Empleado(int id, String nombre, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public abstract double calcularSalario();

	@Override
	public String toString() {
		return "Empleado:" + id + ", Nombre:" + nombre + ", Salario:" + salario;
	}
	
}
	
