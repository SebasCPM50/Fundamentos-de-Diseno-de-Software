import java.util.ArrayList;

public class Sistema {
    private ArrayList<Cita> listaCitas = new ArrayList<>();

    /**
     * es el método para solicitar una nueva cita
     * 
     * @param id        el ID de la cita
     * @param fecha     la fecha y hora de la cita
     * @param paciente  el paciente de la cita
     * @param medico    el médico que atenderá la cita
     * @param motivo    el motivo de la cita
     */
    public void solicitarCita(int id, Fecha fecha, Paciente paciente, Medico medico, String motivo) {
        Cita nuevaCita = new Cita(id, fecha, paciente, medico, motivo);
        listaCitas.add(nuevaCita);
        System.out.println("Cita agendada:\n" + nuevaCita);
    }

    /**
     * es el método de instancia que cancela una cita específica según su ID
     * 
     * @param id el ID de la cita a cancelar
     */
    public void cancelarCita(int id) {
        listaCitas.removeIf(cita -> cita.getId() == id);
        System.out.println("Cita #" + id + " cancelada.");
    }


    /**
     * es la lista todas las citas agendadas en el sistema
     */
    public void listarCitas() {
        System.out.println("\nCitas agendadas:");
        for (Cita cita : listaCitas) {
            System.out.println(cita);
        }
    }

    /**
     * es el método principal para ejecutar el sistema
     * 
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Fecha fecha = new Fecha(5, 3, 2025);
        Paciente paciente = new Paciente(1077448325, "Ana Ramírez", new Fecha(6, 1, 2007), "Calle 73 #24C-40", "3201234567");
        Medico medico = new Medico(101, "Dr. Gómez", "Cardiología", "Lunes a Viernes 7:00 a.m - 11:00 p.m");

        sistema.solicitarCita(1, fecha, paciente, medico, "Revisión general");
        sistema.listarCitas();
    }
}