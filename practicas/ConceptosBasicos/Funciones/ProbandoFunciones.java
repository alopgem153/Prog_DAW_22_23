package ConceptosBasicos.Funciones;

import java.util.Scanner;

public class ProbandoFunciones {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");

        int numero = sc.nextInt();

        boolean escapi = UtilesParaNumeros.esCapicua(numero);

        if (escapi)
        {
            System.out.println("SI LO ES");
        }
        else 
        {
            System.out.println("NO LO ES");
        }

    }
}
