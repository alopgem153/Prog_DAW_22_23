package practicas.colecciones.ejer8_9_12;

import java.util.ArrayList;
import java.util.Collections;

public class Ejer8 {
    
    public static void main(String[] args) {
        
        ArrayList<Carta> mazo = new ArrayList<>();

        while(mazo.size() < 10)
        {            
            Carta newCarta = new Carta();
            
            if (!mazo.contains(newCarta))
            {
                mazo.add(newCarta);
            }
        }

        System.out.println(mazo);

        Collections.sort(mazo);
        System.out.println("ORDENADO:");
        System.out.println(mazo);


    }
}
