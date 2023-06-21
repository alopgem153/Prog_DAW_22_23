package ConceptosBasicos.ManejoCadenas;

import java.util.Scanner;

public class Cadenas2 {
    /*
     * Leer de teclado un texto y un número y 
     * buscar que letra está en dicha posición. 
     * Controlar que la posición
     *  no sobrepase la longitud del texto introducido.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un texto");
        String texto = sc.nextLine();
        
        System.out.println("Dime una posicion");
        int posicion = sc.nextInt();

        sc.close();

        //Comprobamos que la posición es valida
        //boolean posicionValida = posicion <= texto.length()-1;
        boolean posicionValida = posicion < texto.length();

        char caracterBuscado = (posicionValida)? texto.charAt(posicion) 
                                    : ' ';

        //System.out.println("El caracter en "+ posicion + " es: "+ caracterBuscado);

        String mensajeError = "Posicion no válida";

        System.out.println((posicionValida)? "El caracter en "+ posicion + " es: "+ caracterBuscado 
                    : mensajeError );

    }

    
}
