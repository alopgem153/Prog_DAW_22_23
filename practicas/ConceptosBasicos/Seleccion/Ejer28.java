package ConceptosBasicos.Seleccion;

import java.util.Scanner;

public class Ejer28 {
    
    public static void main(String[] args) {
        /*
         * Piedra/Papel/Tijera
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("J1: elije Piedra/Papel/Tijera");
         String j1 = sc.nextLine().toLowerCase();

        /*

         System.out.println("J2: elije Piedra/Papel/Tijera");
         String j2 = sc.nextLine().toLowerCase();
         
        */
        String j2 ="";
        int jugadaPC = (int)(Math.random() * 3);

        switch (jugadaPC)
        {
            case 0:
                j2 = "piedra";
                break;
            case 1:
                j2 = "papel";
                break;
            case 2: 
                j2 = "tijera";
                break;
        }

        String resultado = "";

        if (j1.equals(j2))
        {
            resultado = "EMPATE";
        }
  

        switch (j1)
        {
            case "papel":
                if(j2.equals("piedra"))
                {
                    resultado = "GANA J1";
                }
                else if (j2.equals("tijera"))
                {
                    resultado = "GANA J2";
                }
                break;
            case "tijera":
                if(j2 ==("piedra"))
                {
                    resultado = "GANA J2";
                }
                else if (j2.equals("papel"))
                {
                    resultado = "GANA J1";
                }
                break;
            case "piedra":
                if(j2.equals("papel"))
                {
                    resultado = "GANA J2";
                }
                else if (j2.equals("tijera"))
                {
                    resultado = "GANA J1";
                }
                break;


        }
        System.out.println("PC juega: " + j2);
        System.out.println(resultado);

    }
}
