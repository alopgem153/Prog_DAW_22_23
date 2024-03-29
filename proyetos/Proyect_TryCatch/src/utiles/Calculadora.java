package utiles;

import java.util.Arrays;

public class Calculadora {

    public int suma(int x, int y)
    {
        return x+y;
    }

    public int multiplicacion(int x, int y)
    {
        return x*y;
    }
    

    public Integer division(int x, int y)
    {

        Integer resultado = null;

        try
        {
            System.out.println("vamos a por la division");
            resultado = x/y;
            System.out.println("fin division");
        }
        catch(ArithmeticException aritException)
        {
            System.out.println("Estas dividiendo por 0");

            System.out.println(aritException);

            System.out.println(aritException.getMessage());

            System.out.println(Arrays.toString(aritException.getStackTrace()));

            aritException.printStackTrace();
        }


        return resultado;
    }


    public Integer division2(int x, int y) throws ArithmeticException
    {
        Integer resultado = x/y;
        return resultado;
    }


    public Integer division3(int x, int y) 
    {
        Integer resultado = null;

        try 
        {

            if(y==0)
            {
                //throw new ExcepcionDivision();
                throw new ExcepcionDivision("La division" + x + 
                                " entre " + y + " no es posible");
            }
            else
            {
                resultado = x / y;
            }
        }
        catch(ExcepcionDivision exDiv0)
        {
            System.out.println(exDiv0.getMessage());
        }

        return resultado;

    }
}
