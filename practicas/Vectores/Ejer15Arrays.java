package Vectores;

public class Ejer15Arrays {
    
    public static void main(String[] args) 
    {
        
        //rellenar el array


        //pintar las mesas

        //bucle para introducir personas -1 para salir

            //preguntar por la cantidad de personas

            //introducir personas en array

            //pintar las mesas



    }

    static void imprimir(int[] mesas)
    {

        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.println("│Mesa no  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │");
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.println("│Ocupación│" + cadenaOcupantes(mesas));
        System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    }
}
