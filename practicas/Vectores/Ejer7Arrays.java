package Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer7Arrays {
    
    public static void main(String[] args) {
        
        int[] array = new int[100];
        
        rellenarAleatorio(array);
        
        System.out.println(Arrays.toString(array));
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Que numero quiere sustituir...");
        int numeroBuscado = sc.nextInt();

        System.out.println("Que nuevo valor quiere darle...");
        int nuevo = sc.nextInt();

        int[] posicionesDeCambio = cambiarValor(array, numeroBuscado, nuevo);

        imprimirArray(array, nuevo, posicionesDeCambio);
        
        
    }

    static void rellenarAleatorio(int[] array)
    {
        for(int i = 0; i<array.length; i++)
        {
            int aleatorio = (int)(Math.random()*21);
            array[i]= aleatorio;
        }
    }

    static int[] cambiarValor(int[] array, int buscado, int nuevo)
    {
        int[] posicionesCambio = new int[100];

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == buscado)
            {
                posicionesCambio[i] = 1;
                array[i] = nuevo;
            }
        }

        return posicionesCambio;
    }

    static void imprimirArray(int[] array, int valorNuevo, int[] poscionesCambio)
    {
        for(int i = 0; i< array.length ; i++)
        {
            if(array[i] != valorNuevo)
            {
                System.out.print(array[i] + " ");
            }
            else if(array[i] == valorNuevo && poscionesCambio[i] != 1)
            {
                System.out.print(array[i] + " ");
            }
            else 
            {
                System.out.print("\"" + array[i] + "\" ");
            }
            
        }
    }
    
}
