package practicas.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ejer100Numeros {

    /**
     * Crea una colección de 100 números (entre 1 y 10) 
     * que pueden estar repetidos. Después elimina todos 
     * los elementos que valen 5. 
     * Mostrar el antes y el después, 
     * indicando también el tamaño de la colección.
     */

     public static void main(String[] args) 
     {
        //Crear la lista
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        //Le inserto 20 numeros aleatorios (del 1 al 10)
        for (int i = 0; i < 100; i++) 
        {
            int numeroNuevo = (int)(Math.random()*5)+1;
            listaNumeros.add(numeroNuevo);    
        }

        System.out.println("Tamaño: " + listaNumeros.size());
        System.out.println(listaNumeros);

        //borro los 5's
        for (int index = 0; index < listaNumeros.size(); index++) 
        {
            Integer numeroLeido = listaNumeros.get(index);
            if (numeroLeido == 5)
            {
                listaNumeros.remove(numeroLeido);
                index--;
            }    
        }

        Integer num2 = 2;

        while(listaNumeros.contains(num2))
        {
            listaNumeros.remove(num2);
        }
        
        // ArrayList<Integer> listaAux = new ArrayList<>();
        // listaAux.add(5);

        // listaNumeros.removeAll(listaAux);

        System.out.println("Tamaño nuevo 22: " + listaNumeros.size());
        System.out.println(listaNumeros);

        

        //borro los 4's con Iterator
        Iterator<Integer> iteradorNumeros  = listaNumeros.iterator();

        while(iteradorNumeros.hasNext())
        {
            Integer numero = iteradorNumeros.next();

            if (numero.equals(4))
            {
                iteradorNumeros.remove();
            }
        }

        System.out.println("Tamaño nuevo: " + listaNumeros.size());
        System.out.println(listaNumeros);



        //eliminar el 3 for each --> para eliminar no utilizar
        // int index = 0;
        // for (Integer numero : listaNumeros) {

        //     if (numero == 3)
        //     {
        //         listaNumeros.remove(numero);
                
        //     }
            
        //     index++;
            
            
            
        // }

        System.out.println("Tamaño nuevo: " + listaNumeros.size());
        System.out.println(listaNumeros);

     }
    
}
