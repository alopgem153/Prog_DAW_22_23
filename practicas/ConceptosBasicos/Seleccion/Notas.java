package ConceptosBasicos.Seleccion;

public class Notas {
    public static void main(String[] args) {
        /*
         * Dado una nota numerica de 0 a 10
         * Imprima su nota en Letra
         * 0-4.9 -> suspenso
         * 5-6.9 -> aprobao
         * 7-8.9 -> Notable
         * 9-9.9 -> Sobre
         * 10 -> Matricula
         * Controla que la nota es un numero entre
         * 0 y 10;
         */

         double notaNumerica = Math.random() * 11;

        String nota = "";
        String  error = "";

        if (notaNumerica >= 0 && notaNumerica <= 10)
        {
            if (notaNumerica < 4)
            {
                nota = "Suspenso";
            } 
            else if(notaNumerica <5)
            {
                int plusNota = 1;
                notaNumerica = notaNumerica + plusNota;
                nota = " Aprobado*";
            }
            else if(notaNumerica >= 5 && notaNumerica < 7)
            {

                nota = "Aprobado";
            }
            else if (notaNumerica < 9)
            {
                nota = "Notable";
            }
            else if (notaNumerica < 10)
            {
                nota = "Sobresaliente";

            }
            else if (notaNumerica < 11)
            {
                nota = "Matricula";
                

            }
        }
        else //notaNumerica >= 0 && notaNumerica <= 10
        {
            error = "La nota numerica no está bien, fuera del rango";
        }
        

         //Mostrar la información
         if(error.length() > 0)
         {
            System.out.println(error);
         }
         else 
         {
            System.out.println("La nota "+ notaNumerica 
                + " es: " + nota );
         }

         

    }
    
}
