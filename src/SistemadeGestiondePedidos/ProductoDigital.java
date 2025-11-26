public class ProductoDigital extends Producto{
    //Atributos
    private String tamanyoDescarga;
    private String licencia;
    //Constructor
    public ProductoDigital(String nombre, double precio, String tamanyoDescarga, String licencia){
        super (nombre, precio);
        this.tamanyoDescarga=tamanyoDescarga;
        this.licencia=licencia;
    }
    //Metodos get y set
    public String getTamanyoDescarga(){
        return tamanyoDescarga;
    }
    public void setTamanyoDescarga(String tamanyoDescarga){
        this.tamanyoDescarga=tamanyoDescarga;
    }
    public String getLicencia(){
        return licencia;
    }
    public void setLicencia(double costeEnvio){
        this.licencia=licencia;
    }
    //Metodos
    @Override
    public double calcularPrecioFinal(){
        //creamos por ejemplo un descuento del 10%
        double descuento=getPrecio()*0.10;
        return getPrecio()-descuento;
    }
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo()+", Licencia: " + licencia+" Tamaño de descarga en MB: "+tamanyoDescarga;
    }
    @Override
    public String toString(){
        return mostrarInfo();
    }
}
