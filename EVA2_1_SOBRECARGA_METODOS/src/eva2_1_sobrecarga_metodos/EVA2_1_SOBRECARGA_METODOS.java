package eva2_1_sobrecarga_metodos;


public class EVA2_1_SOBRECARGA_METODOS {

    public static void main(String[] args) {
        System.out.println("La suma de 5 + 4 = " + sumar(5,4));
        System.out.println("La suma de 3.1 y 2.5 = " + sumar(3.1,2.5));
        System.out.println("La suma de hola + mundo es " + sumar("Hola ","Mundo"));
        sumar();
    }
    //SUMAR: METODO SOBRECARGADO, MISMO NOMBRE PARA
    //3 METODOS DIFERENTES
    public static int sumar(int num1,int num2){
        return num1 + num2;
    }
    
    public static double sumar(double num1,double num2){
        return num1 + num2;
    }
    
    public static String sumar(String num1, String num2){
        return num1 + num2;
    }
    
    public static void sumar(){
        System.out.println("Metodo que no hace nada");
    }
    
        
}
