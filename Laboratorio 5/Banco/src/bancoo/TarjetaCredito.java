package bancoo;

public class TarjetaCredito extends Cuenta{
	
	private double cupo;
    private String fechaUltimaCompra;
    private double valorUltimaCompra;
    
	public TarjetaCredito(int numeroProducto, int añoApertura, Titular titular, double saldo, double cupo,
			String fechaUltimaCompra, double valorUltimaCompra) {
		super(numeroProducto, añoApertura, titular, saldo);
		this.cupo = cupo;
		this.fechaUltimaCompra = fechaUltimaCompra;
		this.valorUltimaCompra = valorUltimaCompra;
	}
    
    public String getTipo() {
        return "Tarjeta Crédito";
    }

    public String mostrarDetalles() {
        return getTipo() + " - " + numeroProducto + " - " + añoApertura + " - " + titular.getNombre() + " - " + saldo;
    }

	public double getCupo() {
		return cupo;
	}

	public void setCupo(double cupo) {
		this.cupo = cupo;
	}

	public String getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}

	public void setFechaUltimaCompra(String fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}

	public double getValorUltimaCompra() {
		return valorUltimaCompra;
	}

	public void setValorUltimaCompra(double valorUltimaCompra) {
		this.valorUltimaCompra = valorUltimaCompra;
	}    
    

    
}
