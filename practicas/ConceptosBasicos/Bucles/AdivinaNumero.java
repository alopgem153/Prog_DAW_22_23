package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class AdivinaNumero {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 100)+1;

        System.out.println("Trata de adivinar el número");
        int numero = sc.nextInt();

        while (numero != numeroSecreto && numero != -1)
        {
            if (numero > numeroSecreto)
            {
                System.out.println("El numero es menor");
            }
            else
            {
                System.out.println("El numero es mayor");
            }

            //actualizar condicion
            System.out.println("Dime otro");
            numero = sc.nextInt();
            
        }

        if (numero == numeroSecreto)
        {
            System.out.println("HAS GANADO!!");
        }
        else
        {
            System.out.println("HAS PERDIDO");
        }


    }
}
