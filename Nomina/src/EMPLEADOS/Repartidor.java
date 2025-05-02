package EMPLEADOS;

public class Repartidor extends Empleado{
	
	private char zona;
	private int numRepartos;
	
	public Repartidor(int id, String nombre, int edad, int añoIngreso, double salarioBasico, char zona,
			int numRepartos) {
		super(id, nombre, edad, añoIngreso, salarioBasico);
		this.zona = zona;
		this.numRepartos = numRepartos;
	}
	
	public char combrobarZona() {
		
		if (zona == 'A' || zona == 'B' || zona == 'C' || zona == 'D') {
	            return zona;
	        } else {
	        	
	            return 'C';
	        }
	    }
				 
	@Override
	public double liquidarNomina() {
		
		double totalRepartos = numRepartos * 10000;
	    double total = salarioBasico + totalRepartos;

	    if ((2025 - this.añoIngreso) >= 5 && zona == 'C') {
	            total += 50000;
	    }

	    return total - (total * 0.10);
	}
	
}
