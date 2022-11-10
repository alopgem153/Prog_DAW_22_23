package ConceptosBasicos;

public class Practica1Eje3 {
    public static void main(String[] args) {
        
        String texto = "Muchos años después, " +
        "frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de "+        
        "recordar aquella tarde remota en que su padre lo llevó a conocer el " +
        "hielo. (Cien años de soledad. G. García Márquez).";

        /*
         *  Mostrar la información del libro sabiendo 
         * que aparece despues del simbolo '(' : 
         * "Libro: Cien años de soledad. G. García Márquez"
         */
          int indiceInicial = texto.indexOf("(");
          int indiceFinal = texto.indexOf(")");

          String infoTexto = texto.substring(indiceInicial+1, indiceFinal);
          System.out.println("Libro: " + infoTexto);

         /*
         Busca un número random entre 0 y el número total de caracters  
         y muestralo por pantalla. El caracter en la posicion X es:
         */
        int posicion = (int)(Math.random() * (texto.length()-1));
        char caracterBuscado = texto.charAt(posicion);
        System.out.println("El caracter en la posicion " + posicion + " es " + caracterBuscado);
         /*
            Trocea el texto en palabras y 
            devuelve la palabra que esté en la posición 
            que indique un número aleatorio entre 0 y el número de palabras. -> La palabra en la posición x es: XXXX
        */
        String[] palabras = texto.split(" ");
        int numeroPalabras = palabras.length;
        int palabraBuscada = (int)(Math.random() * (numeroPalabras-1));
        String palabra = palabras[palabraBuscada];
        System.out.println("La palabra en la posicion " + palabraBuscada + " es " + palabra);


            /*
            Preguntar :¿Como se llamaba el coronel? 
            y si responde su nombre o su apellido o ambos, 
            sin tener en cuenta las  mayúsculas/minúsculas) 
            indicar que se ha acertado la pregunta, 
            en caso contrario, decir que no es esa la persona
         */

         String textoMinuscula = texto.toLowerCase();

         String respuesta = "Cienn";
         respuesta = respuesta.toLowerCase();

         int posicionRespuesta = textoMinuscula.indexOf(respuesta);

         System.out.println((posicionRespuesta >= 0) ? "BIEN" : "MAL");




    }
    
}
