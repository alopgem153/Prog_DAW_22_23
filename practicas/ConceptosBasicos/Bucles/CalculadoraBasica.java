package ConceptosBasicos.Bucles;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class CalculadoraBasica {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        

        do {

            //Menu
            System.out.println(" CALCULADORA SIMPLE");
            System.out.println("-----------------");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicación");
            System.out.println("4- División");
            System.out.println("0- Salir");

            //Según la opción elegida realizo una operacion u otra
            int opcion = sc.nextInt();

            int operador1 = 0;
            int operador2 = 0;
            int resultado = 0;

            if (opcion>0 && opcion<=4)
            {
                System.out.println("Dime el operador1");
                operador1 = sc.nextInt();

                System.out.println("Dime el operador2");
                operador2 = sc.nextInt();
            }

            switch (opcion)
            {
                case 1:
                    resultado = operador1 + operador2;
                    break;
                case 2:
                    resultado = operador1 - operador2;
                    break;
                case 3:
                    resultado = operador1 * operador2;
                    break;
                case 4:
                    if (operador2 != 0)
                    {
                        resultado = operador1 / operador2;
                    }
                    else {
                        System.out.println("NO SE PUEDE DIVIDIR POR 0");
                    }
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }

            if (opcion>0 && opcion<=4)
            {
                System.out.println("RESULTADO = "+ resultado);
                
            }
            sc.nextLine();
            System.out.println("Pulse una tecla para continuar");
            sc.nextLine();


        } while (continuar); //opcion != 0

        sc.close();

    }
    
}
