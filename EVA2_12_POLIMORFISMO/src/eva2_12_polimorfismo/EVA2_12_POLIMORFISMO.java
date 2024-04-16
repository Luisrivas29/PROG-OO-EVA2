package eva2_12_polimorfismo;

public class EVA2_12_POLIMORFISMO {

   
    public static void main(String[] args) {
        Estudiante estu = new Estudiante("23550331", "JUAN", "PEREZ");
        System.out.println(estu);
        Persona perso = estu;
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellido: " + perso.getApellido());
        //---------------------------------------
        Persona perso1 = new Persona("Pedro", "Paramo");
        System.out.println(perso1);
        //Estudiante estu = perso1; NO SE PUEDE CONVERTIR UNA PERSONA A UN ESTUDIANTE
    } 
    
}

class Persona{
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

    
}

class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
        super();
        noControl = "-----";
    }

    public Estudiante(String noControl, String nombre, String apellido) {
        super(nombre, apellido);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + noControl;
    }

}
