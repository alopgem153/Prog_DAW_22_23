package Vectores;

import java.util.Arrays;

public class Ejer6Arrays {
    
    public static void main(String[] args) {
        
        int[] array = new int[20];
        
        rellenarAleatorio(array);
        
        System.out.println(Arrays.toString(array));
        
        //rotarArray(array);

        //System.out.println(Arrays.toString(array));

        rotarXVeces(array, 5);
        
        System.out.println(Arrays.toString(array));
        
    }

    static void rellenarAleatorio(int[] array)
    {
        for(int i = 0; i<20; i++)
        {
            int aleatorio = (int)(Math.random()*101);
            array[i]= aleatorio;
        }
    }


    static void rotarXVeces(int[] array, int numeroRotaciones)
    {
        for(int i = 0; i < numeroRotaciones; i++)
        {
            rotarArray(array);
        }

    }

    /**
     * Pasa cada elemeto a su posicion de la derecha,
     * el ultimo elemento pasa a la 1º posicion
     * @param array
     */
    static void rotarArray(int[] array)
    {
        int[] copia = Arrays.copyOfRange(array, 0, array.length);

        for(int i = 0; i<array.length; i++)
        {
            if(i< array.length -1) //caso base 
            {
                array[i+1] = copia[i];
            }
            else //caso de la ultima posicion (el valor que esta en 14 pasa a 0)
            {
                array[0] = copia[i];
            }
        }
    }
}
