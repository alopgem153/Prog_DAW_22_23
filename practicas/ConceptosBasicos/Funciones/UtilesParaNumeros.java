package ConceptosBasicos.Funciones;

public class UtilesParaNumeros {

    /**
     * Devuelve verdadero si el número que se pasa como paráme-
     * tro es capicúa y falso en caso contrario.
     * 
     * @param numero
     * @return
     */
    static boolean esCapicua(int numero) {
        boolean resultado = false;

        long numeroAlReves = voltea((long) numero);

        if (numeroAlReves == numero) {
            resultado = true;
        }

        return resultado;
    }

    /**
     * Le da la vuelta a un número. (546 --> 645)
     * 
     * @param numero Numero al que querems darle la vuelta
     * @return numero al reves
     */
    static long voltea(long numero) {

        long nuevoNumero = numero;
        long numeroAlReves = 0;

        while (nuevoNumero > 0) {
            long resto = (long) (nuevoNumero % 10.0);
            nuevoNumero = (long) (nuevoNumero / 10.0);
            numeroAlReves = (numeroAlReves * 10) + resto;
        }

        // le damos la vuelta

        return numeroAlReves;
    }

    /**
     * Devuelve el dígito que está en la posición n de un número entero.
     * Se empieza contando por el 0 y de izquierda a derecha.
     * 
     * @param numero
     * @param posicion
     * @return
     */
    static int digitoN(long numero, int posicion) {
        int digito = 0;

        long numeroAlReves = voltea(numero);

        for (int aux = 0; aux <= posicion; aux++) {
            digito = (int) (numeroAlReves % 10);
            numeroAlReves = (numeroAlReves / 10);
        }

        return digito;
    }

    public static boolean esPrimo(int numero) {
        boolean esPrimo = true;

        // for(int aux = 2; aux < numero; aux++)
        // {
        // if(numero % aux == 0)
        // {
        // esPrimo = false;
        // }

        // }

        int aux = 2;
        while (esPrimo && aux < numero) {
            if (numero % aux == 0) {
                esPrimo = false;
            }
            aux++;
        }

        return esPrimo;
    }

    static int siguientePrimo(int numero) {
        int resultado = numero +1;

        while (!esPrimo(resultado)) {
            resultado = resultado + 1;
        }

        return resultado;
    }

    static long potencia(long base, int exponente) {
        long resultado = base;

        if (exponente == 0) {
            resultado = 1;
        } else {
            for (int aux = 1; aux < exponente; aux++) {
                resultado = resultado * base;
            }
        }

        return resultado;
    }

    /**
     * Cuenta el número de dígitos de un número entero.
     * @param numero
     * @return
     */
    static int digitos(long numero)
    {
        int resulta = 0;

        while(numero>0)
        {
            resulta++;
            numero = numero / (long)10.0;
        }

        return resulta;

    }

    /**
     * Da la posición de la primera ocurrencia de un dígito
        dentro de un número entero. Si no se encuentra, devuelve -1.
     * @param numero
     * @return
     */
    static int posicionDigito(long  numero, int digBuscado)
    {
        int resultado = -1;
        // 23456 -> busco el 3 -> esta en la posicion 1
        long numeroAlReves = voltea(numero);

        // int contador = 0;
        // while(numeroAlReves > 0)
        // {
        //     int resto = (int)(numeroAlReves % 10);
        //     if (resto == digBuscado)
        //     {
        //         resultado = contador;
        //     }
        //     numeroAlReves = numeroAlReves / 10;
        //     contador++;
        // }

        int cantidad = digitos(numeroAlReves);
        for(int aux = 0; aux< cantidad; aux++)
        {
            int resto = (int)(numeroAlReves % 10);
            if (resultado == -1 && resto == digBuscado)
            {
                resultado = aux;
            }
            numeroAlReves = numeroAlReves / 10;
        }

        return resultado;
    }

    static long quitaPorDetras(long numero, int numeroDigitos)
    {
        long nuevoNumero = numero / potencia(10, numeroDigitos);
        return nuevoNumero;
    }

    static long quitaPorDelante(long numero, int numeroDigitos)
    {
        long numeroAlReves = voltea(numero);
        long nuevoNumero = quitaPorDetras(numeroAlReves, numeroDigitos);
        nuevoNumero = voltea(nuevoNumero);
        return nuevoNumero;

    }

    static long juntaNumeros(long n1, long n2)
    {
        int digitosDeN2 = digitos(n2);
        long nuevoNumero = n1 * potencia(10, digitosDeN2);
        nuevoNumero = nuevoNumero + n2;

        return nuevoNumero;
    }

    static long pegaPorDetras(long n1, long n2)
    {
        return juntaNumeros(n1, n2);

    }

    static long pegaPorDelante(long n1, long n2)
    {
        return juntaNumeros(n2, n1);
    }

    /**
     * Toma como parámetros las posiciones inicial y final
dentro de un número y devuelve el trozo correspondiente.
     * @return
     */
    static long trozoDeNumero(long numero, int posInicio, int posFinal)
    {

        long nuevoNumero = quitaPorDetras(numero, digitos(numero)-1 - posFinal);
        nuevoNumero = quitaPorDelante(nuevoNumero, posInicio);

        return  nuevoNumero;

    }

    public static String convierteEnPalotes(int numero)
    {
        String resultado = "";


        int numeroDigitos = digitos(numero);

        for(int aux = 0; aux < numeroDigitos; aux++)
        {
            int digito = digitoN(numero, aux);
            for(int i =1; i<=digito; i++)
            {
                resultado = resultado.concat("|");
            }
            resultado = resultado.concat(" - ");

        }

        return resultado;

    }

    public static void main(String[] args) {
        int n1 = 97389;
        System.out.println(voltea(n1));
        System.out.println(esCapicua(n1));
        System.out.println(digitoN(n1, 1));
        System.out.println("Siguiente primo de 104: " + siguientePrimo(104));
        System.out.println("Potencia de 2 exponente 4:  " + potencia(2, 4)  + " - " + Math.pow(2, 4));
        System.out.println("Numero digitos de 23456: "+ digitos(23456));
        System.out.println("Busca el 3 en el numero 98376432. " + posicionDigito(98376432, 3));
        System.out.println("Quita por detras 2 digitos a 87654: " + quitaPorDetras(87654, 2));
        System.out.println("Quita por delante 2 digitos a 87654: " + quitaPorDelante(87654, 2));
        System.out.println("pegaPorDetras(54, 666 = " + pegaPorDetras(54, 666) );
        System.out.println("pegaPorDelante(54, 666 = " + pegaPorDelante(54, 666) );
        System.out.println("Quita de 568753 , Me quedo de 1 a 3= " + trozoDeNumero(568753, 1, 3));

    }

}
