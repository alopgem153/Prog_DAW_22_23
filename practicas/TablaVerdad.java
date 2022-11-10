import java.util.Scanner;

public class TablaVerdad {
    public static void main(String[] args) {
        
        boolean valorTrue = true;
        boolean valorFalse = false;

        boolean resultadoVandV = valorTrue && valorTrue;
        System.out.println("Verdadero AND Verdadero: " + resultadoVandV);

        System.out.println("Verdadero AND Falso: " 
                        + (valorTrue && valorFalse)); 

        System.out.println("Pon una letra");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.next();

        boolean resultadoComparacion = cadena.equals("s");
        System.out.println(resultadoComparacion);

    }
}
