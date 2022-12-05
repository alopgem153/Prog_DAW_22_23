package ConceptosBasicos.Funciones;

public class EjemploBasico {
    


    public static void main(String[] args) {

        String saludo = "Que pasa!!";

        System.out.println("Ejercicio de ejemplo");

        //imprimir();
        imprimir(saludo);


        System.out.println("PARTE DEL MEDIO");

        imprimir(saludo);

        System.out.println("PARTE FINAL");

        imprimir(saludo,2);


        System.out.println("----------------------------------");

        int numero1 = 5;
        int numero2 = 8;
        int numero3 = 3;

        int resultadoSuma = suma(numero1, numero2);
        imprimir(resultadoSuma + " ",1);

        System.out.println("----------------------------------");
        resultadoSuma = suma(numero1, numero2, numero3);
        suma
        
    }

    static void imprimir()
    {
        int numero = 0;

        for(int i = 0; i<4; i++)
        {
            System.out.println("HOLA 2");
        }
    }

    static void imprimir(String texto)
    {
        texto = texto + " adios";

        for(int i = 0; i<4; i++)
        {
            System.out.println(texto);
        }
    }

    static void imprimir(String texto, int repeticiones)
    {
        for(int i = 0; i<repeticiones; i++)
        {
            System.out.println(texto);
        }
    }

    /**
     * 
     * @param a
     * @param b
     * @return
     */
    static int suma(int a, int b)
    {
        int resultado = a + b;
        System.out.println("Suma " + a + "+" + b);
        return resultado;
    }


    /**
     * Suma de 3 enteros
     * @param a primer sumando
     * @param b segundo sumando
     * @param c tercer sumando
     * @return resultado de la suma
     */
    static int suma(int a, int b, int c)
    {
        
        return suma(a, suma(b,c));
    }


}
