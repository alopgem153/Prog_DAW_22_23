package ConceptosBasicos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Practica1Eje1 {
    
    public static void main(String[] args) {
        /*
         * Realiza un programa que pregunte la fecha y hora del examen de Programación.
            Dada dicha fecha:

            Muéstrala en el formato: "El examen será el LUNES, 15 de MAYO del 23"
            Indica cuantos horas quedan hasta ese día
         */

         int dia = 25;
         int mes = 10;
         int anio = 2022;
         int hora= 12;
         int minutos = 45;

         LocalDateTime fechaExamen = LocalDateTime.of(anio, mes, dia, hora, minutos);
         
         DateTimeFormatter formatoAlfonso = DateTimeFormatter.ofPattern("'El examen será el ' EEEE ',' dd 'de' LLLL 'del' yy");
         System.out.println(fechaExamen.format(formatoAlfonso));

         long horasQueFaltan = ChronoUnit.HOURS.between(LocalDateTime.now(), fechaExamen);

         System.out.println("Faltan "+ horasQueFaltan + " horas para el examen");

    }
}
