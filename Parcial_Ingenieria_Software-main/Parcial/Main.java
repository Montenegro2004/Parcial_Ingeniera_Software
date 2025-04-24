import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Pérez", "123456789");
        Cliente cliente2 = new Cliente("Ana Gómez", "987654321");
        Cliente cliente3 = new Cliente("Luis Martínez", "456789123");

        Producto camara1 = new ProductoConcreto(new CamaraImplementacion(1, "Canon", "EOS 4000D"));
        Producto camara2 = new ProductoConcreto(new CamaraImplementacion(2, "Nikon", "D3500"));
        Producto camara3 = new ProductoConcreto(new CamaraImplementacion(3, "Sony", "Alpha 6000"));

        Foto foto1 = new Foto(4, "playa.jpg");
        Foto foto2 = new Foto(5, "montaña.jpg");
        Foto foto3 = new Foto(6, "ciudad.jpg");
        Foto foto4 = new Foto(7, "naturaleza.jpg");
        Foto foto5 = new Foto(8, "retrato.jpg");
        Foto foto6 = new Foto(9, "universidad.jpg");
        Foto foto7 = new Foto(10, "casas.jpg");

        ArrayList<Foto> listaFotos1 = new ArrayList<>();
        listaFotos1.add(foto1);
        listaFotos1.add(foto2);

        ArrayList<Foto> listaFotos2 = new ArrayList<>();
        listaFotos2.add(foto3);
        listaFotos2.add(foto4);
        

        ArrayList<Foto> listaFotos3 = new ArrayList<>();
        listaFotos3.add(foto5);
        listaFotos3.add(foto6);
        listaFotos3.add(foto7);

        // Ahora las impresiones son productos simples, sin contener otros productos
        Producto impresion1 = new ProductoConcreto(
                new ImpresionImplementacion(8, "Color", "Colección de paisajes", listaFotos1));
        Producto impresion2 = new ProductoConcreto(
                new ImpresionImplementacion(9, "Blanco y negro", "Fotos artísticas", listaFotos2));
        Producto impresion3 = new ProductoConcreto(
                new ImpresionImplementacion(10, "Color", "Recuerdos de viaje", listaFotos3));

        Pedido pedido1 = new Pedido.PedidoBuilder()
                .setCliente(cliente1)
                .addProducto(camara1)        // en lugar de agruparlas en una impresión
                .addProducto(impresion1)
                .setFecha(new Date())
                .setNumeroTarjetaCredito(123456)
                .build(100);
        pedido1.mostrarPedido();

        Pedido pedido2 = new Pedido.PedidoBuilder()
                .setCliente(cliente2)
                .addProducto(camara2)
                .addProducto(impresion2)
                .setFecha(new Date())
                .setNumeroTarjetaCredito(654321)
                .build(101);
        pedido2.mostrarPedido();

        Pedido pedido3 = new Pedido.PedidoBuilder()
                .setCliente(cliente3)
                .addProducto(camara3)
                .addProducto(impresion3)
                .setFecha(new Date())
                .setNumeroTarjetaCredito(789012)
                .build(102);
        pedido3.mostrarPedido();
        }
}