package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class Ejer18_Mult7 {
    
    public static void main(String[] args) {
        int numero = 10;

        /*
         * Escribe un programa que obtenga los números enteros comprendidos entre dos
        números introducidos por teclado y validados como distintos, el programa debe
        empezar por el menor de los enteros introducidos e ir incrementando de 7 en
        7.
         */

         Scanner sc =  new Scanner(System.in);

        System.out.println("Dime el primer número");
        int numero1 = sc.nextInt();

        System.out.println("Dime el segundo número");
        int numero2 = sc.nextInt();

        if (numero1 == numero2)
        {
            System.out.println("SON IGUALES, no se puee hacer nada");
        }
        else 
        {
            //Busco el máximo y el minimo
            //Puedo declarar 2 variables nuevas y utilizarlar luego
            // o puedo intercambiar sus valores cuando sea necesario

            int maximo = Math.max(numero1, numero2);
            int minimo = Math.min(numero1, numero2);

            if (numero1 > numero2)
            {
                int aux = numero2;
                numero2 = numero1;
                numero1 = aux;

            }

            for(int contador = numero1; contador <= numero2; contador += 7)
            {
                    System.out.print(contador + " ");
            }

            //Equivalente con WHILE
            int contador2 = numero1;
            while (contador2 <= numero2)
            {
                System.out.print(contador2 + " ");

                contador2 = contador2 + 7;
            }
        }

         sc.close();
    }
}
