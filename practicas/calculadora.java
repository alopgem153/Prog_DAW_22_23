import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        //Le pido al usuario que introduzca el num 1
        System.out.println("Introduzca el primer numero");

        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();

        System.out.println("Introduzca el segundo numero");
        float numero2 = entrada.nextFloat();

        /*
         * Ahora vamos a hacer unos calculos
         * Hcemos la suma
         * Hacemos la resta
         * Hacemos rwdfjgsdfñklg
         */

        float resultadoSuma = numero1 + numero2;
        System.out.println("La suma es: " + resultadoSuma);

        //System.out.println("La resta es: " + (numero1 - numero2) );
        float resultadoResta = numero1 - numero2;
        System.out.println("La resta es: " + resultadoResta);

        String cadenaResaultado = "El resultado es:  " + resultadoSuma + "€";
        System.out.println(cadenaResaultado);




        entrada.close();

    }

}