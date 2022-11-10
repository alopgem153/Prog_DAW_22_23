package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tienes dinero ahorrado");
        boolean tienesDinero = sc.nextBoolean();

        System.out.println("Tienes reserva??");
        boolean tienesReserva = sc.nextBoolean();
        

        System.out.println("Tienes pasaporte??");
        boolean tienesPsaporte = sc.nextBoolean();

        boolean voyVacaciones = (tienesDinero) || (tienesReserva && tienesPsaporte);

        System.out.println("¿Vas de vacaciones? " + voyVacaciones);

        //Donde voy
        //playa = false;
        //montaña= true;

        System.out.println("Hijo1 ¿playa o montaña? playa-false/montaña-true");
        boolean hijo1 = sc.nextBoolean();

        System.out.println("Hijo2 ¿playa o montaña? playa-false/montaña-true");
        boolean hijo2 = sc.nextBoolean();

        System.out.println("Hijo3 ¿playa o montaña? playa-false/montaña-true");
        boolean hijo3 = sc.nextBoolean();

        boolean voyALaMontaña = (hijo1 && hijo2 && hijo3);

        System.out.println("Voy a la montaña??" +voyALaMontaña);
    }
}
