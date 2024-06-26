package eva2_13_polimorfismo_2;


public class Persona implements MostrarDatos {
     private String nombre;
    private String apellido;

    public Persona() {
        nombre = "-----";
        apellido = "-----";
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public String toString(){
        return nombre + " " + apellido;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + "\n" + "Apellidos: " + apellido);
    }
}
