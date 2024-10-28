public class Laptop extends Producto implements Vendible {

    private String procesador;
    private int memoriaRam;

    public Laptop() {

    }

    public Laptop(String nombre, String marca, Double precio, Double cantidadStock, String procesador, int memoriaRam) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop: " + nombre + " - Marca: " + marca + " - Precio: $" + precio + " - Stock: " + cantidadStock + " - Procesador: " + procesador + " - RAM: " + memoriaRam + "GB");
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

