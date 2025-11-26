public class ProductoFisico extends Producto {
    //Atributos
    private double costeEnvio;
    //Constructor
    public ProductoFisico(String nombre, double precio, double costeEnvio){
        super (nombre, precio);
        this.costeEnvio=costeEnvio;
    }
    //Metodos get y set
    public double getCosteEnvio(){
        return costeEnvio;
    }
    public void setCosteEnvio(double costeEnvio){
        this.costeEnvio=costeEnvio;
    }
    //Metodos
    @Override
    public double calcularPrecioFinal(){
        //creamos por ejemplo el iva del 21%
        double iva=getPrecio()*0.21;
        return getPrecio()+iva+costeEnvio;
    }
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo()+", Envío: "+String.format("%.2f euros",costeEnvio);
    }
    @Override
    public String toString(){
        return mostrarInfo();
    }
}