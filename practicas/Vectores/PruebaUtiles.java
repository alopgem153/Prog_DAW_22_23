package Vectores;

import java.util.Arrays;

public class PruebaUtiles {
    
    public static void main(String[] args) {
        
        int[] lista = new int[0];

        lista = UtilesArraysAlfonso.limpiar(lista);

        lista = UtilesArraysAlfonso.insertarOrdenado(lista, 5);

        System.out.println(Arrays.toString(lista));

        lista = UtilesArraysAlfonso.insertarOrdenado(lista, 10);

        lista = UtilesArraysAlfonso.insertarOrdenado(lista, 7);

        lista = UtilesArraysAlfonso.insertarOrdenado(lista, 20);

        lista = UtilesArraysAlfonso.insertarOrdenado(lista, 3);

        System.out.println(Arrays.toString(lista));

    }
}
