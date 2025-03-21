public class Tipo {
    private boolean perecedero;
    private double iva; 

    public Tipo(boolean perecedero, double iva) {
        this.perecedero = perecedero;
        this.iva = iva;
    }

    public boolean esPerecedero() {
        return perecedero;
    }

    public double getIva() {
        return iva;
    }

    @Override
    public String toString() {
        return (perecedero ? "Perecedero" : "No Perecedero") + ", IVA: " + iva;
    }
}