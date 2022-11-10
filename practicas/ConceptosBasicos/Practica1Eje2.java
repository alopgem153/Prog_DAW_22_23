package ConceptosBasicos;

public class Practica1Eje2 {
    
    public static void main(String[] args) {
        
        /*
         *     Nombre del jugador atacante y del jugador defensor
    El % de acierto de 2  y de 3 del jugador atacante.
    El numero de veces que el jugador defensor logra hacer que su atacante falle (número de 0 a 10)
    Y si el jugador atacante decide tirar de 2 o de 3.


Para saber si mete canasta utilizaremos esta fórmula:

(numeroAlAzarAtaque * %AciertoTipoSeleccionado) > (numeroAlAzarDefensa * EficaciaDefensa * 10)

    Debes mostrar al finalizar el siguiente mensaje según

Ejemplo de salida:

El jugador "XXXXXXX" ha encestado de 2 sobre el jugador "YYYYYY" (xxx > yyyy) 
         */

        String nombreAtacante = "PEPE";
        String nombreDefensor = "Maria";

        int porcentaje2 = 60;
        int porcentaje3 = 30;

        int defensa = 5;

        int tipoDeTiro = 3;

        //forma 1 - Bruta
        boolean meteDe2 = (Math.random() * porcentaje2) > (Math.random() * defensa * 10);
        boolean meteDe3 = (Math.random() * porcentaje3) > (Math.random() * defensa * 10);

        //System.out.println((tipoDeTiro==2)? "");

        //forma 2 - Un poco mas elegante
        int porcentajeAtaque = (tipoDeTiro == 2) ? porcentaje2 : porcentaje3;

        double fuerzaAtaque = Math.random() * porcentajeAtaque;
        double fuerzaDefensa =  Math.random() * defensa * 10;
        boolean meteTiro = (fuerzaAtaque) > (fuerzaDefensa);

        String haMetidoCanasta = ((meteTiro) ? " ha encestado" : "No ha encestado");    
        System.out.println("El jugador "+ nombreAtacante + haMetidoCanasta + " de " + tipoDeTiro + 
                    " sobre el jugador "+ nombreDefensor + " ( " +  fuerzaAtaque + " - "+ fuerzaDefensa + ")");  

    }
}
