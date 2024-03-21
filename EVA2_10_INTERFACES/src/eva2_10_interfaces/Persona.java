package eva2_10_interfaces;


public class Persona implements Datos{
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        nombre = "-----";
        apellidos = "-----";
        edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellido) {
        this.apellidos = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
    /*@Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }

    @Override
    public String generarNombreCom() {
        return nombre + " " + apellidos;
    }
    \*
    
}
