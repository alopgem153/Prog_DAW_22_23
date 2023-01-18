package Vectores;

import java.util.Arrays;

public class Ejer3Bidimensional {
    
    public static void main(String[] args) {
        

        //declarar la matriz
        int[][] matriz = new int[4][5];

        //rellenar la matriz
        rellenarMatrizAleatoria(matriz);

        //pintar la matriz
        //System.out.println(Arrays.deepToString(matriz));
        imprimirMatriz(matriz);
    }

    static void rellenarMatrizAleatoria(int[][] arrayBid)
    {
        for (int fila = 0; fila < arrayBid.length; fila++) 
        {
            for (int columna = 0; columna < arrayBid[0].length; columna++) 
            {
                int aleatorio = (int)(Math.random()*15);
                arrayBid[fila][columna] = aleatorio;
            }
            
        }
    }

    static void imprimirMatriz(int[][] arrayBid)
    {
        //recorrer la matriz
        for (int fila = 0; fila < arrayBid.length; fila++) 
        {
            int[] filaArray = arrayBid[fila];    
            
            int sumaFila = 0;
            for (int columna = 0; columna < filaArray.length; columna++) 
            {
               System.out.print(filaArray[columna] + "\t "); 
               sumaFila += filaArray[columna];
            }
            System.out.println( " suma total = " + sumaFila);
        }
        System.out.println("-----------------------------------------");
        
        int total = 0;
        //calculo el total de cada columna
        for (int columna = 0; columna < arrayBid[0].length; columna++) 
        {
                int sumaColumna = 0;
                for (int fila = 0; fila < arrayBid.length; fila++) 
                {
                    sumaColumna += arrayBid[fila][columna];
                }
                total += sumaColumna;
                System.out.print(sumaColumna + "\t");
        }
        System.out.println(total);
    }

}
