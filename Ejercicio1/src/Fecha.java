public class Fecha {
    private int dia;
    private int mes;
    private int año;
     /**
     * constructor para definir la fecha
     * 
     * @param dia día 
     * @param mes mes 
     * @param año año
     */
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
     /**
     * es el método para obtener una representación en cadena de la fecha
     *
     * @return fecha en el formato dd/mm/aaaa
     */
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;  
    }
}