public class Producto {
    private Tipo tipoProducto;
    private int codigo;
    private String descripcion;
    private double precioVenta;
    private int cantidad;
    private Fecha fechaVencimiento;

    public Producto(Tipo tipoProducto, int codigo, String descripcion, double precioVenta, int cantidad, Fecha fechaVencimiento) {
        this.tipoProducto = tipoProducto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCodigo() {
        return codigo;
    }

   
    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion +
               ", Precio: " + precioVenta + ", IVA: " + (tipoProducto.getIva()*this.precioVenta) +
               ", Precio Final: " +precioVenta + (tipoProducto.getIva()*this.precioVenta)+
               ", Cantidad: " + cantidad + ", Vencimiento: " + fechaVencimiento +
               ", Tipo: " + tipoProducto;
    }
}
