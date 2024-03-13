
package eva2_5_super;

//           Subclase           Superclase
public class Estudiante extends Persona {
    private String noControl;
    private String carrera;

    public Estudiante() {
        super();  // llama al constructor de la superclase
        this.noControl = "-----";
        this.carrera = "-------";
    }
    
    //regla: siempre hay que llamar al constructor de la superclase
    //siempre tiene que ser la primera instruccion el constructor
    public Estudiante (String nombre, String apPaterno, String apMaterno, 
            int edad, char genero, String noControl, String carrera){
        super(nombre,apPaterno,apMaterno,edad,genero);
        this.noControl = noControl;
        this.carrera = carrera;
    }
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de control: " + noControl);
        System.out.println("Carrera: " + carrera);
    }
    
}
