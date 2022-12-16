package Vectores;

public class EjemploArray {

    public static void main(String[] args) {
        
        //Array de 5 elementos tipo entero
        int[] edades = new int[5];

        //Array de 10 elementos tipo cadena
        String[] nombres = new String[10];

        System.out.println(edades);
        System.out.println(nombres);

        int posicion = 2;
        edades[posicion] = 18;

        nombres[posicion] = "Kiwi";
        nombres[posicion+1] = null;

        System.out.println("Edades en posicion 2 " +edades[posicion]);
        System.out.println("Edades en posicion 3 " +edades[posicion+1]);
        System.out.println("nombres den posicion 2 " + nombres[posicion]);
        System.out.println("nombres den posicion 3 " + nombres[posicion+1]);
        System.out.println("nombres den posicion 4 " + nombres[posicion+2]);


        if (nombres[8] == null)
        {
            System.out.println("NO TIENE VALOR");
        }

        int[] edades2;

        edades2 = edades;
        System.out.println("Edades2 en posicion 2 " +edades2[posicion]);

        edades2[3]= 20;

        System.out.println("edades en pos:3 = " + edades[3]);


    }
    
}
