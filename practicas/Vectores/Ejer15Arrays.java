package Vectores;

import java.security.MessageDigest;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Ejer15Arrays {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        //Declarar el array
        int[] mesas = new int[10];
        
        //rellenar el array
        rellenarMesas(mesas);

        //pintar las mesas
        imprimir(mesas);

        //mostrar total de comensales 
        imprimirTotalComensales(mesas);

        boolean salir = false;
        //bucle para introducir personas -1 para salir
        do
        {
            //preguntar por la cantidad de personas
            System.out.println("¿Cuantos son? (-1 para salir)");
            int cantidad = sc.nextInt();

            //Actualizamos variable de salida
            salir = (cantidad == -1);

            if (cantidad == -1)
            {
                salir = true;
            }
            else if (cantidad > 4)
            {
                System.out.println("No puede haber grupos mayores de 4");
            }
            else 
            {
                 //introducir personas en array
                 int numeroMesaVacia = buscarPrimeraMesaVacia(mesas);

                 if (numeroMesaVacia >= 0)
                 {
                    mesas[numeroMesaVacia] = cantidad;
                    System.out.println("Sientensen en la mesa: " + (numeroMesaVacia+1));
                 }
                 else
                 {
                    //no hay mesas vacias
                    //hay que compartir
                    numeroMesaVacia = buscarMesaParaCompartir(mesas, cantidad);

                    if (numeroMesaVacia >= 0)
                    {
                        System.out.println("Tiene que compartir. Sientese en la mesa: "+ (numeroMesaVacia+1));
                        mesas[numeroMesaVacia] = mesas[numeroMesaVacia] + cantidad;
                    }
                    else
                    {
                        System.out.println("No hay hueco para ustedes, vuelvan otro día.");
                    }
                 }

                //pintar las mesas
                imprimir(mesas);
            }
           
        } while(!salir);



    }

    static void imprimir(int[] mesas)
    {

        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.println("│Mesa no  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │");
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.println("│Ocupación│" + cadenaOcupantes(mesas));
        System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    }

    static String cadenaOcupantes(int[] array)
    {
        String cadenaResultado = "";

        for (int i = 0; i < array.length; i++) 
        {
            int ocupacionMesa = array[i];
            cadenaResultado += " " + ocupacionMesa + "  |";
        }
        return cadenaResultado;
    }


    static void imprimirTotalComensales(int[] array)
    {
        int totalComensales = 0;

        for (int i = 0; i < array.length; i++) 
        {
           totalComensales += array[i];     
        }

        System.out.println("Total de comensales= " + totalComensales);
    }

    /**
     * Rellenamos las posiciones de array con numeros aleatorios de 0 a 4
     * @param array
     */
    static void rellenarMesas(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int aleatorio = (int)(Math.random()*5);
            array[i] = aleatorio;    
        }

    }

    static int buscarPrimeraMesaVacia(int[] array)
    {
        boolean noEncontrada = true;
        int mesaVacia = -1;

        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] == 0 && noEncontrada)
            {
                mesaVacia = i;
                noEncontrada = false;
            }
        }

        return mesaVacia;
    }

    static int buscarMesaParaCompartir(int[] array, int numPersonas)
    {
        int mesaParaCompartir = -1;
        boolean noEncontrada = true;

        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] + numPersonas <= 4 && noEncontrada)
            {
                mesaParaCompartir = i;
                noEncontrada = false;
                
            }    
        }
        return mesaParaCompartir;
    }
}
