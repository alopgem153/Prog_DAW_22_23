package Vectores;

import java.util.Arrays;

public class Ejer1Bidimensional {

    public static void main(String[] args) {
        
        //Declarar el array 5x5
        int[][] matriz = new int[5][5];

        //rellenar la matriz
        rellenarMatriz(matriz);

        //mostrar la matriz
        System.out.println(Arrays.deepToString(matriz));
        imprimirMatriz(matriz);

        System.out.println("------------------------");
        
        //mostrar la matriz pero por columnas
        imprimirMatrizinvertida(matriz);
    }

    static void rellenarMatriz(int[][] arrayBid)
    {
        //recorrer la matriz
        for (int fila = 0; fila < arrayBid.length; fila++) 
        {
            int[] filaArray = arrayBid[fila];    

            for (int columna = 0; columna < filaArray.length; columna++) 
            {
                int valorPosicion = (10 * fila)+ columna;
                filaArray[columna] = valorPosicion; // arrayBid[fila][columna] = valorPosicion
            }
        }
    }

    static void imprimirMatriz(int[][] arrayBid)
    {
        //recorrer la matriz
        for (int fila = 0; fila < arrayBid.length; fila++) 
        {
            int[] filaArray = arrayBid[fila];    

            for (int columna = 0; columna < filaArray.length; columna++) 
            {
               System.out.print(filaArray[columna] + " "); 
            }
            System.out.println();
        }
    }

    static void imprimirMatrizinvertida(int[][] arrayBid)
    {
        //recorrer la matriz
        for (int columna = 0; columna < arrayBid[0].length; columna++) 
        {
            
            for (int fila = 0; fila < arrayBid.length; fila++) 
            {
               System.out.print(arrayBid[fila][columna] + " "); 
            }
            System.out.println();
        }
    }
    
}
