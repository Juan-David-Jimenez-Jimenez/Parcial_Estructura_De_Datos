import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadStock() >= cantidad) {
            productosComprados.add(producto);
            producto.setCantidadStock(producto.getCantidadStock() - cantidad);
            System.out.println("Compra realizada de " + cantidad + " unidad(es) de " + producto.getNombre());
        } else {
            System.out.println("Stock insuficiente para " + producto.getNombre());
        }
    }

    public void mostrarCompra() {
        System.out.println("Resumen de compra para el cliente: " + nombre);
        double totalCompra = 0;

        for (Producto producto : productosComprados) {
            Vendible vendible = (Vendible) producto;
            double precio = vendible.calcularPrecioVenta(1);
            totalCompra += precio;

            producto.mostrarDetalles();
            System.out.println("Costo unitario: $" + precio);
        }

        System.out.println("Costo total de la compra: $" + totalCompra);
    }
}



