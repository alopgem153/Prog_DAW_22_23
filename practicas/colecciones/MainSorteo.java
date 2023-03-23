package practicas.colecciones;

import java.util.HashSet;

public class MainSorteo {
    
    public static void main(String[] args) {
        
        Sorteo<Integer> sorteoNumeros = new Sorteo<>();
        sorteoNumeros.add(10);
        sorteoNumeros.add(15);
        sorteoNumeros.add(3);
        sorteoNumeros.add(78);
        sorteoNumeros.add(99);
        sorteoNumeros.add(58);
        sorteoNumeros.add(74);
        sorteoNumeros.add(80);
        
        Sorteo<String> sorteoNombre = new Sorteo<>();
        sorteoNombre.add("JAVI");
        sorteoNombre.add("ROSA");
        sorteoNombre.add("BELEN");
        sorteoNombre.add("KIQUE");
        sorteoNombre.add("JOSE");
        sorteoNombre.add("TONI");
        sorteoNombre.add("JOHN");

        HashSet<String> ganadores = HashSet<String>(sorteoNombre.premiados(2));


    }
}
