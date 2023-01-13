package Vectores;

import java.util.Arrays;

public class ejer11Arrays {

    public static void main(String[] args) {
        
        //crear array inicial
        int[] matriz = new int[10];

        //rellenar el array inicial
        rellenarConAleatorios(matriz);

        //mostrar el array
        System.out.println(Arrays.toString(matriz));

        //buscar los primos
        int[] primosArray = buscarPrimos(matriz);

        //buscar lo NO primo
        int[] noPrimosArray = buscarNoPrimos(matriz);

        System.out.println("Primos: " + Arrays.toString(primosArray));
        System.out.println("No Primos: " + Arrays.toString(noPrimosArray));

        //unir primos + NOPrimos
        int[] todosArray = concatenarArrays(primosArray, noPrimosArray);

        //mostrar el array resultante
        System.out.println("Resultado: " + Arrays.toString(todosArray));
    }

    static void rellenarConAleatorios(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int aleatorio = (int)(Math.random()*16);    
            array[i] = aleatorio;
        }

    }

    static int[] buscarPrimos(int[] matriz)
    {
        int[] nuevo = new int[0];

        for (int i = 0; i < matriz.length; i++) 
        {
            if (ConceptosBasicos.Funciones.UtilesParaNumeros.esPrimo(matriz[i]))
            {
                nuevo = UtilesArraysAlfonso.insertarAlFinal(nuevo, matriz[i]);
            }    
        }

        return nuevo;
    }

    static int[] buscarNoPrimos(int[] matriz)
    {
        int[] nuevo = new int[0];

        for (int i = 0; i < matriz.length; i++) 
        {
            if (!ConceptosBasicos.Funciones.UtilesParaNumeros.esPrimo(matriz[i]))
            {
                nuevo = UtilesArraysAlfonso.insertarAlFinal(nuevo, matriz[i]);
            }    
        }

        return nuevo;
    }

    static int[] concatenarArrays(int[] array1, int[] array2)
    {
        //copio en resultado el array1
        int[] resultado = Arrays.copyOf(array1, array1.length);

        //añado todos los elementos de array2 insertando 1 a 1 por el final en resultado
        for (int i = 0; i < array2.length; i++) 
        {
            resultado = UtilesArraysAlfonso.insertarAlFinal(resultado, array2[i]);    
        }

        return resultado;
    }
    
}
