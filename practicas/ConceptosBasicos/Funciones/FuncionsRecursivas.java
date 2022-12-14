package ConceptosBasicos.Funciones;

public class FuncionsRecursivas {
    public static void main(String[] args) {
        
        //Funcion suma recursiva
        int resultadoSuma = suma(10);
        System.out.println("Resultado: " + resultadoSuma);


        //Factorial n! = n* n-1 * n-2 * n-3 ----
        int resultadoFactorial = factorial(10);
        System.out.println("Resultado del factorial de 10!: " + resultadoFactorial);

        //Pintamos la pirámide
        int altura = 4;
        pintarPiramide(altura);

        String cadena = "La vaca lola esta loca de la cabeza";
        String[] palabras = cadena.split(" ");

        System.out.println(recorrerArray(palabras));

    }    

    static String recorrerArray(String[] lista)
    {
        String resultado = "";

        int posicion = lista.length;
        resultado = recorrerArray(lista, posicion-1 );

        return resultado;
    }

    static String recorrerArray(String[] lista, int posicion )
    {
        String resultado = "";
        if (posicion == 0) //caso base
        {
            resultado = lista[posicion];
        }
        else //llamada recursiva
        {
            //resultado = recorrerArray(lista, posicion-1) + "\n" + lista[posicion]; 
            resultado =  lista[posicion] +  "\n" + recorrerArray(lista, posicion-1); 
        }

        return resultado;
    }

    static void pintarPiramide(int altura)
    {
        if (altura > 1) //llamada recursiva
        {
            pintaFila(altura);
            System.out.println(); //hago un salto de linea
            pintarPiramide(altura-1);
        }
        else //caso base
        {
            System.out.println("*");
        }
    }

    static void pintaFila(int numero)
    {
        //caso base
        if (numero == 0)
        {
            System.out.print("");
        }
        else //llamada recursiva 
        {
            System.out.print("*");
            pintaFila(numero-1);;
        }
    }

    static int factorial(int numero)
    {
        //caso base
        if (numero == 1)
        {
            return 1;
        }
        else // llamada factorial
        {
            return numero * factorial(numero-1);
        }
    }

    static int suma(int numero)
    {
        //caso base
        if(numero == 1)
        {
            return 1;
        }
        else
        {
            //Llamada recursiva
            return numero + suma(numero-1);

        }
    }
}
