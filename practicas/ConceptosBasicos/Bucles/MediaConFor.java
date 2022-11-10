package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class MediaConFor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cantidadPeticiones = 5;

        int sumaTotal = 0;

        for(int aux = 0; aux < cantidadPeticiones; aux ++)
        {
            System.out.println("Dime un número:");
            int numero = sc.nextInt();

            sumaTotal += numero;

        }

        System.out.println("Media "+ (sumaTotal / (double)cantidadPeticiones));

        sc.close();

    }
}
