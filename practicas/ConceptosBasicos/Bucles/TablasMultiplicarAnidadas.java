package ConceptosBasicos.Bucles;

public class TablasMultiplicarAnidadas {
    
    /*
     * Escribe las tablas de multiplicar del 1 al 5
     */

    public static void main(String[] args) {
        
        for(int tabla = 1; tabla <=5; tabla++)
        {
            System.out.println("TABLA del " + tabla);
            System.out.println("-----------------");


            for(int aux = 1; aux <=10; aux++)
            {
                System.out.println(aux + "x"+ tabla + "= "+ (aux*tabla));
            }
        }

    }
}
