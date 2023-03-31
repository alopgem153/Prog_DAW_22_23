package practicas.colecciones;

import java.util.HashMap;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Ejer6 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        HashMap<String, String> claves = new HashMap<>();

        claves.put("root", "1234");
        claves.put("admin", "sklfjgh");

        boolean contraseñaCorrecta = false;
        int intentos = 0;
        do
        {
            System.out.println("Usuario...");
            String usuarioIntroducido = sc.nextLine();

            System.out.println("Contraseña...");
            String passIntroducido = sc.nextLine();


            if(claves.containsKey(usuarioIntroducido))
            {
                if (claves.get(usuarioIntroducido).equals(passIntroducido))
                {
                    contraseñaCorrecta = true;
                }
                else
                {
                    intentos++;
                    System.out.println("Incorrecto, te quedan " + (3 - intentos) + " intentos");
                }
            }
            else
            {
                intentos++;
                System.out.println("Incorrecto, te quedan " + (3 - intentos) + " intentos");
            }

        } while(!contraseñaCorrecta && intentos <3 );

        if (contraseñaCorrecta)
        {
            System.out.println("Estas dentro");
        }
        else 
        {
            System.out.println("PIRATAAAAA");
        }

    }
    
}
