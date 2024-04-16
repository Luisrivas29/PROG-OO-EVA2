package eva2_13_polimorfismo_2;


public class Estudiante extends Persona {
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
    
     @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("No de control: " + noControl);
    }
}
