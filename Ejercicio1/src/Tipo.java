public class Tipo {
    private boolean tipo;
    private double iva; 

    public Tipo(boolean tipo, double iva) {
        this.tipo = tipo;
        this.iva = iva;
    }

    public boolean isTipo() {
        return tipo;
    }

    public double getIva() {
        return iva;
    }

    @Override
    public String toString() {

        /*if(tipo)
            return "Perecedro";
        else
            return "No perecedro";
        */

        return (tipo ? "Perecedero" : "No Perecedero");
    }
}