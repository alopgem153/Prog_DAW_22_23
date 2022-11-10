package ConceptosBasicos.Bucles;

public class NumeroDigitos {
    
    public static void main(String[] args) {
        /*
         * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
            por teclado. 
            Este ejercicio es equivalente a otro realizado anteriormente, con
            la salvedad de que el anterior estaba limitado a números de 5 dígitos como
            máximo. 
            En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
            esta manera, la única limitación en el número de dígitos la establece el tipo de
            dato que se utilice (int o long).
         */

         int numeroIntroducido = 100552;

         int numerodigitos = 1;

         int numeroDividido = numeroIntroducido / 10;

         while (numeroDividido > 0)
         {
            numerodigitos++;

            numeroDividido = numeroDividido / 10;
         }

         System.out.println("El numero "+ numeroIntroducido + " tiene "+ numerodigitos + " digitos") ;
    }
}
