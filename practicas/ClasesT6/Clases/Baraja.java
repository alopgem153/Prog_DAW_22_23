package practicas.ClasesT6.Clases;

import java.util.Arrays;

import practicas.ClasesT6.Clases.Carta.Palo;

public class Baraja {

    //Atributos
    private Carta[] mazo;

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

    public void barajar()
    {

        for (int i = 0; i < mazo.length; i++) 
        {
            int posicionNueva = (int)(Math.random()* this.mazo.length);
            Carta cartaAux = this.mazo[posicionNueva];
            mazo[posicionNueva] = this.mazo[i];
            mazo[i] = cartaAux;
        }

        
    }


    /**
     * Inserta una carta encima del mazo
     * @param carta
     */
    public void push(Carta carta)
    {
        Carta[] mazoNuevo = new Carta[this.mazo.length+1];

        for (int i = 0; i < this.mazo.length; i++) 
        {
            mazoNuevo[i] = this.mazo[i];
        }

        mazoNuevo[mazoNuevo.length-1] = carta;

        this.mazo = mazoNuevo;
    }

    /**
     * Saca una carta de arriba del mazo
     * @return
     */
    public Carta pop()
    {
        Carta cartaExtraida = null;

        if (this.mazo.length > 0)
        {
            Carta[] mazoNuevo = new Carta[this.mazo.length-1];

            for (int i = 0; i < mazoNuevo.length; i++) 
            {
                mazoNuevo[i] = this.mazo[i];
            }

            
            cartaExtraida = this.mazo[this.mazo.length-1];

            this.mazo = mazoNuevo;
        }
        else 
        {
            System.out.println("No hay cartas suficientes");
        }
        return cartaExtraida;
    }

    @Override
    public String toString()
    {
        return Arrays.toString(this.mazo);
    }
    
}
