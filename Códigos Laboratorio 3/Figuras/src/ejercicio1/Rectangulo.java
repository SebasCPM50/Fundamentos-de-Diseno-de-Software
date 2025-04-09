package ejercicio1;

public class Rectangulo extends Figura{
	
	private double base;
	private double altura;
	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}
	
	@Override
	double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (base + altura);
	}

	@Override
	public String toString() {
		return "Área del Rectangulo: " + calcularArea() + ", Perímetro del Rectangulo: " + calcularPerimetro();
	}


}