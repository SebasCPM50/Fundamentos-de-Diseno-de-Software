package ejercicio1;

import java.util.*;

public class AppFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	List<Figura> listaFiguras = new ArrayList<>();
	
	Circulo circulo= new Circulo(4.8);
	Triangulo triangulo= new Triangulo(5, 7.5, 5);
	Rectangulo rectangulo= new Rectangulo(12.2, 7);
	
	listaFiguras.add(circulo);
	listaFiguras.add(triangulo);
	listaFiguras.add(rectangulo);
	
	for (Figura figura : listaFiguras) {
		System.out.println(figura);
	}
}

}