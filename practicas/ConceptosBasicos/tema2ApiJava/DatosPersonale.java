package practicas.ConceptosBasicos.tema2ApiJava;
import java.util.Scanner;

public class DatosPersonale {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre");

        String nombre = sc.nextLine();


        System.out.println("Introduce tu edad");

        int edad = sc.nextInt();


        System.out.println("Introduce tu altura en metros");

        float altura = sc.nextFloat();


        //Hacemos los calculos de edad  *  segundos
        int edadEnSegundos = edad * 365 * 24 * 60 * 60;

        float alturaEnCm = altura * 100;

        System.out.println("Tu nombre es \"" + nombre + "\" \nHas vivido \'" + edadEnSegundos + "\'seg. \n \t Mides "+ alturaEnCm);

        

    }
}
