package eva2_10_interfaces;


public class Estudiante extends Persona implements Datos, GenerarFecha{
    private String noControl;

    public Estudiante() {
        super();
        noControl = "-----";
    }

    public Estudiante(String noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    @Override
    public void imprimirDatos() {
         System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
    }

    @Override
    public String generarNombreCom() {
        return getNombre() + " " + getApellidos();
    }

    @Override
    public int calcularAnnioNac() {
       return 2024 - getEdad();
    }
    
    
}
