package ConceptosBasicos.ManejoNumeros;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        
        /*
        Realiza un programa que realice 
        el exponencial de un número por 
        otro número. Ambos números deben 
        ser introducidos por teclado.

         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la base");
        double base = sc.nextDouble();

        System.out.println("Dime el exponente");
        double exponente = sc.nextDouble();

        double resultado = Math.pow(base, exponente);
        System.out.println("Resultado de " + base + " elevado a " + exponente + " = " + resultado);
        

    }
    
}
