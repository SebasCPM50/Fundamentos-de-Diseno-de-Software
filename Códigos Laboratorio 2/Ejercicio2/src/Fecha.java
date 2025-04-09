import java.time.LocalDate;

public class Fecha {
    private LocalDate fecha;

    /**
     * es el constructor que crea una fecha con día, mes y año
     *
     * @param dia día
     * @param mes mes
     * @param año año
     */
    public Fecha(int dia, int mes, int año) {
        this.fecha = LocalDate.of(año, mes, dia);
    }
    
    /**
     * es el constructor que inicia una fecha con un objeto LocalDate
     *
     * @param fecha es el objeto LocalDate que representa la fecha
     */
    public Fecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * es el método para obtener el día de la fecha
     *
     * @return Día (1 - 31)
     */
    public int getDia() {
        return this.fecha.getDayOfMonth();
    }

    /**
     * es el método para obtener el mes de la fecha
     *
     * @return Mes (1 - 12)
     */
    public int getMes() {
        return this.fecha.getMonthValue();
    }

    /**
     * es el método para obtener el año de la fecha
     *
     * @return Año (XXXX)
     */
    public int getAño() {
        return this.fecha.getYear();
    }

        /**
     * es el método para obtener la fecha como un objeto LocalDate
     *
     * @return la fecha completa
     */
    public LocalDate getFecha() {
        return this.fecha;
    }

    /**
     * es el método para establecer una nueva fecha a partir de día, mes y año
     *
     * @param dia nuevo día 
     * @param mes nuevo mes
     * @param año nuevo año
     */
    public void setFecha(int dia, int mes, int año) {
        this.fecha = LocalDate.of(año, mes, dia);
    }

     /**
     * es la representación en cadena de la fecha en formato (yyyy-MM-dd).
     *
     * @return a una cadena de texto con la fecha formateada
     */
    @Override
    public String toString() {
        return this.fecha.toString();
    }
}