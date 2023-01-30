package Vectores;

import java.util.Arrays;

public class Ejer13Bidimensional {

    public static void main(String[] args) {
        
        String[] paises = { "ESP", "RUS", "JAP", "AUS"};

        int[][] alturas = new int[4][10];

        rellenarConAleatorios(alturas);
        
        System.out.println(Arrays.deepToString(alturas));

        mostrarAlturas(paises, alturas);
    }   

    static void rellenarConAleatorios(int[][] arrayBid)
    {
        for (int i = 0; i < arrayBid.length; i++) //recorro cada fila
        {
            int[] alturaPais = arrayBid[i];
            
            for (int j = 0; j < alturaPais.length; j++) //recorro cada elemento de alturaPais
            {
                int alturaAleatoria = (int)(Math.random()*(210-139) + 140);    
                alturaPais[j] = alturaAleatoria;
                //arrayBid[i][j] = alturaAleatoria;
            }
        }
    }
    
    static void mostrarAlturas(String[] paises, int[][] alturas)
    {
        //for (int i = 0; i < alturas.length; i++) 
        for (int i = 0; i < paises.length; i++) 
        {
            System.out.print(paises[i]);
            int[] alturasPais = alturas[i];
            
            for (int j = 0; j < alturasPais.length; j++) 
            {
                System.out.print(alturasPais[j] +" \t" );
            }
            
            //calcular media
            int media = mediaAlturas(alturasPais);
            //calcular el maximo y minimo
            int[] arrayMaxiMin = calcularMaximoMinimo(alturasPais);

            System.out.print(" | "+ arrayMaxiMin[0] + " " + arrayMaxiMin[1]);

            System.out.println();
        }

    }

    static int mediaAlturas(int[] fila)
    {
        int media = 0;
        for (int i = 0; i < fila.length; i++) 
        {
            media += fila[i];        
        }
        if (fila.length > 0)
        {
            media = media / fila.length;
        }
        return media;
    }

    /**
     * Calcula el mx y min de un array
     * @param fila
     * @return devuelve un array de 2 posiciones donde la posicion 0 es el maximo y la posicion 1 es el minimo del array original
     */
    static int[] calcularMaximoMinimo(int[] fila)
    {
        int[] resultado = new int[2];

        int maximo = fila[0];
        int minimo = fila[0];

        for (int i = 1; i < fila.length; i++) 
        {
            if (fila[i]>maximo)
            {
                maximo = fila[i];
            }

            if (fila[i]< minimo)
            {
                minimo = fila[i];
            }
        }

        resultado[0] = maximo;
        resultado[1] = minimo;

        return resultado;
    }

}
