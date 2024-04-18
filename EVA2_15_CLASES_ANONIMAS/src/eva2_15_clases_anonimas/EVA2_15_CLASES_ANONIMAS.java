/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_clases_anonimas;

/**
 *
 * @author raulr
 */
public class EVA2_15_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba prueba = new Prueba() {
            @Override
            public void mostrarMensaje() {
                System.out.println("Hola Mundo!!");
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        prueba.mostrarMensaje();
        
        ClaseAbstracta prueba2 = new ClaseAbstracta(){
            @Override
            public void otroMensaje(){
                System.out.println("Ahora con clase abstracta!!");
            }
        };
    }
    
}

interface Prueba{
  public void mostrarMensaje();
}

abstract class ClaseAbstracta{
public abstract void otroMensaje();

public void mensaje(){
    System.out.println("Hola Mundo");
}
}