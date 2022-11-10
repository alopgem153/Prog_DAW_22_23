package ConceptosBasicos.Bucles;

public class Multiplos5 {

    public static void main(String[] args) {
        
    /*
     * Muestra los números múltiplos de 5 de 0 a 100 
     * utilizando un bucle do-while.
     */

        int contador = 0;

        do 
        {

            //Muesrto los multiplos de 5
            if ( (contador % 5) == 0)
            {
                System.out.println(contador);
            }

            //Actualizacion de condición
            contador++;

        } while( contador <= 100 );

    }
    
}
