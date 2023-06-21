package ConceptosBasicos.ManejoCadenas;

import java.util.Scanner;

public class Cadenas11 {
    public static void main(String[] args) {
        
        String cadenaEjemplo = "Hola tu!";

        //Leo el caracter
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del 0 al 9");

        char digitoLeido = sc.nextLine().charAt(0);

        sc.close();

        //Comprobaciones

        boolean esDigito = Character.isDigit(digitoLeido);

        int longitudCadenaEjemplo = cadenaEjemplo.length();

        //convierto en caracter que es un digito a su valor entero(int)
        int digitoLeido_Int = Character.getNumericValue(digitoLeido);

        boolean estaDentro = longitudCadenaEjemplo > digitoLeido_Int;

        //Leer caracter de la cadena
        char caracterLeido = (esDigito && estaDentro) ? cadenaEjemplo.charAt(digitoLeido_Int) : '0';

        //Veo si es un Espacio
        boolean esEspacio = Character.isSpaceChar(caracterLeido);

        String resultadoFinal = (!esEspacio) ? caracterLeido +"" : "-ESPACIO-";

        //Muestro el caracter de la posicion leida
        System.out.println((esDigito && estaDentro)? " El caracter es " + resultadoFinal : "--ERROR--");

    }
    
}
