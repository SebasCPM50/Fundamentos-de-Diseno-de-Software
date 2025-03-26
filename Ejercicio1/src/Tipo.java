public class Tipo {
    private boolean tipo;
    private double iva; 

    public Tipo(boolean tipo) {
        this.tipo = tipo;
        this.iva = tipo ? 0.19 : 0.10;
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