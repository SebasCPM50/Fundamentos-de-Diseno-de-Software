public class Paciente {
    private int id;
    private String nombre;
    private Fecha fechaNac;
    private String direccion;
    private String telefono;

     /**
     * es el constructor de la clase Paciente
     * 
     * @param id        el ID del paciente
     * @param nombre    el nombre del paciente
     * @param fechaNac  la fecha de nacimiento del paciente
     * @param direccion la dirección de residencia del paciente
     * @param telefono  el número de contacto del paciente
     */
    public Paciente(int id, String nombre, Fecha fechaNac, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * es el método que obtiene el ID del paciente
     * 
     * @return el ID del paciente
     */
    public int getId() { 
        return id; 
    }

    /**
     * es el método que establece un nuevo ID para el paciente
     * 
     * @param id el nuevo ID del paciente
     */
    public void setId(int id) { 
        this.id = id; 
    }

    /**
     * es el método que obtiene el nombre del paciente
     * 
     * @return el nombre del paciente
     */
    public String getNombre() { 
        return nombre; 
    }

    /**
     * es el método que establece un nuevo nombre para el paciente
     * 
     * @param nombre el nuevo nombre del paciente
     */
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    /**
     * es el método que obtiene la fecha de nacimiento del paciente
     * 
     * @return la fecha de nacimiento del paciente
     */
    public Fecha getFechaNac() { 
        return fechaNac; 
    }

    /**
     * es el método que establece una nueva fecha de nacimiento para el paciente
     * 
     * @param fechaNac la nueva fecha de nacimiento
     */
    public void setFechaNac(Fecha fechaNac) { 
        this.fechaNac = fechaNac; 
    }

    /**
     * es el método que obtiene la dirección del paciente
     * 
     * @return la dirección de residencia del paciente
     */
    public String getDireccion() { 
        return direccion; 
    }

    /**
     * es el método que establece una nueva dirección para el paciente
     * 
     * @param direccion la nueva dirección del paciente
     */
    public void setDireccion(String direccion) { 
        this.direccion = direccion; 
    }

    /**
     * es el método que obtiene el número de teléfono del paciente
     * 
     * @return el número de contacto del paciente
     */
    public String getTelefono() { 
        return telefono; 
    }

    /**
     * es el método que establece un nuevo número de teléfono para el paciente
     * 
     * @param telefono el nuevo número de contacto del paciente
     */
    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }

    /**
     * es la representación en cadena del objeto Paciente
     * 
     * @return una cadena con la información del paciente
     */
    @Override
    public String toString() {
        return "Paciente: " + nombre + " (ID: " + id + ")";
    }
}