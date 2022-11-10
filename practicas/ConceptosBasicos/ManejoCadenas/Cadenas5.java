package ConceptosBasicos.ManejoCadenas;

import java.util.Scanner;

public class Cadenas5 {
    /*
     Buscar las apariciones de un texto
      que el usuario debe introducir sobre el texto 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String texto = "En un lugar de la Mancha, " +
        "de cuyo nombre no quiero acordarme, no ha mucho " +
        "tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza que así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años. Era de complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de «Quijada», o «Quesada», que en esto hay alguna diferencia en los autores que deste caso escriben, aunque por conjeturas verisímiles se deja entender que se llamaba «Quijana». Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.";
        
        
        System.out.println("Dime que quieres buscar");
        String cadenaBuscada = sc.nextLine();

        int posicion1 = texto.indexOf(cadenaBuscada);

        int posicion2 = texto.indexOf(cadenaBuscada, posicion1+1);

        System.out.println("La cadena " + cadenaBuscada + 
                    " está en la posición " + 
                    posicion1 + " y en la "+ posicion2);

        String[] trozos = texto.split(cadenaBuscada);
        int cantidadTrozos = trozos.length;

        System.out.println("Hay " + cantidadTrozos + " de " + cadenaBuscada);

        sc.close();

    }

    
}
