package ConceptosBasicos.Seleccion;

import java.util.Scanner;


public class Ejer26 {
    
    public static void main(String[] args) {
        
        /*Precio Cine 
         *
         */

         final double PRECIO_ENTRADA_NORMAL = 8;
         final double PRECIO_DIA_ESPECTADOR = 5;
         final double PRECIO_PAREJA = 11;
         final double DESCUENTO_TARJETA = 10;

         Scanner sc = new Scanner(System.in);

         System.out.println("Cuantas entradas quieres?");
         int numeroPersonas = sc.nextInt();
         
         //Limpio buffer
         sc.nextLine();

         System.out.println("Que día es:");
         String diaSemana = sc.nextLine().toLowerCase();

         System.out.println("Tiene tarjeta cineClub? S/N");
         String tieneTarjeta = sc.nextLine().toLowerCase();

        sc.close();
    
        int entradasIndividuales = 0;
        int entradasDobles = 0;

        if (diaSemana.equals("jueves"))
        {
            entradasDobles = numeroPersonas / 2;
            entradasIndividuales = numeroPersonas % 2;
            
        }
        else
        {
            entradasIndividuales = numeroPersonas;
        }


        //Calculo el precio total
        double precioTotal = 0;

         switch (diaSemana)
         {
            case "miercoles":
                precioTotal = entradasIndividuales * PRECIO_DIA_ESPECTADOR;
                break;
            case "jueves":
                precioTotal = entradasDobles * PRECIO_PAREJA + (entradasIndividuales * PRECIO_ENTRADA_NORMAL);
                break;
            default:
                precioTotal = entradasIndividuales * PRECIO_ENTRADA_NORMAL;
         }

         //Calculo el descuento
         double descuento = 0;
         if (tieneTarjeta.equals("s"))
         {
            descuento = precioTotal * (DESCUENTO_TARJETA/100.0);
         }

         //Imprimo el resultado
         System.out.println("Aquí tiene sus entradas. Gracias por su compra.");

         if (entradasDobles>0)
         {
            System.out.println("Entradas parejas: " + entradasDobles);
            System.out.println("Precio entrada pareja: " + PRECIO_PAREJA);
         }

         if (entradasIndividuales > 0)
         {
            System.out.println("Entradas Individuales: " + entradasIndividuales);
            System.out.println("Precio por entrada individual "+ (diaSemana.equals("miercoles") ? PRECIO_DIA_ESPECTADOR : PRECIO_ENTRADA_NORMAL));
         }

         System.out.println("TOTAL: " + precioTotal);

         System.out.println("Descuento :"+ descuento);

         System.out.println("A pagar:" + (precioTotal - descuento));


         

    }
}
