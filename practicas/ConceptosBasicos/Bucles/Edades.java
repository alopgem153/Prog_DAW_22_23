package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class Edades {

    /*
     * Introduzco edades
     * Me dice al terminar la edad maxima y la minima
     * 
     * Para parar de introducir números introducir -1
     */
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una edad");
        int edad = sc.nextInt();

        int edadMaxima = edad;
        int edadMinima = edad;

        while(edad > -1)
        {
            //Conjunto de instrucciones
            if (edadMaxima < edad)
            {
                edadMaxima = edad;
            } 

            edadMinima = Math.min(edadMinima, edad);

            //Actualizar la condición
            System.out.println("Introduce otra edad");
            edad = sc.nextInt();
        }

        if (edadMaxima <= -1)
        {
            System.out.println("NO has metido ninguna edad válida");
        }
        else
        {
            System.out.println("La edad maxima es " + edadMaxima);
            System.out.println("La edad minima es: "+ edadMinima);
        }

        sc.close();

     }
}
