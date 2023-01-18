package Vectores;

import java.util.Arrays;

public class Ejer2Bidimensional {
    
    public static void main(String[] args) {
        

        //declarar la matriz
        int[][] matriz = new int[4][4];

        //rellenar la matriz
        rellenarMatrizAleatoria(matriz);

        //pintar la matriz
        //System.out.println(Arrays.deepToString(matriz));
        imprimirMatriz(matriz);

        boolean esMagica = esMagica(matriz);

        if (esMagica)
        {
            System.out.println("Es Magica");    
        }
        else
        {
            System.out.println("No MAGIC");
        }
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

    static boolean esMagica(int[][] arrayBid)
    {
        boolean resultado = true;

        int valorCheck = 0;
        //comprobamos las sumas de las filas
        int sumaFila = 0;

        for (int i = 0; i < arrayBid.length; i++) 
        {
            int[] fila = arrayBid[i];
            for (int j = 0; j < fila.length; j++) 
            {
                sumaFila += fila[j];    
            }

            if(i == 0)
            {
                valorCheck = sumaFila;
            }
            else
            {
                resultado = (resultado && (valorCheck == sumaFila));
            }
        }

        //comprobamos la suma de las columnas
        for (int i = 0; i < arrayBid[0].length; i++) 
        {
            int sumaColumna = 0;

            for (int j = 0; j < arrayBid.length; j++) 
            {
               sumaColumna += arrayBid[j][i]; 
            }    

            resultado = resultado && (valorCheck == sumaColumna);

        }
    
        return resultado;

    }

}
