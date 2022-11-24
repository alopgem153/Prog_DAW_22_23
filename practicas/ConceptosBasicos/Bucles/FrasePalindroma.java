package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class FrasePalindroma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase = "";
        //pedir frases mientras no se escriba salir
        while (!frase.equals("SALIR"))
        {
            System.out.println("Dime una frase y te digo si es palindroma...");
            frase = sc.nextLine();

            //quitar los espacios
            frase = frase.replace(" ", "");

            boolean esPalindroma = true;
            int inicioPalabra = 0;
            int finPalabra = frase.length()-1;

            //comparar letra a letra del inicio al final
            //opcion 1: darle a vuelta a la frase y ver si son iguales
            String fraseAlReves = "";
            for(int aux = 0; aux < frase.length(); aux++)
            {
                fraseAlReves = fraseAlReves + frase.charAt(aux) ;
            }
            System.out.println("Frase al reves: " + fraseAlReves);

            //No se puede utilizar == para comparar String(frase == fraseAlReves)
            if (frase.equals(fraseAlReves)) 
            {
                System.out.println("ES PALINDROMA");
            }
            else
            {
                System.out.println("NO LO ES");
            }


            System.out.println("----------------------------------");

            //opcion 2: comparar letra a letra
            while(inicioPalabra <= finPalabra)
            {
                char caracterInicio = frase.charAt(inicioPalabra);
                char caracterFin = frase.charAt(finPalabra);

                if(caracterInicio != caracterFin)
                {
                    esPalindroma = false;
                }
                inicioPalabra++;
                finPalabra--;
            }

            if (esPalindroma)
            {
                System.out.println("ES PALINDROMA");
            }
            else
            {
                System.out.println("NO LO ES");
            }

        }
        
    }
}
