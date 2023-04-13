package practicas.colecciones.ejer8_9_12;

public class Carta implements Comparable<Carta>{

    //private String[] valoresCarta = { "AS" , "dos", "tres", "cuatro", "cinco", "seis", "siete", "Sota", "Caballo", "Rey"};

    public enum valoresCarta { AS , dos, tres, cuatro, cinco, seis, siete, Sota, Caballo, Rey };
    public enum Palos {BASTOS, COPAS, ESPADAS, OROS}

    //Atributos de carta
    private valoresCarta valor;
    private Palos palo;
    

    public Carta()
    {
        //construye una carta al azar
        valoresCarta[] v = valoresCarta.values();
         this.valor = v[(int)(Math.random()*v.length)];

        Palos[] p = Palos.values();
        this.palo = p[(int)(Math.random()*p.length)];
    }

    @Override
    public String toString() {
        return this.valor + " " + this.palo;
    }

    @Override
    public boolean equals(Object obj) {
        Carta carta = (Carta)obj;
        return  this.palo.equals(carta.palo) && this.valor.equals(carta.valor);
    }

    @Override
    public int compareTo(Carta o) {
       
        if (this.palo.compareTo(o.palo) == 0)
        {
            //si son del mismo palo miro su valor
            return this.valor.compareTo(o.valor);
        }
        else 
        {
            //si no son del mismo palo ordena por el palo,
            //al ser un enumerado mantiene su orden
            return this.palo.compareTo(o.palo);
        }

    }

    public valoresCarta getValor() {
        return valor;
    }

    public Palos getPalo() {
        return palo;
    }

    
}
