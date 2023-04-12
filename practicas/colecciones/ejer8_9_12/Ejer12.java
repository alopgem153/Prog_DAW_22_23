package practicas.colecciones.ejer8_9_12;

import java.util.ArrayList;
import java.util.HashMap;

import practicas.colecciones.ejer8_9_12.Carta.valoresCarta;

public class Ejer12 {

    public static void main(String[] args) {
        
        HashMap<valoresCarta, Integer> puntos = new HashMap<>();

        puntos.put(valoresCarta.AS, 11);
        puntos.put(valoresCarta.tres, 10);
        puntos.put(valoresCarta.Rey, 4);
        puntos.put(valoresCarta.Caballo, 3);
        puntos.put(valoresCarta.Sota, 4);


        ArrayList<Carta> mazo = new ArrayList<>();

        while(mazo.size() < 5)
        {            
            Carta newCarta = new Carta();
            
            if (!mazo.contains(newCarta))
            {
                mazo.add(newCarta);
            }
        }

        System.out.println(mazo);


        //Calculo los puntos
        int totalPuntos = 0;

        for (Carta carta : mazo) 
        {
            valoresCarta valorCarta = carta.getValor();

            if (puntos.containsKey(valorCarta))
            {
                totalPuntos += puntos.get(valorCarta);
            }
        }

        System.out.println("Total puntos: "+ totalPuntos);

    }
    
}
