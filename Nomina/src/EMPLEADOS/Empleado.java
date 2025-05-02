package EMPLEADOS;

public abstract class Empleado {
	
	 protected int id;
	 protected String nombre;
	 protected int edad;
	 protected int añoIngreso;
	 protected double salarioBasico;
	 
	 
	public Empleado(int id, String nombre, int edad, int añoIngreso, double salarioBasico) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.añoIngreso = añoIngreso;
		this.salarioBasico = salarioBasico;
	}
	 
	public abstract double liquidarNomina();
	
	
	
}
