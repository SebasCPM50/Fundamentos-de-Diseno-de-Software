import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String codigoEstudiante;
    private int identificacion;
    private NombreCompleto nombre;
    private Fecha fechaNacimiento;
    private Programa programaAcademico;
    private List<Inscripcion> inscripciones;

    /**
     * es el constructor para crear al estudiante con sus atributos principales
     *
     * @param codigoEstudiante código del estudiante
     * @param identificacion número de identificación del estudiante
     * @param nombre nombre completo del estudiante
     * @param fechaNacimiento fecha de nacimiento del estudiante
     * @param programaAcademico programa académico del estudiante
     */
    public Estudiante(String codigoEstudiante, int identificacion, NombreCompleto nombre, Fecha fechaNacimiento, Programa programaAcademico) {
        this.codigoEstudiante = codigoEstudiante;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.programaAcademico = programaAcademico;
        this.inscripciones = new ArrayList<>();
    }

    /**
     * es el método para inscribir un estudiante en un proyecto
     *
     * @param fecha es la fecha de inscripción al proyecto
     * @param proyecto es el proyecto al que se inscribirá el estudiante
     */
    public void inscribirProyecto(Fecha fecha, Proyecto proyecto) {
        Inscripcion inscripcion = new Inscripcion(fecha, proyecto);
        inscripciones.add(inscripcion);
    }

    /**
     * es el método para obtener la lista de inscripciones del estudiante
     *
     * @return la lista de inscripciones
     */
    public List<Inscripcion> obtenerInscripciones() {
        return inscripciones;
    }

    /**
     * es el método para obtener el código del estudiante
     *
     * @return el código del estudiante
     */
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    /**
     * es el método para establecer un nuevo código para el estudiante
     *
     * @param codigoEstudiante el nuevo código del estudiante
     */
    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

     /**
     * es el método para obtener la identificación del estudiante
     *
     * @return el número de identificación del estudiante
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * es el método para establecer una nueva identificación para el estudiante
     *
     * @param identificacion nueva identificación del estudiante
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * es el método para obtener el nombre completo del estudiante
     *
     * @return le nombre del estudiante
     */
    public NombreCompleto getNombre() {
        return nombre;
    }

    /**
     * es el método para establecer un nuevo nombre para el estudiante
     *
     * @param nombre el nuevo nombre completo del estudiante
     */
    public void setNombre(NombreCompleto nombre) {
        this.nombre = nombre;
    }

    /**
     * es el método para obtener la fecha de nacimiento del estudiante
     *
     * @return la fecha de nacimiento del estudiante
     */
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * es el método para establecer una nueva fecha de nacimiento para el estudiante
     *
     * @param fechaNacimiento la nueva fecha de nacimiento
     */
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * es el método para obtener el programa académico del estudiante
     *
     * @return es el programa académico del estudiante
     */
    public Programa getProgramaAcademico() {
        return programaAcademico;
    }

    /**
     * es el método para establecer un nuevo programa académico para el estudiante
     *
     * @param programaAcademico es el nuevo programa académico
     */
    public void setProgramaAcademico(Programa programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    /**
     * es la representación en cadena del estudiante
     *
     * @return el código, nombre y programa académico del estudiante
     */
    @Override
    public String toString() {
        return codigoEstudiante + " - " + nombre + ", Programa: " + programaAcademico;
    }

    public static void main(String[] args) {
        NombreCompleto nombreEstudiante = new NombreCompleto("Dylan", "Torres");
        Fecha fechaNacimiento = new Fecha(17, 6, 2006);
        Programa programaEstudiante = new Programa(101, "Ciencias de la Computación e Inteligencia Artificial", "Facultad de Ciencias Exactas e Ingeniería");
        Estudiante estudiante = new Estudiante("60F", 123456789, nombreEstudiante, fechaNacimiento, programaEstudiante);

        Proyecto proyecto1 = new Proyecto("Proyecto 1", "Fundamentos de Diseño de Software");
        Fecha fechaInscripcion1 = new Fecha(10, 01, 2025);
        estudiante.inscribirProyecto(fechaInscripcion1, proyecto1);

        Proyecto proyecto2 = new Proyecto("Proyecto 2", "Cibernética y Sistemas Inteligentes");
        Fecha fechaInscripcion2 = new Fecha(15, 01, 2025);
        estudiante.inscribirProyecto(fechaInscripcion2, proyecto2);

        System.out.println(estudiante);
        System.out.println("Inscripciones:");
        List<Inscripcion> inscripciones = estudiante.obtenerInscripciones();
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println(inscripcion);
        }
    }
}