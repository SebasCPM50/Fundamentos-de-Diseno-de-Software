package ejercicio1;



public class Circulo extends Figura {
	
	private double radio;

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radio;
	}
	
	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radio, 2);
	}
	
	@Override
	public String toString() {
		return "Área del Círculo: " + calcularArea() + ", Perímetro del Círculo: " + calcularPerimetro();
	}	
	
}