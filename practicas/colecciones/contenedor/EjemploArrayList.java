package practicas.colecciones.contenedor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class EjemploArrayList {

    public static void main(String[] args) {
        
        ArrayList<String> listaNombres = new ArrayList<>();

        listaNombres.add("David");
        listaNombres.add("David");
        listaNombres.add("Jose");
        listaNombres.add("Alfonso");
        listaNombres.add("Juan");

        System.out.println(listaNombres.toString());

        boolean contiene = listaNombres.contains("JOSE");
        System.out.println(contiene);
        contiene = listaNombres.contains("Jose");
        System.out.println(contiene);

        System.out.println(listaNombres.lastIndexOf("David"));

        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println(listaNombres.get(i));
        }

        System.out.println("-------------------------");

        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }

        System.out.println("-------------------------");

        Iterator<String> iterador = listaNombres.iterator();
        //iterador.next(); //nos da el siguiente elemento
        //iterador.hasNext(); //nos dice si hay otro mas

        while(iterador.hasNext())
        {
            String nombreLeido = iterador.next();
            System.out.println("*"+ nombreLeido);
        }

        

        System.out.println("-----------LINKEDLIST -------------");

        LinkedList<String> listaLincada = new LinkedList<>(listaNombres);
        System.out.println("ListaLincada: " + listaLincada.toString());
        listaLincada.addAll(listaNombres);
        System.out.println("ListaLincada: " + listaLincada.toString());
        String primero = listaLincada.getFirst();
        String ultimo = listaLincada.getLast();
        System.out.println("Primero "+ primero + ", Ultimo: " + ultimo);


        System.out.println("-----------STACK -------------");
        Stack<String> pila = new Stack<>();
        pila.addAll(listaLincada);
        System.out.println(pila);

        String nombreSacado = pila.pop();
        System.out.println("Saco: " + nombreSacado);
        System.out.println(pila);

        // pila = (Stack)listaNombres; //NO SE PUEDE HACER


        System.out.println("-----------HASHSET -------------");
        HashSet<String> bolsa = new HashSet<>(listaNombres);
        //Me ha quitado los ducplicados
        System.out.println(bolsa);
        bolsa.add("LOLO");
        System.out.println(bolsa);

        bolsa.contains("Pepe");
        bolsa.remove("Pepe");

        Iterator<String> iteradorBolsa = bolsa.iterator();
        while(iteradorBolsa.hasNext())
        {
            String nombre = iteradorBolsa.next();
            System.out.print(nombre + " - ");
        }

        System.out.println("\n-----------ORDENAR -------------");

        //Collections.sort(bolsa);
        System.out.println(listaLincada);
        //Podemos ordenar
        Collections.sort(listaLincada);
        System.out.println(listaLincada);
        //podemos invertir orden
        Collections.reverse(listaLincada);
        System.out.println(listaLincada);
        //podemos desordenar de forma aleatoria
        Collections.shuffle(listaLincada);
        System.out.println(listaLincada);

    }
    
}
