package bancoo;

public class CuentaCorriente extends Cuenta{
	
	private String fechaUltimoMovimiento;
	private double valor;
	private String tipoOperacion;
	
	public CuentaCorriente(int numeroProducto, int añoApertura, Titular titular, double saldo,
			String fechaUltimoMovimiento, double valor, String tipoOperacion) {
		super(numeroProducto, añoApertura, titular, saldo);
		this.fechaUltimoMovimiento = fechaUltimoMovimiento;
		this.valor = valor;
		this.tipoOperacion = tipoOperacion;
	}	

    public String getTipo() {
        return "Cuenta Corriente";
    }

    public String mostrarDetalles() {
        return getTipo() + " - " + numeroProducto + " - " + añoApertura + " - " + titular.getNombre() + " - " + saldo;
    }

	public String getFechaUltimoMovimiento() {
		return fechaUltimoMovimiento;
	}

	public void setFechaUltimoMovimiento(String fechaUltimoMovimiento) {
		this.fechaUltimoMovimiento = fechaUltimoMovimiento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}	
	
}
