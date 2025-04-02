package ejerciciobanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cuenta> listaCuentas =new ArrayList<>();
		
		
		Persona humano =new Persona(1098329, "Acercandro");
		
        // Crear cuentas
        Cuenta ahorro = new Ahorro(12345, 50000, humano, 5);
        Cuenta corriente = new Corriente(67890, 20000, humano, 10000);

        // Agregar cuentas a la lista
        listaCuentas.add(ahorro);
        listaCuentas.add(corriente);

        // Imprimir cuentas
        for (Cuenta cuenta : listaCuentas) {
            System.out.println(cuenta);
        }
        
        
	}
	
}
