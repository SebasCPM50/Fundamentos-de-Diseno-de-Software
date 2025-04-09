package ejercicio1;

public class Triangulo extends Figura{
	
		private double lado1;
		private double lado2;
		private double lado3;
		/**
		 * @param lado1
		 * @param lado2
		 * @param lado3
		 */
		public Triangulo(double lado1, double lado2, double lado3) {
			super();
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
		}
		
		public double calcularSemiperimetro() {
			
			return (lado1 + lado2 + lado3) / 2;
		}
		@Override
		double calcularArea() {
		// TODO Auto-generated method stub
		return Math.sqrt(calcularSemiperimetro() * (( calcularPerimetro() - lado1 ) * (calcularPerimetro() - lado2 ) * (calcularPerimetro() - lado3)));
		}
		
		@Override
		double calcularPerimetro() {
			// TODO Auto-generated method stub
			return (lado1 + lado2 + lado3);
		}

		@Override
		public String toString() {
			return "Semiperímetro del Triangulo: " + calcularSemiperimetro() + ", Área del Triangulo: "
					+ calcularArea() + ", Perímetro del Triangulo: " + calcularPerimetro();
		}

		
}