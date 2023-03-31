package practicas.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import practicas.colecciones.clases.Academico;

public class AcademiaLengua {

    public static void main(String[] args) {
        
        HashMap<Character, Academico> academia = new HashMap<>();

        Academico academico1 = new Academico("PEPE", 1988);
        Academico academico2 = new Academico("Reverte", 1988);
        Academico academico3 = new Academico("Mario", 1978);
        Academico academico4 = new Academico("Ibai", 2022);
        Academico academico5 = new Academico("Mario", 1999); //Mismo nombre
        Academico academico6 = new Academico("Alberto", 1999);
        Academico academico7 = new Academico("Alfonso", 2021);

        nuevoAcademico(academia, academico4, 'D');
        nuevoAcademico(academia, academico1, 'A');
        nuevoAcademico(academia, academico2, 'B');
        nuevoAcademico(academia, academico3, 'c');
        nuevoAcademico(academia, academico5, 'ñ');
        nuevoAcademico(academia, academico6, 'B'); //No debe dejar porque sillo está ocupado
        nuevoAcademico(academia, academico6, 'H');
        nuevoAcademico(academia, academico7, 'z');

        System.out.println(academia);

        //Listado 1: Nombre + año
        //ArrayList<Academico> listAcademicos =  (ArrayList<Academico>)academia.values();
        ArrayList<Academico> listAcademicos =  new ArrayList<>();
        listAcademicos.addAll(academia.values());
        //ordeno por su orden natural
        Collections.sort(listAcademicos);
        //Muestro la lista ya ordenada
        System.out.println(listAcademicos);


        //Listado 2: Letra + Nombre + Año - ordenado por letra
        TreeMap<Character, Academico> diccionarioOrdenado = new TreeMap<>();
        diccionarioOrdenado.putAll(academia);
        System.out.println(diccionarioOrdenado);
        System.out.println(diccionarioOrdenado.descendingMap());

        

    }

    public static boolean nuevoAcademico(Map<Character, Academico>  academia, 
                Academico academico, Character letra) 
    {
        boolean correcto = true;

        if (Character.isLetter(letra))
        {
            //Pregunto si el sillón está ocupado
            if (academia.containsKey(letra))
            {
                System.out.println("Sillón: " + letra + " está ocupado por " + academia.get(letra).getNombre());
                correcto = false;
            }
            else
            {
                academia.put(letra, academico);
            }

        }
        else 
        {
            System.out.println("La letra de sillón " + letra + " no es válida");
            correcto = false;
        }
        return correcto;   
    }
    
}
