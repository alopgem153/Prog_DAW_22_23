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

    static boolean esPrimo(int numero) {
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
        int resultado = numero++;

        while (!esPrimo(resultado)) {
            resultado++;
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

    public static void main(String[] args) {
        int n1 = 97389;
        System.out.println(voltea(n1));
        System.out.println(esCapicua(n1));
        System.out.println(digitoN(n1, 1));
        System.out.println("Siguiente primo de 104: " + siguientePrimo(104));
        System.out.println("Potencia de 2 exponente 4:  " + potencia(2, 4)  + " - " + Math.pow(2, 4));
    }

}
