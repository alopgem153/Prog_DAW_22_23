package ConceptosBasicos;

import java.util.Scanner;

public class PuedoSalir {

    public static void main(String[] args) {
        
    /*
     * Diseñar el algoritmo que nos indique si podemos 
     * salir a la calle. Debemos tener en cuenta para 
     * tomar esa decisión los siguientes aspectos: 
     * Si está lloviendo o no, 
     * si hemos terminado nuestras tareas. 
     * Existe una opción en la que indistintamente de lo anterior, podemos salir a la calle, es que vayamos a ir a la biblioteca ( a realizar algún trabajo o estudiar). 
    El programa debe pedir al usuario si llueve, 
    si ha finalizado las tareas y si necesita ir a la 
    biblioteca y mostrar si puede o no ir a la biblioteca.

     */

     Scanner sc = new Scanner(System.in);

     System.out.println("Está lloviendo?");
     boolean estaLloviendo = sc.nextBoolean();

     System.out.println("Has terminado las tareas?");
     boolean tareasTerminadas = sc.nextBoolean();

     System.out.println("Necesitas ir a la biblioteca?");
     boolean necesitasIrBiblioteca = sc.nextBoolean();


     boolean puedoSalir = (!estaLloviendo && tareasTerminadas) || (necesitasIrBiblioteca);

     System.out.println((puedoSalir) ? "Puedes Salir" : "Te quedas en casa");

     System.out.println(((!estaLloviendo && tareasTerminadas) || (necesitasIrBiblioteca)) 
                    ? "Puedes Salir" : "Te quedas en casa");
    }
}
