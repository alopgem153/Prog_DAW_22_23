package Vectores;

import java.util.Scanner;

public class BasicoArrays {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //creo el array de 10 posiciones de cadena
        String[] nombres = new String[10];

        boolean salir = false;

        do 
        {
           

            int opcion = menu();

            switch(opcion)
            {
                case 1:
                    limpiar(nombres);
                    break;
                case 2:
                    insertarEn(nombres);
                    break;
                case 3:
                    mostrarPosicion(nombres);
                    break;
                case 4:
                    llenar(nombres);
                    break;
                case 5: 
                    imprimirArray(nombres);
                    break;
                case 0:
                    sc.close();
                    System.out.println("Adios!!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;

            }

        } while(!salir);
    }

    static int menu()
    {
        System.out.println(" --- Manejo Arrays -----");
        System.out.println("1 - Limpiar Array");
        System.out.println("2 - Insertar valor en posicion ");
        System.out.println("3 - Imprimir el valor de una posicion array");
        System.out.println("4 - Llenar con valores fijos");
        System.out.println("5 - Imprimir Array completo");
        System.out.println("0 - Salir");

        System.out.println("Que quiere hacer?...");
        int opcion = sc.nextInt();

        return opcion;
    }

    static void limpiar(String[] vector)
    {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = null;
        }
    }

    static void insertarEn(String[] vector)
    {
        sc.nextLine(); //limpio buffer;
        System.out.println("Que cadena quiere insertar?...");
        String cadenaNueva = sc.nextLine();

        System.out.println("En que posicion??..");
        int posicion = sc.nextInt();

        if (posicion>=0 && posicion < vector.length)
        {
            vector[posicion] = cadenaNueva;
        }
        else
        {
           System.out.println("Posicion fuera de rango"); 
        }
    }

    /**
     * 
     * @param vector
     */
    static void mostrarPosicion(String[] vector)
    {
        System.out.println("Que posicion quieres ver?..");
        int posicion = sc.nextInt();

        if (posicion>=0 && posicion < vector.length)
        {
            System.out.println("["+ posicion + "] -> " + vector[posicion]);
        }
        else
        {
           System.out.println("Posicion fuera de rango"); 
        }
    }

    static void llenar(String[] vector)
    {
        for(int aux = 0; aux < vector.length; aux++)
        {
            vector[aux] = "Cadena " + aux;
        }
    }

    static void imprimirArray(String[] vector)
    {
        int indice = 0;
        for (String cadena : vector) {
            System.out.println("[" + indice + "] -> " + cadena);
            indice++;
        }
    }
}
