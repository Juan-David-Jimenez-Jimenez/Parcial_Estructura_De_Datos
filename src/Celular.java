public class Celular extends Producto implements Vendible {
    private int capacidadBateria;
    private double camaraResolucion;

    public Celular() {
    }

    public Celular(String nombre, String marca, Double precio, Double cantidadStock, int capacidadBateria, double camaraResolucion) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(double camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Celular: " + nombre + " - Marca: " + marca + " - Precio: $" + precio + " - Stock: " + cantidadStock + " - Batería: " + capacidadBateria + " - Cámara: " + camaraResolucion + "MP");
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double precioTotal = precio * cantidad;
        if (cantidad > 5) {
            precioTotal *= 0.9;
        }
        return precioTotal;
    }
}


