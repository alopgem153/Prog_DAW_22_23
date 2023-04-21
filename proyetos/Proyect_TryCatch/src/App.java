import java.io.IOException;

import clases.clases2.LecturaTeclado;
import utiles.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Try-Catch!");


        Calculadora calc = new Calculadora();

        int resultadoDiv = calc.division(10, 2);

        System.out.println(resultadoDiv);


        Integer resultadoDiv2 = calc.division(10, 0);

        if(resultadoDiv2 != null)
        {
            System.out.println(resultadoDiv2);
        }
        else
        {
            System.out.println("No se ha realizado la division");
        }


        System.out.println("---------------------------------");

        try
        {
            int resultadoDivision2 = calc.division2(50, 0);
            System.out.println(resultadoDivision2);
        }
        catch(ArithmeticException atitException)
        {
            System.out.println(atitException.getMessage());
        }
        catch(Exception atitException)
        {
            System.out.println(atitException.getMessage());
        }
        finally
        {
            //cerrar conexiones, ficheros y Scanner
        }

        System.out.println();

        
        System.out.println("---------------------------------");

        // LecturaTeclado lc = new LecturaTeclado();

        // System.out.println("Dime un numero entero");
        // int numeroLeido = lc.leerInteger();

        // System.out.println("Numero leido: "+ numeroLeido);

        // lc.finalizar();

        // numeroLeido = lc.leerInteger();

        // System.out.println("Numero leido: "+ numeroLeido);

        Integer resultadoDiv3 = calc.division3(10, 5);

        System.out.println(resultadoDiv3);

        resultadoDiv3 = calc.division3(10, 0);

        System.out.println(resultadoDiv3);

        
    }
}
