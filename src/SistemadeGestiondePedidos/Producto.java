abstract class Producto  {
    //Atributos
    private String nombre;
    private double precio;
    //Constructor
    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    //Metodos get y set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setNombre(double precio){
        this.precio=precio;
    }
    //Metodos y funciones
    public abstract double calcularPrecioFinal(); //Lo usare para el iva y descuento
    public String mostrarInfo(){
        return "Nombre: "+nombre+", Precio: "+String.format("%.2f euros",precio);
    }
    @Override
    public String toString(){
        return mostrarInfo();
    }
}