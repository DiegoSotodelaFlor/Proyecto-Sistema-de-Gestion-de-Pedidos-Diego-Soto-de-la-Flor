public class Cliente {
    //Atributos
    private String nombre;
    private String correo;
    private String direccion;
    //Constructor
    public Cliente(String nombre, String correo, String direccion){
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }
    //Metodos get y set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    //Metodos y funciones
    public String mostrarInfo(){
        return "Nombre: "+nombre+", Correo: "+correo+", Direccion: "+direccion;
    }
    @Override
    public String toString() {
        return mostrarInfo();
    }
}