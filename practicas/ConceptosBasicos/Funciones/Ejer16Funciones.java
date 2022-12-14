package ConceptosBasicos.Funciones;

public class Ejer16Funciones {
    public static void main(String[] args) {
        /*
         * Muestra los números capicúa que hay entre 1 y 99999.
         */

         for(int aux = 1; aux<99999; aux++)
         {
            if (UtilesParaNumeros.esCapicua(aux))
            {
                System.out.println(aux + " --- " +  UtilesParaNumeros.convierteEnPalotes(aux));
            }
         }
    }
}
