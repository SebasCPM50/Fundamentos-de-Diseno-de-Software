public class Medico {
    private int id;
    private String nombre;
    private String especialidad;
    private String horarioTrabajo;

    /**
     * es el constructor de la clase Medico
     * 
     * @param id             el ID del médico
     * @param nombre         el nombre del médico
     * @param especialidad   la especialidad del médico
     * @param horarioTrabajo el horario de trabajo del médico
     */
    public Medico(int id, String nombre, String especialidad, String horarioTrabajo) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horarioTrabajo = horarioTrabajo;
    }

    /**
     * es el método que obtiene el ID del médico
     * @return el ID del médico
     */
    public int getId() { 
        return id; 
    }

    /**
     * es el método para obtener el ID del médico
     * @return el ID del médico
     */
    public void setId(int id) { 
        this.id = id; 
    }

    /**
     * es el método que obtiene el nombre del médico
     * @return el nombre del médico
     */
    public String getNombre() { 
        return nombre; 
    }

    /**
     * es el método para establecer un nuevo nombre para el médico
     * @param nombre el nuevo nombre del médico
     */
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    /**
     * es el método que obtiene en lo que se especializa el médico
     * @return la especialidad del médico
     */
    public String getEspecialidad() { 
        return especialidad; 
    }

    /**
     * es el método que establece una nueva especialidad para el médico
     * @param especialidad la nueva especialidad del médico
     */
    public void setEspecialidad(String especialidad) { 
        this.especialidad = especialidad; 
    }

    /**
     * es el método que obtiene el horario de trabajo del médico
     * @return el horario de trabajo del médico
     */
    public String getHorarioTrabajo() { 
        return horarioTrabajo; 
    }

    /**
     * es el método que establece un nuevo horario de trabajo para el médico
     * @param horarioTrabajo el nuevo horario de trabajo del médico
     */
    public void setHorarioTrabajo(String horarioTrabajo) { 
        this.horarioTrabajo = horarioTrabajo; 
    }

    /**
     * es la representación en cadena del objeto Medico
     * @return una cadena con el nombre y la especialidad del médico
     */
    @Override
    public String toString() {
        return "Dr. " + nombre + " - " + especialidad;
    }
}