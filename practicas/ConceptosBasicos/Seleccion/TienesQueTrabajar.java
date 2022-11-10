package ConceptosBasicos.Seleccion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TienesQueTrabajar {
    public static void main(String[] args) {
        /*
         * Lee de teclado el dia de la semana en letras
         * Si es de lunes a viernes -> escribe "Hay que trabajar"
         * Si es Sab o domingo -> escribe fiesta
         * Controla que esté bien escrito y 
         * no distingas entre mayus y minus
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Dime un dia de la semana");
         String diaSemana = sc.nextLine();
        
        int diasHastaFinDeSemana = 0;

         diaSemana = diaSemana.toLowerCase();
         switch(diaSemana)
         {
            case "lunes":
                diasHastaFinDeSemana = diasHastaFinDeSemana + 1;
            case "martes":
                diasHastaFinDeSemana += 1;
            case "miercoles":
                diasHastaFinDeSemana++;
            case "jueves":
                diasHastaFinDeSemana++;
            case "viernes":
                diasHastaFinDeSemana++;
                System.out.println("TRABAJAAAAAA");
                break;
            case "sabado":
            case "domingo":
                System.out.println("FIESTAAAA");
                break;
            default:
                System.out.println("Error");

         }  //end switch

         
         if (diasHastaFinDeSemana>0)
         {
            System.out.println("faltan "+ diasHastaFinDeSemana + " hasta el fin de semana");
         }


    }
    
}
