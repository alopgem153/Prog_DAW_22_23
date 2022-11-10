package ConceptosBasicos.ManejoCadenas;

import java.util.Scanner;

public class Cadenas4 {
    /*
     Dado un texto, reemplazar el carácter indicado
      por el usuario por otro caracter también 
      indicado por el usuario.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un texto");
        String texto = sc.nextLine();
        
        System.out.println("Dime un caracter");
        char caracterBuscado = sc.nextLine().charAt(0);

        System.out.println("Dime el nuevo caracter");
        char caracterNuevo = sc.nextLine().charAt(0);

        String textoModificado = texto.replace(caracterBuscado, caracterNuevo);
        System.out.println(textoModificado);
        

        sc.close();

    }

    
}
