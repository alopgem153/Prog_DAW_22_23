package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class Estadistica_IES {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sumaEdades = 0;
        int contadorAlumnos = 0;
        int contadorMayores18 = 0;

        System.out.println("Introduce una edad");
        int edad = sc.nextInt();

        

        while(edad != -1)
        {
            if (edad >= 11)
            {
                //Conjunto de instrucciones
                sumaEdades += edad; // sumaEdades = sumaEdades + edad;

                contadorAlumnos++;

                if (edad >= 18)
                {
                    contadorMayores18++;
                }
            }
            else
            {
                System.out.println("Edad no valida debe tener mas de 10");
            }

            //Actualizar la condición
            System.out.println("Introduce otra edad");
            edad = sc.nextInt();
        }
        
        System.out.println("GRACIAS!! estos son los resultados:");
        System.out.println("");
        System.out.println("La suma de edades: " + sumaEdades );
        System.out.println("La Media de edades: " + (sumaEdades / (double)contadorAlumnos));
        System.out.println("Total alumnos: " + contadorAlumnos);
        System.out.println("Alumnos +18: " + contadorMayores18);

        sc.close();

    }
    
}
