package Vectores;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AlturaAlumnos {

    public static void main(String[] args) 
    {
        //declaramos los arrays
        String[] alumnos = new String[0];
        double[] alturas = new double[0];
        
        boolean salir = false;
        //bucle para el menú
        do
        {
            int opcion = menu();

            switch (opcion)
            {
                case 1: 

                    alumnos = addAlumno(alumnos);
                    alturas = addAltura(alturas, 1.5);
                    break;

                case 2:
                    alturas = modificarAltura(alumnos, alturas);
                    break;
                case 3: 
                    mostrarTodo(alumnos, alturas);
                    break;
                case 4: 
                    //alturas = incrementarAltura(alturas);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción Incorrecta");
                    break;
            }


        }while(!salir);
    }

    static Scanner sc = new Scanner(System.in);

    static int menu()
    {
        System.out.println("1 Añadir alumno");
        System.out.println("2 Modificar altura");
        System.out.println("3 Mostrar todo");
        System.out.println("4 incrementar");
        System.out.println("0 SALIR");

        System.out.println();
        System.out.println("Presione alguna opción");

        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
    
    static String[] addAlumno(String[] array)
    {
        System.out.println("Dime el nombre del nuevo alumno...");
        String nuevoAlumno = sc.nextLine();

        //creamos un nuevo array con una posicion más
        String[] nuevoArray = new String[array.length+1];

        //copio el contenido del array original al nuevo array
        for (int i = 0; i < array.length; i++) 
        {
            nuevoArray[i] = array[i];    
        }

        //añado en la ultima posicion del nuevo array el nuevo valor
        nuevoArray[nuevoArray.length-1] = nuevoAlumno;

        return nuevoArray;
    }

    static double[] addAltura(double[] array, double nuevaAltura)
    {
        //creamos un nuevo array con una posicion más
        double[] nuevoArray = new double[array.length+1];

        //copio el contenido del array original al nuevo array
        for (int i = 0; i < array.length; i++) 
        {
            nuevoArray[i] = array[i];    
        }

        //añado en la ultima posicion del nuevo array el nuevo valor
        nuevoArray[nuevoArray.length-1] = nuevaAltura;

        return nuevoArray;
    }

    static double[] modificarAltura(String[] arrayNombre, double[] arrayalturas )
    {
        System.out.println("Dime el nombre del alumno que voy a modificar");
        String nombreBuscado = sc.nextLine();

        
        
        //buscar un nombre en el arrayNombre
        int posicion = -1;
        for (int i = 0; i < arrayNombre.length; i++) 
        {
            if(arrayNombre[i].equalsIgnoreCase(nombreBuscado))
            {
                posicion = i;
            }    
        }

        if (posicion >= 0)
        {
            System.out.println("Dime la nueva altura");
            double nuevaAlturas = sc.nextDouble();
            sc.nextLine();

            arrayalturas[posicion] = nuevaAlturas;
        }
        else
        {
            System.out.println("NO EXISTE ESE ALUMNO");
        }

        return arrayalturas;
    }

    static void mostrarTodo(String[] nombres, double[] valores)
    {
        for (int i = 0; i < valores.length; i++) 
        {
             System.out.println(nombres[i] + " - " + valores[i]);   
        }
    }

}
