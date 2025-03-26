public class Tipo {
    private boolean tipo;
    private double iva; 

     /**
     * es el constructor que define el tipo de producto y el iva del mismo
     * 
     * @param tipo true si es perecedero, false si no es perecedero
     */
    public Tipo(boolean tipo) {
        this.tipo = tipo;
        this.iva = tipo ? 0.19 : 0.10;
    }
     /**
     * indica si el producto es perecedero o no
     * 
     * @return true si es perecedero, false si no lo es
     */
    public boolean isTipo() {
        return tipo;
    }
     /**
     * obtiene el valor del iva aplicado al producto
     * 
     * @return el porcentaje de iva aplicado
     */
    public double getIva() {
        return iva;
    }
     /**
     * es la representación en cadena del tipo de producto
     * 
     * @return perecedero o no perecedero según el tipo
     */
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