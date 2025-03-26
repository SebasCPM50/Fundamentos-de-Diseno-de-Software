public class Inscripcion {
        private Fecha fecha;
        private Proyecto proyecto;
    
        /**
     * es el constructor que inicializa una inscripción con fecha y proyecto
     *
     * @param fecha la fecha de inscripción del proycto
     * @param proyecto el proyecto
     */
        public Inscripcion(Fecha fecha, Proyecto proyecto) {
            this.fecha = fecha;
            this.proyecto = proyecto;
        }
    
         /**
     * es el método para obtener la fecha de la inscripción
     *
     * @return a la fecha de la inscripción
     */
        public Fecha getFecha() {
            return fecha;
        }
    /**
     * es el método para establecer una nueva fecha de inscripción
     *
     * @param fecha es la nueva fecha de inscripción
     */
        public void setFecha(Fecha fecha) {
            this.fecha = fecha;
        }
    
        /**
     * es el método para obtener el proyecto de la inscripción
     *
     * @return al proyecto inscrito
     */
        public Proyecto getProyecto() {
            return proyecto;
        }

        /**
     * es el método para cambiar el proyecto de la inscripción
     *
     * @param proyecto es el nuevo proyecto al que se inscribe
     */
        public void setProyecto(Proyecto proyecto) {
            this.proyecto = proyecto;
        }

        /**
     * es la representación en cadena de la inscripción, mostrando la fecha y el proyecto
     *
     * @return a la cadena con la información de la inscripción
     */
        @Override
        public String toString() {
            return "Fecha: " + fecha + ", Proyecto: " + proyecto;
        }
}
