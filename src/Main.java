public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Dell XPS", "Dell", 2500000.0, 10.0, "Intel Core i7", 16);
        Celular celular1 = new Celular("iPhone 10", "Apple", 1000000.0, 15.0, 100, 10);

        Cliente cliente1 = new Cliente("Juan David Jimenez Jimenez", "juan.jimenez-ji@uniminuto.edu.co");

        cliente1.comprarProducto(laptop1, 1);
        cliente1.comprarProducto(celular1, 1);

        System.out.println("\nCompra de Cliente 1:");
        cliente1.mostrarCompra();


        Cliente cliente2 = new Cliente("Tatiana Jimenez", "tatiana.jimenez@gmail.com");

        cliente2.comprarProducto(laptop1, 2);
        cliente2.comprarProducto(celular1, 3);


        System.out.println("\nCompra de Cliente 2:");
        cliente2.mostrarCompra();


        System.out.println("\nInventario actualizado:");
        laptop1.mostrarDetalles();
        celular1.mostrarDetalles();
    }
}

