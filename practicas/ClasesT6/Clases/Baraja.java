package practicas.ClasesT6.Clases;

import practicas.ClasesT6.Clases.Carta.Palo;

public class Baraja {

    //Atributos
    Carta[] mazo;

    //Constructor
    public Baraja()
    {
        this.mazo = new Carta[0];

        for (Palo palo : Palo.values()) 
        {
            for (int i = 1; i < 13; i++) 
            {
                Carta carta = new Carta(palo, i);
                push(carta);
            }    
        }
    }
    
}
