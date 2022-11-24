package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class PiramideLetras {

    public static void main(String[] args) {
        

        char caracterInicio = 'A';

        int altura = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura de la piramide...");
        altura = sc.nextInt();

        // for(int aux = 0; aux<altura; aux++)
        // {
        //     char nuevoCaracter = (char)((int)caracterInicio + aux);
        //     System.out.print(nuevoCaracter);
        // }

        for(int alt = 0; alt < altura; alt++)
        {

            for(int caracter = 0; caracter<= alt; caracter++)
            {
                //System.out.print(caracter);
                char nuevoCaracter = (char)((int)caracterInicio + caracter);
                System.out.print(nuevoCaracter);
            }

            //salto de linea
            System.out.println();

        }
    }
    
}
