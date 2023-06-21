package ConceptosBasicos.ManejoCadenas;

import java.util.Scanner;

public class Cadenas8 {
    /*
    Lee de teclado un carácter e indica si es un dígito, 
    si es un espacio en blanco y si es un carácter en mayúscula.  
    Realiza este ejercicio utilizando la tabla ASCII

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un caracter:");
        char caracter = sc.nextLine().charAt(0);
        sc.close();

        int caracterInt = Integer.valueOf(caracter);
        System.out.println("Con Integer.valueOf = " + caracterInt);

        int caraterInt2 = (int)caracter;
        System.out.println("Con (int)caracter = " + caracterInt);

        boolean esDigito = true;

        /*
        System.out.println("Es Digito? " + Character.isDigit(caracter) );
        System.out.println("Es un espacio en blanco? " + Character.isSpaceChar(caracter));
        System.out.println("Esta en mayuscula?" + Character.isUpperCase(caracter)); 
        */

    }

    
}
