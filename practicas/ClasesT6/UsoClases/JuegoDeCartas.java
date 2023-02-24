package practicas.ClasesT6.UsoClases;

import practicas.ClasesT6.Clases.Baraja;
import practicas.ClasesT6.Clases.Carta;

public class JuegoDeCartas {

    public static void main(String[] args) {
        
    
        int contador = 0;
        Baraja baraja = new Baraja();

        baraja.barajar();

        System.out.println(baraja);

        Carta carta1 = baraja.pop();
        contador++;
        System.out.println(carta1);

        Carta carta2;
        boolean fin = false;
        do 
        {
            carta2 = baraja.pop();
            contador++;
            System.out.println(carta2);
            fin = carta2.esMenor(carta1);

            if (fin)
            {
                System.out.println("Es mas pequeña la nueva carta y FIN");
                System.out.println("Cartas sacadas = "+ contador);
            }
            else
            {
                carta1 = carta2;
            }
        }while (!fin);

    }
    
}
