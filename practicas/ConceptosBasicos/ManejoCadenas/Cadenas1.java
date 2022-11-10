package ConceptosBasicos.ManejoCadenas;

import java.util.Scanner;

public class Cadenas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un texto");
        String texto = sc.nextLine();
        
        int longitud = texto.length();
        System.out.println("La cadena \"" + texto + "\" tiene: "+longitud + " caracteres" );


        String cadena1 = "hola";
        String cadena2 = "Hola";

        if (cadena1==texto)
        {
            System.out.println("IGUALES ==");
        }
        
        if(cadena1.equals(texto))
        {
            System.out.println("IGUALES EQUALS");
        }


        //Tirar dado
        //(Math.random() * 6); // da valores de 0 a 5.9
        int tiradaDado =(int)((Math.random()*6) +1);

        int tiradaDado2 = (int)Math.ceil(Math.random() * 6.0);
    }

    
}
