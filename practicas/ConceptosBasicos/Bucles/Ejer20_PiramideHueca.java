package ConceptosBasicos.Bucles;

public class Ejer20_PiramideHueca {

    public static void main(String[] args) {
        
        int altura = 5;

        //Bucle de la piramide, menos la base
        for (int fila =0; fila < altura-1; fila++)
        {
            
            //Bucle que muestra los espacios que hay antes de la piramide y el primer asterisco
            for (int contadorEspacios = 0; contadorEspacios < altura - fila; contadorEspacios++)
            {
                if (contadorEspacios < (altura - fila)-1)
                {
                    System.out.print("_");
                }
                else
                {
                    System.out.print("*");
                }
            }
            //Bucle que muestra los espacios interiores de la piramide y el ultimo caracter
            for (int contadorEspacios = 0; contadorEspacios < (fila*2)-1; contadorEspacios++)
            {
                System.out.print("-");
            }
            
            if (fila != 0)
            {
                System.out.print("B");
            }
            
            //salto de linea
            System.out.println();
        }

        //Bucle que pinta la base de la piramide
        for (int asteriscos = 0; asteriscos < (altura * 2)-1;asteriscos++)
        {
            System.out.print("*");
        }
    }
    
}
