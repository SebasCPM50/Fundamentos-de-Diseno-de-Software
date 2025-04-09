public class NombreCompleto {
    private String nombre;
    private String apellido;

    /**
     * es el constructor que inicializa el nombre completo
     *
     * @param nombre el nombre de la persona
     * @param apellido el apellido de la persona
     */
public NombreCompleto(String nombre, String apellido){
    this.nombre = nombre;
    this.apellido = apellido;
}

    /**
     * es el método para obtener el nombre de la persona
     *
     * @return el mombre de la persona
     */
public String getNombre(){
    return nombre;
}

/**
     * es el método para obtener el apellido de la persona
     *
     * @return al apellido de la persona
     */
public String getApellido(){
    return apellido;
}

/**
     * es el método para establecer un nuevo nombre para la persona
     *
     * @param nombre es el nuevo nombre de la persona
     */
public void setNombre(String nombre){
    this.nombre = nombre;
}

/**
     * es el método para establecer un nuevo apellido para la persona
     *
     * @param apellido es el nuevo apellido de la persona
     */
public void setApellido(String apellido){
    this.apellido = apellido;
}
/**
     * es la representación en cadena del nombre completo
     *
     * @return el nombre completo
     */
@Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
