package clases;

public interface Tienda_I {
    boolean insertarProductoAlmacen(Producto producto);
    String mostrarProductosAlmacenPorNombre();
    String mostrarProductosAlmacenPorId();
    Producto buscarProductoAlmacen(int id);
    double obtenerCuentaTotal();
}
