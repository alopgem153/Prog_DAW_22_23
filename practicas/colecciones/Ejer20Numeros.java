package practicas.colecciones;

import java.util.ArrayList;
import java.util.HashSet;

public class Ejer20Numeros {
    public static void main(String[] args) {
        
        //Crear la lista
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        //Le inserto 20 numeros aleatorios (del 1 al 10)
        for (int i = 0; i < 20; i++) 
        {
            int numeroNuevo = (int)(Math.random()*10)+1;
            listaNumeros.add(numeroNuevo);    
        }

        //Muestro la lista
        System.out.println(listaNumeros);

        //Mostrar los numeros que estan en la lista, en un conjunto 
        HashSet<Integer> conjuntoNumeros = new HashSet<>(listaNumeros);
        System.out.println("Cjto numeros: "+ conjuntoNumeros);

        //conjunto con los repetidos
        HashSet<Integer> conjuntoRepetidos = new HashSet<>();
        HashSet<Integer> conjunto1Aparicion = new HashSet<>();


        for (int i = 0; i < listaNumeros.size(); i++) 
        {
            int numeroLeido = listaNumeros.get(i);

            if(!conjunto1Aparicion.contains(numeroLeido) && !conjuntoRepetidos.contains(numeroLeido))
            {
                conjunto1Aparicion.add(numeroLeido);
            }
            else
            {
                conjuntoRepetidos.add(numeroLeido);
                conjunto1Aparicion.remove(numeroLeido);
            }
        }

        System.out.println("Conjto Repetidos "+ conjuntoRepetidos);
        System.out.println("Conjto 1 aparicion  "+ conjunto1Aparicion);

    }
    
}
