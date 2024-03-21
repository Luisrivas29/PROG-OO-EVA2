
package eva2_11_has_a;


public class EVA2_11_HAS_A {

    
    public static void main(String[] args) {
        Direccion direc = new Direccion("5ta", "55", "Valles", "35478", "CDMX", "CDMX");
        Persona perso = new Persona("Juan", "Perez", 50, direc);
        System.out.println(perso);
    }
    
}
