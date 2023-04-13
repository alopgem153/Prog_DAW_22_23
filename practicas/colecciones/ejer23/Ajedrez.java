package practicas.colecciones.ejer23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ajedrez {


    public enum Piezas { DAMA, TORRE, ALFIL, CABALLO, PEON};
    public static void main(String[] args) {

        //creo el diccionario de los puntos
        Map<Piezas, Integer> dicPuntos = new HashMap<>();
        dicPuntos.put(Piezas.DAMA, 9);
        dicPuntos.put(Piezas.TORRE, 5);
        dicPuntos.put(Piezas.ALFIL, 3);
        dicPuntos.put(Piezas.CABALLO, 2);
        dicPuntos.put(Piezas.PEON, 1);

        //Creo todas las pieza posibles
        ArrayList<Piezas> cajaPiezas = new ArrayList<>();
        cajaPiezas.add(Piezas.DAMA);
        cajaPiezas.add(Piezas.TORRE);
        cajaPiezas.add(Piezas.TORRE);
        cajaPiezas.add(Piezas.ALFIL);
        cajaPiezas.add(Piezas.ALFIL);
        cajaPiezas.add(Piezas.CABALLO);
        cajaPiezas.add(Piezas.CABALLO);
        for (int i = 0; i < 8; i++) {
            cajaPiezas.add(Piezas.PEON);
        }

        //Desordeno la caja de piezas de forma aleatoria
        Collections.shuffle(cajaPiezas);

        //Calculo el numero de piezas capturadas
        int nnumeroCapturas = (int)(Math.random()*cajaPiezas.size());

        System.out.println(nnumeroCapturas + " Capturas");

        ArrayList<Piezas> piezasCapturadas = new ArrayList<>(); 
        for (int i = 1; i <= nnumeroCapturas; i++) {
            piezasCapturadas.add(cajaPiezas.get(i));
            
        }

        //calculo los puntos
        int totaPuntos=0;

        for (Piezas piezas : piezasCapturadas) 
        {
            System.out.println(piezas + " - " + dicPuntos.get(piezas) + " Puntos" );
            totaPuntos += dicPuntos.get(piezas);

        }

        System.out.println("Total de puntos: " + totaPuntos);





        
    }
    
}
