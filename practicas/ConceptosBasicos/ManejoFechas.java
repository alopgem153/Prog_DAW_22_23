package ConceptosBasicos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;


public class ManejoFechas {

    public static void main(String[] args) {
        
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        Instant instante = Instant.now();

        System.out.println("Fecha ahora: " + fechaActual);
        System.out.println("Hora ahora: " + horaActual);
        System.out.println("Fecha-Hora ahora: " + fechaHoraActual);
        System.out.println("Instante: " + instante);

        System.out.println("---------------------------------");
        //Crear Fecha - of()
        LocalDate fechaCumple = LocalDate.of(2000,1,15);
        LocalTime horaExamen = LocalTime.of(12,45);
        LocalDateTime concierto = LocalDateTime.of(2022, 12, 15,20,30);

        System.out.println("Fecha ahora: " + fechaCumple);
        System.out.println("Hora ahora: " + horaExamen);
        System.out.println("Fecha-Hora ahora: " + concierto);

        //LocalDate febrero29 = LocalDate.of(2022,2,29);

        //Partes de una fecha
        System.out.println("Dia concierto: " + concierto.getDayOfMonth());
        System.out.println("Hora concierto: " + concierto.getHour());

        System.out.println("---------------------------------");
        //Añadir/quitar tiempo plus/minus
        System.out.println("En dos semanas: "+ fechaActual.plusWeeks(2));
        System.out.println("HoraActual: "+ fechaHoraActual);
        System.out.println("Hace 12 horas: "+ fechaHoraActual.minusHours(12));

        //Ajustes temporales
        
        System.out.println("Primer dia del mes: "+ 
            fechaActual.with(TemporalAdjusters.firstDayOfNextMonth()));
        

        //Dar formato a una fecha
        DateTimeFormatter formatoMio = DateTimeFormatter.ofPattern("dd/MM/yyyy 'dia' EEEE");
        System.out.println("Fecha con formato: "+ fechaActual.format(formatoMio));

        System.out.println("Fecha con formato Español: "
                    + fechaActual.format(
                        formatoMio.withLocale(new Locale("en", "UK"))));

        System.out.println("---------------------------------");
        
        //Diferencias entre fechas Period  y ChronoUnit
        System.out.println("Tengo la edad de "+ 
                ChronoUnit.YEARS.between(fechaCumple, LocalDate.now()));
        
        int diasVividos = (int)ChronoUnit.DAYS.between(fechaCumple, fechaActual);
        System.out.println("Dias vividos: "+ diasVividos);

        LocalDate finAno = LocalDate.of(2022,12,31);

        System.out.println("---------------------------------");
        
        Period hastaFinAno = fechaActual.until(finAno);
        System.out.println("Hasta final de año queda: "+ hastaFinAno);
        System.out.println("Quedan " + hastaFinAno.getYears() + " años, "
                             + hastaFinAno.getMonths()+ 
                        " meses y "+ hastaFinAno.getDays() + " días") ;                


        //Pedir fecha de nacimiento
        //mostrarla en pantalla - > dias - mesConletras - yy
        //Mostrar la edad
        //cuanto queda para tu proximo cumpleaños (con chronounit y Period)
        
    }
    
}
