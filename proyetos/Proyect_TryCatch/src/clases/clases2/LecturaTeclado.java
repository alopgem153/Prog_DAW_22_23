package clases.clases2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class LecturaTeclado {

    private Scanner sc;

    public LecturaTeclado()
    {
        sc = new Scanner(System.in);
    }



    public int leerInteger()
    {
        Integer resultado = null;

        boolean correcto = false;
        
        do
        {
            try
            {
                String cadenaLeida = sc.nextLine();
                resultado = Integer.valueOf(cadenaLeida);
                
                correcto = true;
                
            }
            
            catch(NumberFormatException excepcion1)
            {
                System.out.println("Dato no válido….Introduzca un dado válido por favor");
            }
            catch(IllegalStateException ex2)
            {
                System.out.println("Scanner cerrado");
                resultado = 0;
                correcto = true;
            }
            catch(Exception ex)
            {
                System.out.println("Dato no válido….Introduzca un dado válido por favor (cod-02)");
            }
            
            

        } while(!correcto);

        return resultado;
    }

    public void finalizar()
    {
        sc.close();
    }
    
}
