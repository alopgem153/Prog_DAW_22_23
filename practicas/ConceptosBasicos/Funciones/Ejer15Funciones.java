package ConceptosBasicos.Funciones;

public class Ejer15Funciones {
    

    public static void main(String[] args) {
        
    
        /*
        * Muestra los números primos que hay entre 1 y 1000.
        */
        for(int aux =1; aux<= 1000; aux++)
        {
            if(UtilesParaNumeros.esPrimo(aux))
            {
                System.out.println(aux);
            }
        }

        int numero =1;
        System.out.println(numero);
        while(numero <= 1000)
        {
            numero = UtilesParaNumeros.siguientePrimo(numero);
            
            if (numero<=1000)
            {
                System.out.println(numero);
            }
        }


        
        
    }
}
