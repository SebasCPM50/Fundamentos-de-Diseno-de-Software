import java.time.LocalDate;

public class Fecha {
    private LocalDate fecha;

    /**
     * es el constructor de la clase Fecha
     * 
     * @param dia  el día de la fecha (1-31)
     * @param mes  el mes de la fecha (1-12)
     * @param año  el año de la fecha
     */
    public Fecha(int dia, int mes, int año) {
        this.fecha = LocalDate.of(año, mes, dia);
    }

    /**
     * es el método para obtener la fecha almacenada
     * 
     * @return a la fecha como un objeto LocalDate
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * es el método para establecer una nueva fecha
     * 
     * @param dia  el nuevo día de la fecha del 1-31
     * @param mes  el nuevo mes de la fecha del 1-12
     * @param año  el nuevo año de la fecha
     */
    public void setFecha(int dia, int mes, int año) {
        this.fecha = LocalDate.of(año, mes, dia);
    }

    /**
     * es el método toString para representar la fecha en formato de cadena de texto
     * 
     * @return a la representación de la fecha en formato ISO
     */
    @Override
    public String toString() {
        return fecha.toString();
    }
}