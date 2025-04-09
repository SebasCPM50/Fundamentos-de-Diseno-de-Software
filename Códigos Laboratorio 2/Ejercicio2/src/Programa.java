public class Programa {
    private int codProg;
    private String nombreProg;
    private String facultad;

    /**
     * es el constructor que inicializa el programa académico
     *
     * @param codProg el código del programa
     * @param nombreProg el nombre del programa
     * @param facultad la facultad a la que corresponde
     */
    public Programa(int codProg, String nombreProg, String facultad) {
        this.codProg = codProg;
        this.nombreProg = nombreProg;
        this.facultad = facultad;
    }

    /**
     * es el método para obtener el código del programa 
     *
     * @return al código del programa
     */
    public int getCodProg() {
        return codProg;
    }

    /**
     * es el método para establecer un nuevo código para el programa 
     *
     * @param codProg es el nuevo código del programa
     */
    public void setCodProg(int codProg) {
        this.codProg = codProg;
    }

    /**
     * es el método para obtener el nombre del programa
     *
     * @return al nombre del programa 
     */
    public String getNombreProg() {
        return nombreProg;
    }

    /**
     * es el método para establecer un nuevo nombre para el programa 
     *
     * @param nombreProg es el nuevo nombre del programa
     */
    public void setNombreProg(String nombreProg) {
        this.nombreProg = nombreProg;
    }

    /**
     * es el método para obtener la facultad a la que pertenece el programa
     *
     * @return al nombre de la facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * es el método para establecer una nueva facultad para el programa académico
     *
     * @param facultad la nueva facultad del programa
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * es la representación en cadena del programa
     *
     * @return al nombre del programa, código y facultad
     */
    @Override
    public String toString() {
        return nombreProg + " (" + codProg + ") - " + facultad;
    }
}