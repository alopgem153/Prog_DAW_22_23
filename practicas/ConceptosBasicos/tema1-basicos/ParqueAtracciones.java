package ConceptosBasicos;

import java.util.Scanner;

public class ParqueAtracciones {

    public static void main(String[] args) {
        
        /*
         * Existen las entradas infantiles a 15,50€ 
         * y de adultos a 20€. 
         * En caso de que el importe sea mayor a 100€ 
         * se aplicará un descuento del 5%
         */

         final float PRECIO_ADULTO = 20f;
         final float PRECIO_INFANTIL = 15.5f;
         final float DESCUENTO = 0.05f;

         Scanner sc = new Scanner(System.in);

         System.out.println("Entradas de adulto?");
         int entradasAdulto = sc.nextInt();

         System.out.println("Entradas de infantiles?");
         int entradasInfantiles = sc.nextInt();

         float precioEntradas = (entradasAdulto * PRECIO_ADULTO) + (entradasInfantiles * PRECIO_INFANTIL);

         //precioEntradas = (precioEntradas > 100) ? precioEntradas - precioEntradas * DESCUENTO : precioEntradas;
     
        float descuento = (precioEntradas > 100) ? precioEntradas * DESCUENTO : 0;

        precioEntradas = precioEntradas - descuento;

         System.out.println("El precio total es: "+ precioEntradas + " con un descuento de:" + descuento);
    }
    
}
