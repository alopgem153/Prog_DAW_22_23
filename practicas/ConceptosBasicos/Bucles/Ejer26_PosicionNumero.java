package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class Ejer26_PosicionNumero {
    
    public static void main(String[] args) {
        /*
         * dado un numero me dice que 
         * posición ocupa en otro número más grande
         */

         Scanner sc = new Scanner(System.in);

         int numero, invertido = 0, resto;

         System.out.println("Introduce un número: ");

         numero = sc.nextInt();

         System.out.println("Introduce el digito que quieres encontrar...");
         int digitoBuscado = sc.nextInt();

         if (digitoBuscado > 10)
         {
            System.out.println("El digito es de un solo elemento");
            System.exit(0);
         }
         else
         {
            //inverto en numero
            //porque los numeros se leen de derecha a izquierda
            //y necesito darle la vuelta para que las posiciones sean correctas
            while (numero > 0)
            {
               resto = numero % 10;
               invertido = invertido * 10 + resto;
               numero /= 10;
            }

            //System.out.println("Numero invertido: " + invertido);
            String posiciones = "";
            int contadorApariciones = 0;
            int posicionAparicion = 1;
            while(invertido > 0)
            {
               resto = invertido % 10;
               if (resto == digitoBuscado )
               {
                  posiciones += " " + posicionAparicion;
                  contadorApariciones++;
               }

               posicionAparicion++;
               invertido = invertido / 10;

            }

            System.out.println("El digito "+ digitoBuscado + " aparece: "+ contadorApariciones + " veces");
            System.out.println("En las posiciones "+ posiciones);
            sc.close();
         }
    }
}
