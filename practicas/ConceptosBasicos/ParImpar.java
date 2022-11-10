package ConceptosBasicos;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero entero");
        int numero = sc.nextInt();

        boolean esPar = (numero % 2) == 0;

        System.out.println("¿es par? " + esPar);
        //Usando Operador ternario

        String mensaje = (esPar) ? " Es Par": " Es IMPAR";

        System.out.println("El numero "+ numero + mensaje);
    }
    
}
