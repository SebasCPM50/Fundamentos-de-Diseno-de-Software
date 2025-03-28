public class Cita {
    private int id;
    private Fecha fechaHora;
    private Paciente paciente;
    private Medico medico;
    private String motivo;

    /**
     * es el constructor de la clase Cita
     * 
     * @param id       el ID de la cita
     * @param fechaHora la fecha y hora de la cita
     * @param paciente  el paciente que asiste
     * @param medico    el médico que atiende
     * @param motivo    el motivo por la cual la cita
     */
    public Cita(int id, Fecha fechaHora, Paciente paciente, Medico medico, String motivo) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.motivo = motivo;
    }

    /**
     * es el método para obtener el ID de la cita
     * @return al id de la cita
     */
    public int getId() {
        return id; 
    }

    /**
     * es el método para establecer un nuevo ID de la cita
     * @param id el nuevo id de la cita
     */
    public void setId(int id) { 
        this.id = id; 
    }

    /**
     * es el método para obtener la fecha y hora de la cita
     * @return la hora de la cita
     */
    public Fecha getFechaHora() { 
        return fechaHora; 
    }

    /**
     * es el método para establecer una nueva fecha y hora para la cita
     * @param fechaHora la nueva hora de la cita
     */
    public void setFechaHora(Fecha fechaHora) { 
        this.fechaHora = fechaHora; 
    }

    /**
     * es el método que obtiene el paciente asociado a la cita
     * @return el paciente de la cita
     */
    public Paciente getPaciente() { 
        return paciente; 
    }

    /**
     * es el método que establece un nuevo paciente para la cita
     * @param paciente el nuevo paciente de la cita
     */
    public void setPaciente(Paciente paciente) { 
        this.paciente = paciente; 
    }

    /**
     * es le método que obtiene el médico que atiende la cita
     * @return el médico de la cita
     */
    public Medico getMedico() { 
        return medico; 
    }

    /**
     * es el método que establece un nuevo médico para la cita
     * @param medico el nuevo médico de la cita
     */
    public void setMedico(Medico medico) { 
        this.medico = medico; 
    }

    /**
     * es el método que obtiene el motivo del por qué de la cita
     * @return el motivo de la cita
     */
    public String getMotivo() { 
        return motivo; 
    }

    /**
     * es el método que establece un nuevo motivo para la cita
     * @param motivo el nuevo motivo de la cita
     */
    public void setMotivo(String motivo) { 
        this.motivo = motivo; 
    }

    /**
     * es la representación en cadena del objeto Cita
     * @return una cadena con la información de la cita
     */
    @Override
    public String toString() {
        return "Cita #" + id + " - " + fechaHora + "\nPaciente: " + paciente + "\nMédico: " + medico + "\nMotivo: " + motivo;
    }
}