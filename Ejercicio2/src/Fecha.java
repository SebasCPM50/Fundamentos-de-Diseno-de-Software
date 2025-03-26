import java.time.LocalDate;

public class Fecha {
    private LocalDate fecha;

    public Fecha(int dia, int mes, int año) {
        this.fecha = LocalDate.of(año, mes, dia);
    }

    public Fecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDia() {
        return this.fecha.getDayOfMonth();
    }

    public int getMes() {
        return this.fecha.getMonthValue();
    }

    public int getAño() {
        return this.fecha.getYear();
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(int dia, int mes, int año) {
        this.fecha = LocalDate.of(año, mes, dia);
    }

    @Override
    public String toString() {
        return this.fecha.toString();
    }
}