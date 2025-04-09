package Ejercicio2;

import java.util.*;

public class AppEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List <Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		Vendedor Vendedor1 = new Vendedor(2187281, "Pepito", 1250000, 300000);
		Gerente Gerente1 = new Gerente(21897219, "Carlos", 2250000, 250000);
		
		listaEmpleados.add(Vendedor1);
		listaEmpleados.add(Gerente1);
		 
		for (Empleado empleado : listaEmpleados) {
			System.out.println (empleado);
			 System.out.println("Salario total calculado: $" + empleado.calcularSalario());
		}
		
	}

}
