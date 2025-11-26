public abstract class Producto {
    private String nombre;
    private double precio;
    public void Producto(String nombre, double precio);
    public String getNombre();
    public void setNombre(String nombre);
    public double getPrecio();
    public void setNombre(double precio);
    public double calcularPrecioFinal();
    public String mostrarInfo();
    public String toString();
}
