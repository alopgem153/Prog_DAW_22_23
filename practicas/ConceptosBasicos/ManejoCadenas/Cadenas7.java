package ConceptosBasicos.ManejoCadenas;

import java.util.Scanner;

public class Cadenas7 {
    /*
    Lee de teclado un carácter e indica si es un dígito, 
    si es un espacio en blanco y si es un carácter en mayúscula.  
    Realiza este ejercicio utilizando la clase Character

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un caracter:");
        char caracter = sc.nextLine().charAt(0);
        sc.close();

        System.out.println("Es Digito? " + Character.isDigit(caracter) );
        System.out.println("Es un espacio en blanco? " + Character.isSpaceChar(caracter));
        System.out.println("Esta en mayuscula?" + Character.isUpperCase(caracter)); 


    }

    
}
