package ConceptosBasicos.Bucles;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class CajaFuerte {
 
    public static void main(String[] args) {
        /*
         * Realiza el control de acceso a una caja fuerte. La combinación será un
            número de 4 cifras. 
            El programa nos pedirá la combinación para abrirla. Si no
            acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
            y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
            Tendremos cuatro oportunidades para abrir la caja fuerte.
         */

         final int CLAVE = 1234;

         boolean encontrado = false;
        int numeroIntentos = 4;

        Scanner sc = new Scanner(System.in);

         do
         {
            System.out.println("Introduce la clave , tienes "+ numeroIntentos + " intentos" ) ;
            int numeroIntroducido = sc.nextInt();

            encontrado = (numeroIntroducido == CLAVE);

            if (!encontrado)
            {
                numeroIntentos--;
            }

         } while (!encontrado && (numeroIntentos >= 1));


         if (encontrado)
         {
            System.out.println("BIEN!!!");
         }
         else 
         {
            System.out.println("NO lo has conseguido");
         }
         

    }
}
