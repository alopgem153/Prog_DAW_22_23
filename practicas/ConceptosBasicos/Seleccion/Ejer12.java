package ConceptosBasicos.Seleccion;

import java.util.Scanner;

public class Ejer12 {
    public static void main(String[] args) {
        /*
         * 5 preguntas, del tipo
         * 
         * ¿has acertado la pregunta X (T/F)?
         * 
         * Si ha acertado 2 ptos
         * Si no ha acertado -0.5 ptos
         * 
         * Indica la nota final del alumno en el examen
         */

            double nota = 0;
            int respuestasAcertadas = 0;
            int respuestasFalladas = 0;


         Scanner sc = new Scanner(System.in);

         System.out.println("¿has acertado la pregunta 1 (T/F)?");
         String respuesta = sc.nextLine();

         if (respuesta.equals("t"))
         {
            //nota = nota +2;
            nota += 2;
            respuestasAcertadas++;
         }
         else 
         {
            nota = nota - 0.5;
            respuestasFalladas++;
         }

         System.out.println("¿has acertado la pregunta 2 (T/F)?");
         respuesta = sc.nextLine();

         if (respuesta.equals("t"))
         {
            //nota = nota +2;
            nota += 2;
            respuestasAcertadas++;
         }
         else 
         {
            nota = nota - 0.5;
            respuestasFalladas++;
         }

         System.out.println("¿has acertado la pregunta 3 (T/F)?");
         respuesta = sc.nextLine();

         if (respuesta.equals("t"))
         {
            //nota = nota +2;
            nota += 2;
            respuestasAcertadas++;
         }
         else 
         {
            nota = nota - 0.5;
            respuestasFalladas++;
         }

         System.out.println("¿has acertado la pregunta 4 (T/F)?");
         respuesta = sc.nextLine();

         if (respuesta.equals("t"))
         {
            //nota = nota +2;
            nota += 2;
            respuestasAcertadas++;
         }
         else 
         {
            nota = nota - 0.5;
            respuestasFalladas++;
         }

         System.out.println("¿has acertado la pregunta 5 (T/F)?");
         respuesta = sc.nextLine();

         if (respuesta.equals("t"))
         {
            //nota = nota +2;
            nota += 2;
            respuestasAcertadas++;
         }
         else 
         {
            nota = nota - 0.5;
            respuestasFalladas++;
         }

         if (nota < 0)
         {
            nota = 0;
         }

         sc.close();
         System.out.println("La nota final es: "+ nota);
         System.out.println("Aciertos: " + respuestasAcertadas);
         System.out.println("Fallos: " + respuestasFalladas);
    }
}
