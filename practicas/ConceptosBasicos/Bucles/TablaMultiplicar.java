package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De que número quieres la tabla de multiplicar");
        int numero = sc.nextInt();

        for(int aux = 1; aux <=10; aux++)
        {
            System.out.println(aux + "x"+ numero + "= "+ (aux*numero));
        }

        sc.close();
    }
    
}
