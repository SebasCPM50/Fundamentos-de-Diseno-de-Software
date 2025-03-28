public class Registro {
    private int id;
    private Cita cita;
    private String diagnostico;
    private String tratamiento;
    private String notas;

    /**
     * es el constructor de la clase Registro
     * 
     * @param id          el ID del registro
     * @param cita  la cita 
     * @param medico      el médico que realizó la consulta
     * @param fecha       la fecha del registro
     * @param descripcion la descripción del diagnóstico o tratamiento
     */
    public Registro(int id, Cita cita, String diagnostico, String tratamiento, String notas) {
        this.id = id;
        this.cita = cita;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.notas = notas;
    }

    /**
     * es el método que obtiene el ID del registro
     * @return el ID del registro
     */
    public int getId() { 
        return id; 
    }

    /**
     * es el método que establece un nuevo ID para el registro
     * @param id el nuevo ID del registro
     */
    public void setId(int id) { 
        this.id = id; 
    }

    /**
     * es el método que obtiene la cita asociada al registro
     * 
     * @return la cita del registro
     */
    public Cita getCita() { 
        return cita; 
    }

    /**
     * es el método que establece una nueva cita para el registro
     * 
     * @param cita la nueva cita asociada
     */
    public void setCita(Cita cita) { 
        this.cita = cita; 
    }

    /**
     * es el método que obtiene el diagnóstico del registro
     * 
     * @return el diagnóstico
     */
    public String getDiagnostico() { 
        return diagnostico; 
    }

    /**
     * es el método que establece un nuevo diagnóstico para el registro
     * 
     * @param diagnostico el nuevo diagnóstico
     */
    public void setDiagnostico(String diagnostico) { 
        this.diagnostico = diagnostico;
    }

    /**
     * es el método que obtiene el tratamiento del registro
     * 
     * @return el tratamiento recomendado
     */
    public String getTratamiento() { 
        return tratamiento; 
    }

    /**
     * es el método que establece un nuevo tratamiento para el registro
     * 
     * @param tratamiento el nuevo tratamiento recomendado
     */
    public void setTratamiento(String tratamiento) { 
        this.tratamiento = tratamiento; 
    }

    /**
     * es el método que obtiene las notas adicionales del registro
     * 
     * @return las notas adicionales
     */
    public String getNotas() { 
        return notas; 
    }

    /**
     * es el método que establece nuevas notas para el registro
     * 
     * @param notas las nuevas notas adicionales
     */
    public void setNotas(String notas) { 
        this.notas = notas; 
    }

    /**
     * es la representación en cadena del objeto Registro
     * 
     * @return una cadena con la información del registro
     */
    @Override
    public String toString() {
        return "Registro #" + id + " - Diagnóstico: " + diagnostico + "\nTratamiento: " + tratamiento + "\nNotas: " + notas;
    }
}