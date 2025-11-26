public class Main {
    public static void main(String[] args) {
        //Cliente
        Cliente cliente1=new Cliente("Juan Pérez", "juanperez@gmail.com", "Calle Larga Nº2 2ºA");
        //Productos
        ProductoFisico teclado=new ProductoFisico("Teclado", 200.99, 4.50);
        ProductoDigital juego=new ProductoDigital("GOW", 30.99, "15", "Microsoft");
        //Crear pedido
        Pedido pedido = new Pedido(cliente1);
        //Agregar productos al pedido
        pedido.agregarProducto(teclado);
        pedido.agregarProducto(juego);
        //Resumen
        System.out.println(pedido.mostrarResumen(cliente1));
    }
}