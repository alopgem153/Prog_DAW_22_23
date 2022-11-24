package ConceptosBasicos.Bucles;

public class CifradoFrase {
    
    public static void main(String[] args) {
        /*
         * Ciframos una frase con un factor de cifrado
         * 
         */

         String frase = "ABZ AA BBB FF";  //-> 4EFD 4EE 4FFF  
         int factorCifrado = 4;
         
        String fraseCifrada = "";

        String[] palabras = frase.split(" ");

        for(int numeroPalabra = 0; numeroPalabra< palabras.length; numeroPalabra++)
        {
            String palabraCifrada = "";

            String palabra = palabras[numeroPalabra];
            
            //para cifrar tengo que recorrer 
            //cada una de las letras del la frase
            for(int puntero = 0; puntero < palabra.length(); puntero++)
            {
                char caracterLeido = palabra.charAt(puntero);
                int caracterLeido_Entero = (int)caracterLeido;
                int caracterCifrado_Entero = caracterLeido_Entero + factorCifrado;
                
                if (caracterCifrado_Entero > 90)
                {
                    caracterCifrado_Entero -= 26;
                }
                
                char caracterCifrado = (char)caracterCifrado_Entero;

                palabraCifrada += caracterCifrado + "";
            }

            palabraCifrada = factorCifrado + palabraCifrada;

            fraseCifrada = fraseCifrada + palabraCifrada + " ";



        } //end for de cada palabra
        System.out.println("Frase Original = "+ frase);
         System.out.println("Frase cifrada = " + fraseCifrada);
    }

}
