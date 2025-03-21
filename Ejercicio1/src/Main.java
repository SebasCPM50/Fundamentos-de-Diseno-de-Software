public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Tipo perecedero = new Tipo(true, 0.19);
        Tipo noPerecedero = new Tipo(false, 0.10);

        Producto leche = new Producto(perecedero, 101, "Leche", 2.50, 10, new Fecha(10, 5, 2025));
        Producto arroz = new Producto(noPerecedero, 102, "Arroz", 1.80, 20, new Fecha(1, 1, 2030));

        tienda.agregarProducto(leche);
        tienda.agregarProducto(arroz);

        System.out.println("Listado de Productos:");
        tienda.listarProductos();

        System.out.println("\nConsulta por Código (102):");
        Producto encontrado = tienda.buscarProducto(102);
        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}