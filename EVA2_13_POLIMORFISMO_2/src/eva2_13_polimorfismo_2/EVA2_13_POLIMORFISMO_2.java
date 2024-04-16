
package eva2_13_polimorfismo_2;


public class EVA2_13_POLIMORFISMO_2 {

    
    public static void main(String[] args) {
        /*Persona perso1 = new Persona("JUAN", "PEREZ");
        Persona perso2 = new Persona("PEDRO", "PARAMO");
        Persona perso3 = new Persona("J.R.R", "TOLKIEN");
        
        Estudiante estu1 = new Estudiante("2124324", "Ana", "Vazquez");
        Estudiante estu2 = new Estudiante("435345", "Roberto","Gutierrez");
        Estudiante estu3 = new Estudiante("4564564", "Alberto", "Hernandez");
        
        imprimirDatos(perso1);
        imprimirDatos(perso2);
        imprimirDatos(perso3);
        imprimirDatos(estu1);
        imprimirDatos(estu2);
        imprimirDatos(estu3); */
        
        Estudiante estudiantes[] = new Estudiante[3000];
        for (int i = 0; i < estudiantes.length; i++){
            estudiantes[i] = new Estudiante("0000","ESTUDIANTE","SIN DATOS");
            }
        
         for (int i = 0; i < estudiantes.length; i++){
            imprimirDatos(estudiantes[i]);
            }
    }
    
    public static void imprimirDatos(MostrarDatos datos){
        datos.imprimirDatos();
        //CASTING 
        Estudiante estu;
        Persona perso;
        if(datos instanceof Estudiante){
        estu = (Estudiante)datos;
        }else
            perso = (Persona)datos;
    }
}
