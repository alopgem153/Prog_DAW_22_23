package ConceptosBasicos.ManejoCadenas;

import java.util.Scanner;

public class Cadenas3 {
    /*
     * Partir un texto introducido por el usuario 
     * por la posición que tambien introduzca el usuario.
     * Mostrar las 2 partes de la cadena: 
     * “Parte izquierda xxxxx y parte derecha xxxxx
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un texto");
        String texto = sc.nextLine();
        
        System.out.println("Dime una posicion");
        int posicion = sc.nextInt();

        sc.close();

        String parteIzquierda =texto.substring(0, posicion);
        String parteDerecha = texto.substring(posicion);

        System.out.println("La parte izquierda es " + parteIzquierda);
        System.out.println("La parte derecha es " + parteDerecha);

    }

    
}
