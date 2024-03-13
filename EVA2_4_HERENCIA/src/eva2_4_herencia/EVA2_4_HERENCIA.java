
package eva2_4_herencia;


public class EVA2_4_HERENCIA {

    
    public static void main(String[] args) {
        Persona perso = new Persona();
        System.out.println(perso.toString());
        //el metodo toString viene por herencia, no fue implementado por nosotros
        //TODAS LAS CLASES DESCIENDES DE LA CLASE OBJECT
        Estudiante estu = new Estudiante();
        System.out.println("Nombre: " + estu.getNombre());
        System.out.println("Apellidos: " + estu.getApellidos());
        System.out.println("Edad: " + estu.getEdad());
    }
}

    class Persona{
        private String nombre;
        private String apellidos;
        private int edad;

    public Persona() {
        this.nombre = "SIN NOMBRE";
        this.apellidos =  "SIN APELLIDOS";
        this.edad = 0;
    }

    public Persona(String nombre, String apellidos, int edad) {
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

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Estudiante extends Persona{
    private int noControl;

    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }
    
    
}

