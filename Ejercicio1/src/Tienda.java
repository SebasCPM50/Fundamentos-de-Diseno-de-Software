import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }
    /**
     * Método para agregar un objeto producto a la lista de productos
     * @param producto  recibe como parametro una instancia de la clase Producto 
     */

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
     /**
     * es el método para buscar un producto en la tienda por su código
     *
     * @param codigo el código del producto que se busca
     * @return el producto encontrado o null (no encontrado) si no existe
     */
    public Producto buscarProducto(int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }
     /**
     * es el método para dejar en una lista todos los productos disponibles en la tienda
     */
    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();  //crear una instancia de la clase tienda objeto de la clase tienda

        Tipo perecedero = new Tipo(true);
        Tipo noPerecedero = new Tipo(false);

        Producto leche = new Producto(perecedero, 101, "Leche", 2.50, 10, new Fecha(10, 5, 2025));
        Producto arroz = new Producto(noPerecedero, 102, "Arroz", 1.80, 20, new Fecha(23, 4, 2026));

        tienda.agregarProducto(leche);
        tienda.agregarProducto(arroz);
        
        System.out.println("Listado de Productos:");
        tienda.listarProductos();

        System.out.println("\nConsulta por Código:");
        Producto encontrado = tienda.buscarProducto(102);
        tienda.agregarProducto(encontrado);
        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}