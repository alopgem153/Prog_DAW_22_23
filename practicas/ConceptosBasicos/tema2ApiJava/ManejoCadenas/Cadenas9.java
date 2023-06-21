package ConceptosBasicos.ManejoCadenas;

import java.util.Scanner;

public class Cadenas9 {
    /*
    Dado el texto: “En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite”
    Realiza un programa que pregunte ¿Quién más estaba en casa de Juan? y el texto que indique el usuario, debe de irse añadiendo antes de “y Mario”, mostrando el resultado final de la frase.

    */
    public static void main(String[] args) {

        String frase = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";

        // Monica
        //En la casa de Juan estaban Pedro, Luis, Monica y Mario, todos jugando al Formite"

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime a quien añadir:");
        String nuevaPersona = sc.nextLine();;
        sc.close();

        //busco la posicion donde insertar
        int posicionInsercion = frase.indexOf("y");

        //1 forma: con StringBuffer
        StringBuffer sBuffer = new StringBuffer(frase);
        sBuffer.insert(posicionInsercion-1, ", " + nuevaPersona);

        System.out.println(sBuffer);

        //2 forma: String.SubString
        String parteIzquierda = frase.substring(0, posicionInsercion-1);
        String parteDerecha = frase.substring(posicionInsercion-1);

        String parteCentral = ", " + nuevaPersona;

        System.out.println(parteIzquierda + parteCentral + parteDerecha);
    }

    
}
