package Vectores;

import java.util.Arrays;

public class Ejer4Arrays {
    
    public static void main(String[] args) {
        
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        rellenarAleatorio(numero);
        

        rellenarConExponente(cuadrado, numero, 2);

        rellenarConExponente(cubo, numero, 3);

        // System.out.println(Arrays.toString(numero));
        // System.out.println(Arrays.toString(cuadrado));
        // System.out.println(Arrays.toString(cubo));

        pintarValores(numero, cuadrado, cubo);
    }

    static void rellenarAleatorio(int[] array)
    {
        for(int i = 0; i<20; i++)
        {
            int aleatorio = (int)(Math.random()*101);
            array[i]= aleatorio;
        }
    }

    static void rellenarConExponente(int[] arrayDestino, int[] arrayOrigen, int exponente)
    {
        for(int i=0; i<arrayOrigen.length; i++)
        {
            //int numero = ;
            //int nuevoValor = 
            arrayDestino[i] = (int)Math.pow(arrayOrigen[i], exponente);
        }
    }

    static void pintarValores(int[] array1, int[] array2, int[] array3)
    {
        for(int i = 0; i< array1.length; i++)
        {
            System.out.println(array1[i] + " \t" + array2[i] + "\t" + array3[i]);
        }
    }
}
