import java.util.ArrayList;

public class Pedido {
    //Atributos
    private int numeroDePedido;
    private ArrayList<Producto> productos;
    private Cliente c;
    //Constructor
    public Pedido(Cliente c){
        this.c=c;
        this.productos = new ArrayList<Producto>();
        this.numeroDePedido=numeroDePedido;
    }
    //Metodos get y set
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    public int getNumero(){
        return numeroDePedido;
    }
    public void setNumero(int numeroDePedido){
        this.numeroDePedido=numeroDePedido;
    }
    //Metodos y funciones
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    public double calcularTotal() {
        double total=0;
        for(Producto p:productos) {
            total+=p.calcularPrecioFinal();
        }
        return total;
    }
    public String mostrarResumen(Cliente c){
    String resumen="--------------------------\nPedido nº: "+numeroDePedido+"\n**************************\nCliente: \n"+c.mostrarInfo()+"\n**************************\nProductos: \n";
    //Recorremos el array de productos para mostrar cada producto
    for (Producto p:productos){
        resumen+=p.mostrarInfo()+"\n";
    }
    resumen+="**************************\nTotal: "+String.format("%.2f euros",calcularTotal());
    return resumen+"\n--------------------------";
    }
    @Override
    public String toString() {
        return mostrarResumen(c);
    }
}