import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, lectra Ficheros!");



        System.out.println("Leo con FileReader");
        FileReader fr = null;

        try 
        {

            fr = new FileReader("src/recursos/fichero1.txt");

            int caracterLeido = fr.read();

            while (caracterLeido != -1)
            {
                System.out.print((char)caracterLeido);
                caracterLeido = fr.read();
            }

        }
        catch(FileNotFoundException fileNotFoundException)
        {
            System.out.println(fileNotFoundException.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if (fr != null)
            {
                fr.close();
            }
        }


        System.out.println("-----------------------------");
        System.out.println("Leo con BufferReader");

        BufferedReader bf = null;

        try {
            fr = new FileReader("src/recursos/fichero.txt");
            bf = new BufferedReader(fr);
            //Es equivalente a:
            //bf = new BufferedReader(new FileReader("src/recursos/fichero1.txt"));

            String linea = bf.readLine();

            while (linea != null)
            {
                System.out.println(linea);
                linea = bf.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally
        {
            if (bf != null)
            {
                bf.close();
            }
            if (fr != null)
            {
                fr.close();
            }


        }

        System.out.println("-----------------------------");
        System.out.println("Leo con Scanner");

        int sumaTotal = 0;

        String numeros = "10 34 a6 20";
        Scanner sc = new Scanner(numeros);

        
        while (sc.hasNextInt())
        {
            int numeroNuevo = sc.nextInt();
            sumaTotal += numeroNuevo;
        }

        System.out.println("Suma total = " + sumaTotal);

        sc.close();

        sumaTotal = 0;
        //Utilizando String
        String[] trozosNumeros = numeros.split(" ");
        for (int i = 0; i < trozosNumeros.length; i++) 
        {
            try 
            {
                int numero = Integer.valueOf(trozosNumeros[i]);
                sumaTotal += numero;
            }
            catch(NumberFormatException numberFormatException)
            {
                System.out.println(numberFormatException.getMessage());
            }
        }
    
        System.out.println("Suma total2 = " + sumaTotal);


        System.out.println("-----------------------------");
        System.out.println("Lectura de Numeros");
        System.out.println();

        fr = new FileReader("src/recursos/ficheroNumeros.txt");
        bf = new BufferedReader(fr);

        int  totalLinea = 0;
        int linea = 1;
        String lineaLeida = null;

        //Hago un bucle para leer cada línea y procesar su suma
        do 
        {
            try
            {
                totalLinea = 0;
                lineaLeida = bf.readLine();

                if (!lineaLeida.isEmpty())
                {
                    String[] lineaTroceada = lineaLeida.split(" ");
                    

                    for (String trozo : lineaTroceada) 
                    {
                        try 
                        {
                            int numero = Integer.valueOf(trozo);
                            totalLinea += numero;
                        }
                        catch(Exception ex)
                        {
                            System.out.println("Error: " + ex.getMessage());
                        }
                    }

                    System.out.println("Suma linea " + linea + " = "+ totalLinea);
                }
                else
                {
                    System.out.println("Linea " + linea + " Vacia");
                }
                linea++;
            }
            catch(Exception ex)
            {
                //System.out.println(ex);
            }
        

        }while (lineaLeida != null);

    }

    
}
