package eva2_2_sobrecarga_constructores;


public class EVA2_2_SOBRECARGA_CONSTRUCTORES {

    
    public static void main(String[] args) {
       Persona perso1 = new Persona();
       perso1.imprimirDatos();
       
       Persona perso2 = new Persona("Pedro","Paramo",70);
       perso2.imprimirDatos();
       perso2.setNombre("Juan");
       perso2.setApellidos("Rulfo");
       perso2.setEdad(80);
       perso2.imprimirDatos();
               
    }
    
}
