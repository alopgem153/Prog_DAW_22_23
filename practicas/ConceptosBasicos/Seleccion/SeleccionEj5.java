package ConceptosBasicos.Seleccion;

import java.util.Scanner;

public class SeleccionEj5 {
    public static void main(String[] args) {
        /*Resolver ecución 1º grado 
         * ax + b = 0
         * 
         * x = -b / a
        */

        Scanner sc = new Scanner(System.in);

        System.out.println(" Dime el parametro a:");
        double parametroA = sc.nextDouble();

        System.out.println(" Dime el parametro b:");
        double parametroB = sc.nextDouble();


        if (parametroA != 0)
        {
            double resultadoX = (-1 * parametroB) / parametroA;
            System.out.println("X = " + resultadoX);
        }
        else 
        {
            System.out.println("No existe solución real ");
        }
        
    }
}
