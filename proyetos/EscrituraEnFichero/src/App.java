import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.Scanner;

import logCutre.LogDaw;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Escritura en fichero!");

        //Scanner sc = new Scanner(System.in);

        String nombreFicher = "ficheroNuevo.txt";
        String path = "src/recursos/";

        // FileWriter fileWriter = null;
        // BufferedWriter bufferedWriter = null;
        // try 
        // {
        //     fileWriter = new FileWriter(path+ nombreFicher, false);

        try (FileWriter fileWriter = new FileWriter(path+ nombreFicher, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             Scanner sc = new Scanner(System.in) )
        {

            // fileWriter.append('X');

            // fileWriter.append("\nAlfonso");
            //bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Dime la 1º linea...");
            String linea = sc.nextLine();
            
            while (!linea.equals("fin"))
            {
                LogDaw.NuevaEntradaALog("Se ha escrito: " + linea, LogDaw.Tipo.INFORMACION);
                bufferedWriter.write(linea);
                bufferedWriter.newLine();
                System.out.println("Dime otra linea...");
                linea = sc.nextLine();
            }

            // bufferedWriter = new BufferedWriter(fileWriter);

            // bufferedWriter.write("OTRA LINEA");

            // bufferedWriter.newLine();

        }
        catch(Exception ex)
        {
            LogDaw.NuevaEntradaALog(ex.toString(), LogDaw.Tipo.ERROR);
            //System.out.println(ex);
        }
        finally
        {
            

            //sc.close();

        }


    }
}
