package Vectores;

import java.util.Arrays;

public class UtilesArraysAlfonso {
    
    /**
     * 
     * @param array
     */
    static int[] limpiar(int[] array)
    {
        int[] nuevo = new int[0];
        return nuevo;
        
    }

    /**
     * 
     * @param array
     * @param posicion
     * @return
     */
    static int[] insertarEnPosicion(int[] array, int nuevoElemento, int posicion)
    {
        //insertar el nuevo valor en esa posicion en el nuevo array
            
        int[] nuevo = new int[array.length+1];

        //comprobar si la posicion está dentro de nuevo
        //TO-DO

        //inserto la parte izquierda del array (de 0 a posicion-1)
        for (int i = 0; i < posicion; i++) 
        {
            nuevo[i] = array[i];    
        }

        //inserto el nuevo elemento
        nuevo[posicion] = nuevoElemento;

        //inserto la parte derecha del array (de posicion a ultimo elemento)
        for (int i = posicion; i < array.length; i++) 
        {
            nuevo[i+1] = array[i];    
        }

        return nuevo;
    }

    /**
     * Insertar un elemento nuevo en un array ordenado
     * @param array
     * @param elementoNuevo
     * @return
     */
    static int[] insertarOrdenado(int[] array, int elementoNuevo)
    {
        int[] nuevo;

        //Encontrar en la posicion de insercion
        int posicionInsercion = 0;

        boolean noEncontradoPosicion = true;

        for (int i = 0; i < array.length; i++) 
        {
            if (elementoNuevo < array[i] && noEncontradoPosicion)
            {
                posicionInsercion = i;
                noEncontradoPosicion = false;
            }    
        }

        if (noEncontradoPosicion)
        {
            posicionInsercion = array.length;
        }

        
        nuevo = insertarEnPosicion(array, elementoNuevo, posicionInsercion);
        return nuevo;
    }

    static int[] insertarAlFinal(int[] array, int nuevoValor)
    {
        int[] nuevo = new int[array.length+1];

        for (int i = 0; i < array.length; i++) 
        {
            nuevo[i] = array[i];    
        }

        nuevo[nuevo.length-1] = nuevoValor;

        return nuevo;
    }
}
