public class Proyecto {
        private String nombre;
        private String objetivo;
    
        /**
     * es el constructor que inicializa un proyecto con su nombre y el objetivo
     *
     * @param nombre el nombre del proyecto
     * @param objetivo el objetivo del proyecto
     */
        public Proyecto(String nombre, String objetivo) {
            this.nombre = nombre;
            this.objetivo = objetivo;
        }
        
        /**
     * es el método para obtener el nombre del proyecto
     *
     * @return el nombre del proyecto
     */
        public String getNombre() {
            return nombre;
        }

        /**
     * es el método para establecer un nuevo nombre para el proyecto
     *
     * @param nombre sería el nuevo nombre para el proyecto
     */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
     * es el método para obtener el objetivo del proyecto
     *
     * @return el bjetivo del proyecto
     */
        public String getObjetivo() {
            return objetivo;
        }

        /**
     * es el método para establecer un nuevo objetivo para el proyecto
     *
     * @param objetivo sería el nuevo objetivo del proyecto
     */
        public void setObjetivo(String objetivo) {
            this.objetivo = objetivo;
        }

        /**
     * es la representación en cadena del proyecto
     *
     * @return el nombre y objetivo del proyecto
     */
        @Override
        public String toString() {
            return nombre + ": " + objetivo;
        }
}
