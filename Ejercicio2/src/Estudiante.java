import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String codigoEstudiante;
    private int identificacion;
    private NombreCompleto nombre;
    private Fecha fechaNacimiento;
    private Programa programaAcademico;
    private List<Inscripcion> inscripciones;

    public Estudiante(String codigoEstudiante, int identificacion, NombreCompleto nombre, Fecha fechaNacimiento, Programa programaAcademico) {
        this.codigoEstudiante = codigoEstudiante;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.programaAcademico = programaAcademico;
        this.inscripciones = new ArrayList<>();
    }

    public void inscribirProyecto(Fecha fecha, Proyecto proyecto) {
        Inscripcion inscripcion = new Inscripcion(fecha, proyecto);
        inscripciones.add(inscripcion);
    }

    public List<Inscripcion> obtenerInscripciones() {
        return inscripciones;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public NombreCompleto getNombre() {
        return nombre;
    }

    public void setNombre(NombreCompleto nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Programa getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(Programa programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    @Override
    public String toString() {
        return codigoEstudiante + " - " + nombre + ", Programa: " + programaAcademico;
    }

    public static void main(String[] args) {
        NombreCompleto nombreEstudiante = new NombreCompleto("Dylan", "Torres");
        Fecha fechaNacimiento = new Fecha(17, 6, 2006);
        Programa programaEstudiante = new Programa(101, "Ciencias de la Computación e Inteligencia Artificial", "Facultad de Ciencias Exactas e Ingeniería");
        Estudiante estudiante = new Estudiante("F60", 123456789, nombreEstudiante, fechaNacimiento, programaEstudiante);

        Proyecto proyecto1 = new Proyecto("Proyecto A", "Fundamentos de Diseño de Software");
        Fecha fechaInscripcion1 = new Fecha(10, 6, 2025);
        estudiante.inscribirProyecto(fechaInscripcion1, proyecto1);

        Proyecto proyecto2 = new Proyecto("Proyecto B", "Cibernética y Sistemas Inteligentes");
        Fecha fechaInscripcion2 = new Fecha(15, 6, 2025);
        estudiante.inscribirProyecto(fechaInscripcion2, proyecto2);

        System.out.println(estudiante);
        System.out.println("Inscripciones:");
        List<Inscripcion> inscripciones = estudiante.obtenerInscripciones();
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println(inscripcion);
        }
    }
}