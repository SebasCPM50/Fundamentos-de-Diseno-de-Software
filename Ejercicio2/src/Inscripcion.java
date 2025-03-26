public class Inscripcion {
        private Fecha fecha;
        private Proyecto proyecto;
    
        public Inscripcion(Fecha fecha, Proyecto proyecto) {
            this.fecha = fecha;
            this.proyecto = proyecto;
        }
    
        public Fecha getFecha() {
            return fecha;
        }
    
        public void setFecha(Fecha fecha) {
            this.fecha = fecha;
        }
    
        public Proyecto getProyecto() {
            return proyecto;
        }
    
        public void setProyecto(Proyecto proyecto) {
            this.proyecto = proyecto;
        }
    
        @Override
        public String toString() {
            return "Fecha: " + fecha + ", Proyecto: " + proyecto;
        }
}
