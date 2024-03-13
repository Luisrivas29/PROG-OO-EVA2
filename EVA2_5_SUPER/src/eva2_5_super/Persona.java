package eva2_5_super;


public class Persona {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private char genero;

    public Persona() {
        this.nombre = "SIN NOMBRE";
        this.apPaterno = "SIN APELLIDO";
        this.apMaterno = "SIN APELLIDO";
        this.edad = 0;
        this.genero = '-';
    }

    public Persona(String nombre, String apPaterno, String apMaterno, int edad, char genero) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    public void imprimirDatos(){
        System.out.println("El Nombre completo: " + nombre + " " + apPaterno + " "+ apMaterno);
        System.out.println("La edad es: " + edad);
        System.out.println("El genero es: " + genero);
    }
}
