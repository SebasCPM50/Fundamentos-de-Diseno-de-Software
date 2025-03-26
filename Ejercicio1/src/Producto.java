public class Producto {
    private Tipo tipoProducto;
    private int codigo;
    private String descripcion;
    private double precioVenta;
    private int cantidad;
    private Fecha fechaVencimiento;

     /**
     * el constructor para crear un producto con todos sus atributos
     * 
     * @param tipoProducto es el tipo del producto (si es perecedero o no perecedero)
     * @param codigo es el código del producto
     * @param descripcion es la descripción del producto
     * @param precioVenta es el precio de venta del producto
     * @param cantidad es la cantidad disponible en stock
     * @param fechaVencimiento es la fecha de vencimiento del producto
     */
    public Producto(Tipo tipoProducto, int codigo, String descripcion, double precioVenta, int cantidad, Fecha fechaVencimiento) {
        this.tipoProducto = tipoProducto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
    }

     /**
     * se obtiene el código del producto
     * 
     * @return el código del producto
     */
    public int getCodigo() {
        return codigo;
    }

     /**
     * es la representación en cadena del producto
     * 
     * @return la información detallada del producto
     */
    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion +
               ", Precio: " + precioVenta + ", IVA: " + (tipoProducto.getIva() * this.precioVenta) +
               ", Precio Final: " + (precioVenta + (tipoProducto.getIva() * precioVenta)) +
               ", Cantidad: " + cantidad + ", Vencimiento: " + fechaVencimiento +
               ", Tipo: " + tipoProducto;
    }
}
