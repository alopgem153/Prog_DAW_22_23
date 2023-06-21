package ConceptosBasicos.ManejoCadenas;

import java.util.Scanner;

public class Cadenas6 {
    /*
    Dado el texto “En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite”
    Debes de crear un programa que pregunte ¿Quién estaba en casa de Juan? y según la respuesta del usuario indique si esa persona estaba o no. 
    Cuidado: el usuario al introducir el nombre de la persona puede hacerlo con minúsculas o mayúsculas pero el resultado no debe alterarse.
 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String texto = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";
        
        
        System.out.println("Pregunta quien estaba en casa de Juan?");
        String cadenaBuscada = sc.nextLine();

        String textoEnMinusculas = texto.toLowerCase();
        String cadenaBuscadaMin = cadenaBuscada.toLowerCase();

        boolean estaba = (textoEnMinusculas.indexOf(cadenaBuscadaMin) >= 0) ;

        System.out.println((estaba)? cadenaBuscada + "Si estaba": cadenaBuscada + "No estaba");

        sc.close();

    }

    
}
