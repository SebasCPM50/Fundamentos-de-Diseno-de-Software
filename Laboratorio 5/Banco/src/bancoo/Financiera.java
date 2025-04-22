package bancoo;
import java.util.ArrayList;

public class Financiera {

    private ArrayList<Cuenta> cuentas;

    public Financiera() {
        cuentas = new ArrayList<>();
    }

    public void crearCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void depositar(int numeroProducto, double valor) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroProducto() == numeroProducto) {
                cuenta.setSaldo(cuenta.getSaldo() + valor);
                System.out.println("Depósito realizado con éxito.");
                return;
            }
        }
        System.out.println("Cuenta no encontrada.");
    }

    public void retirar(int numeroProducto, double valor) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroProducto() == numeroProducto) {
                if (cuenta.getSaldo() >= valor) {
                    cuenta.setSaldo(cuenta.getSaldo() - valor);
                    System.out.println("Retiro realizado con éxito.");
                } else {
                    System.out.println("Fondos insuficientes.");
                }
                return;
            }
        }
        System.out.println("Cuenta no encontrada.");
    }

    public void mostrarCuentas() {
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.mostrarDetalles());
        }
    }

    public void mostrarCuentasAhorro() {
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaAhorro) {
                System.out.println(cuenta.mostrarDetalles());
            }
        }
    }

    public static void main(String[] args) {
        Financiera financiera = new Financiera();


        Titular t1 = new Titular(1, "Ana Torres", "ana@email.com");
        Titular t2 = new Titular(2, "Luis Pérez", "luis@email.com");

        CuentaAhorro ahorro = new CuentaAhorro(1001, 2023, t1, 2000.0, "2025-01-01", 500.0);
        CuentaCorriente corriente = new CuentaCorriente(1002, 2022, t2, 1500.0, "2025-06-01", 300.0, "retiro");
        CuentaVivienda vivienda = new CuentaVivienda(1003, 2021, t1, 0.0, 100000.0, "VIS");
        TarjetaCredito credito = new TarjetaCredito(1004, 2024, t2, 1000.0, 4000.0, "2024-12-01", 200.0);


        financiera.crearCuenta(ahorro);
        financiera.crearCuenta(corriente);
        financiera.crearCuenta(vivienda);
        financiera.crearCuenta(credito);

        financiera.depositar(1001, 500.0);
        financiera.retirar(1002, 200.0);

        System.out.println("\n--- TODAS LAS CUENTAS ---");
        financiera.mostrarCuentas();

        System.out.println("\n--- CUENTAS DE AHORRO ---");
        financiera.mostrarCuentasAhorro();
    }

}
