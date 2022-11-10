package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero, negativo para terminar");

        double sumatorio = 0;
        int contadorNumero = 0;

        double num = 0;

        while (num >=0)
        {
            sumatorio += num;
            num = sc.nextDouble();

            if (num >= 0)
            {
                contadorNumero++;

                
                System.out.println("Introduce otro");
                
            }
        }

        System.out.println("Sumatotal " + sumatorio);

        if (contadorNumero > 0)
        {
            double media = sumatorio / (double)contadorNumero;
            System.out.println(" La media es: " + media);    
        }
        
    }
}
