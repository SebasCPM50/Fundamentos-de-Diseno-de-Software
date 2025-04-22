package bancoo;

public class CuentaVivienda extends Cuenta {
	
    private double precioVivienda;
    private String tipoVivienda;

    public CuentaVivienda(int numero, int año, Titular titular, double saldo, double precio, String tipo) {
        super(numero, año, titular, saldo);
        this.setPrecioVivienda(precio);
        this.setTipoVivienda(tipo);
    }

    public String getTipo() {
        return "Cuenta Vivienda";
    }

    public String mostrarDetalles() {
        return getTipo() + " - " + numeroProducto + " - " + añoApertura + " - " + titular.getNombre() + " - " + saldo;
    }

	public double getPrecioVivienda() {
		return precioVivienda;
	}

	public void setPrecioVivienda(double precioVivienda) {
		this.precioVivienda = precioVivienda;
	}

	public String getTipoVivienda() {
		return tipoVivienda;
	}

	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}	
}
