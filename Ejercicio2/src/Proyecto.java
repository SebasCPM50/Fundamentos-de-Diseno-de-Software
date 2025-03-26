public class Proyecto {
        private String nombre;
        private String objetivo;
    
        public Proyecto(String nombre, String objetivo) {
            this.nombre = nombre;
            this.objetivo = objetivo;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getObjetivo() {
            return objetivo;
        }
    
        public void setObjetivo(String objetivo) {
            this.objetivo = objetivo;
        }
    
        @Override
        public String toString() {
            return nombre + ": " + objetivo;
        }
}
