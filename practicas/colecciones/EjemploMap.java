package practicas.colecciones;

import java.util.HashMap;
import java.util.HashSet;

import practicas.ClasesT6.clasesHerencia.Instituto.Profesor;
import practicas.ClasesT6.clasesHerencia.Instituto.ProfesorTitular;

public class EjemploMap {

    public static void main(String[] args) {
        

        HashMap<Integer, String> alumnos = new HashMap<>();

        //Insertar Alumnos
        alumnos.put(1, "PACO");
        alumnos.put(2, "ALFREDO");
        alumnos.put(3, "DAVID");

        alumnos.put(2, "JOSE"); //CUIDADO QUE MACHACA LO QUE HABIA

        System.out.println(alumnos);

        //Buscar por clave
        String alumnoBuscado = alumnos.get(2);
        System.out.println("Alumno Buscado: "+ alumnoBuscado);

        if (alumnos.containsKey(4))
        {
            System.out.println("SI ESTA LA CLAVE: 4");
        }
        else
        {
            System.out.println("NO ESTA LA CLAVE: 4");
        }

        boolean estaJose = alumnos.containsValue("JOSE");
        System.out.println("Esta JOSE: " + estaJose);

        alumnos.remove(2);
        System.out.println(alumnos);

        HashSet<Integer> conjuntoClaves = new HashSet<>(alumnos.keySet());
        System.out.println("Las claves son: " + conjuntoClaves);

        for (Integer clave : conjuntoClaves) 
        {
            System.out.println(clave + " - " + alumnos.get(clave));    
        }


        HashMap<Integer, ProfesorTitular> claustro = new HashMap<>();
        
        ProfesorTitular p1 = new ProfesorTitular("NOMBRE", "555", "p@p.com", 2000, "MATES", true, 10);

        claustro.put(1, p1);

        System.out.println(claustro);

        ProfesorTitular pt = claustro.get(1);
        System.out.println( pt.salario());


    }
    
}
