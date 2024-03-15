package eva2_8_clases_abstractas;

import prueba.Persona;


public class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
    }
    
    

    public Estudiante(String noControl) {
        super();
        this.noControl = noControl;
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

    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("No de control: " + noControl);
    }
}
