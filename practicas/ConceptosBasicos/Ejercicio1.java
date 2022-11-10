package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce decimal");
        float decimal = sc.nextFloat();

        // con esta lectura de teclado
        // limpio el buffer de teclado
        sc.nextLine();

        System.out.println("Introduce nombre");
        String cadena = sc.nextLine();

        System.out.println("Introducido " + decimal + " " + cadena);

    }
}
