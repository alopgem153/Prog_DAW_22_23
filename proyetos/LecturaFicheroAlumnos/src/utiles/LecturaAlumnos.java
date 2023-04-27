package utiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.processing.FilerException;

import modelos.Alumno;

public class LecturaAlumnos {

    public static ArrayList<Alumno> leerFichero() 
    {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        FileReader fileReader= null;
        BufferedReader bufferedReader = null;


        try {
            fileReader = new FileReader("src/recursos/ficheroAlumnos");
            bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();

            //La 1º linea es la cabcera y nos la saltamos
            linea = bufferedReader.readLine();

            while(linea != null)
            {
                try 
                {
                    String[] trozosLinea = linea.split(" ");

                    //System.out.println(Arrays.toString(trozosLinea));
                    Alumno alumnoNuevo = new Alumno(trozosLinea[0].trim(),
                                    Integer.valueOf(trozosLinea[1].trim()), 
                                    Double.valueOf(trozosLinea[2].trim().replace(",", ".")),
                                    Integer.valueOf(trozosLinea[3].trim()), 
                                    Integer.valueOf(trozosLinea[4].trim()), 
                                    trozosLinea[5].trim());

                    listaAlumnos.add(alumnoNuevo);
                }
                catch(Exception ex)
                {
                    System.out.println("Error en la linea: " + linea);
                }

                linea = bufferedReader.readLine();
            }


        } catch (Exception e) {
            System.out.println(e);
        }
        finally
        {
            try 
            {
                if (bufferedReader != null)
                {
                    bufferedReader.close();
                }
                if (fileReader != null)
                {
                    fileReader.close();
                }
            }catch(IOException ioException)
            {
                System.out.println("Error de ioException");
            }
        }

        return listaAlumnos;
    }
    
}
