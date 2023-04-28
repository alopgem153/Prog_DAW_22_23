package logCutre;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogDaw {

    private  static String nombreFichero = "log.txt";

    public enum Tipo { ERROR, INFORMACION};

    public static void NuevaEntradaALog(String mensaje, Tipo tipo)
    {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("src/" + nombreFichero, true))) 
        {
            String horaMensaje = LocalDateTime.now().
                format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss"));

            String mensajeTotal =  horaMensaje + " - " + tipo + " : " + mensaje;

            bufferedWriter.write(mensajeTotal);
            bufferedWriter.newLine();

        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }
    
}
