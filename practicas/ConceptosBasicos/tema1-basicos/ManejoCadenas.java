package ConceptosBasicos;

public class ManejoCadenas {

    /*
     * Ejemplos de uso de los métodos de la clase String
     */

    public static void main(String[] args) {
        
        String cadena = "En un lugar de la Mancha";


        //charAt
        int indice = 3;
        char caracter = cadena.charAt(indice);
        System.out.println(caracter);

        //Comparacion
        String cadena1 = "Hola";
        String cadena2 = "HolA";

        
        System.out.println((cadena1 == cadena2)? "IGUALES" : "DISTINTAS");
        //System.out.println((cadena1 == "Hola") ? "IGUALES" : "DISTITAS");

        //System.out.println(cadena1.compareTo(cadena2));
        System.out.println((cadena1.compareTo(cadena2) == 0) ? "IGUALES" : "DISTINTAS");

        //System.out.println(cadena1.compareToIgnoreCase(cadena2));
        System.out.println("Ignore Case: " + ((cadena1.compareToIgnoreCase(cadena2) == 0) ? "IGUALES" : "DISTINTAS"));

        String apellido1 = "alfonso";
        String apellido2 = "alonso";

        System.out.println((apellido1.compareTo(apellido2)>0) ? apellido1 + " va despues que " + apellido2 
                        : apellido1 + " va antes que " + apellido2 );
        //System.out.println(apellido2.compareTo(apellido1));

        //Longitud de una cadena
        int longitud = cadena.length();
        System.out.println("La cadena tiene longitud= " + longitud);   

        //Puedo sacar el ultimo caracter
        char primero = cadena.charAt(0);
        char ultimo = cadena.charAt(longitud-1);
        System.out.println("El primer caracter es: "+ primero);
        System.out.println("El ultimo caracter es: "+ ultimo);

        //Buscar un caracter
        char letraD = 'd';
        int posicionD = cadena.indexOf(letraD);
        System.out.println("La letra D está en la posición: " + posicionD);
    
        char letraA = 'a';
        int posicionA = cadena.indexOf(letraA);
        int posicionAA = cadena.indexOf(letraA, posicionA+1);

        System.out.println("La letra a está en:" +  posicionA + " y en: " + posicionAA);

        String lugar = "mancha";
        int posicionLugar = cadena.indexOf(lugar);
        System.out.println(((posicionLugar >= 0) ? lugar + " SI"
                    : lugar + " NO") + " esta en la cadena") ;


        //Convertir a mayusculas o minusculas
        //String cadenaMinuscula = cadena.toLowerCase();
        //String cadenaMayuscula = cadena.toUpperCase();

        String lugarMinuscula =lugar.toLowerCase();
        String cadenaMuscula = cadena.toLowerCase();
        posicionLugar = cadenaMuscula.indexOf(lugarMinuscula);
        System.out.println((posicionLugar >=0)? lugar +  "SI" : lugar + " NO");

        //Reemplazar
        String cadenaModificada = cadena.replace('a', 'X');
        System.out.println(cadenaModificada);

        cadenaModificada = cadena.replaceAll("un", "otro");
        System.out.println(cadenaModificada);

        cadenaModificada = cadena.replaceFirst("a", "X");
        cadenaModificada = cadenaModificada.replaceAll("e", "X");
        System.out.println(cadenaModificada);

        //Elimar espacios delante y detras
        String saludo = "      hola y adios    ";
        System.out.println("-"+saludo+"-");
        System.out.println("-"+saludo.trim()+"-");

        //Cortar

        String[] trozos = cadena.split(" ");
        int cantidadDeTrozos = trozos.length;
        System.out.println("Partiendo la cadena desde \"de\" me salen " + cantidadDeTrozos);
        String trozo0 =trozos[0];
        String trozo1 =trozos[1];
        System.out.println("El trozo 0 es: " + trozo0);
        System.out.println("El trozo 1 es: " + trozo1);

        //Cortar cadenas SubString
        String cadenaDesde5 = cadena.substring(5);
        System.out.println(cadenaDesde5);

        String cadenaDesde5Hasta20 =cadena.substring(5, 20);
        System.out.println(cadenaDesde5Hasta20);

        //Concatenar
        String saludo1 = "hola";
        String saludo2 = " Pepe";

        String saludoCmpleto = saludo1 + saludo2;
        System.out.println(saludoCmpleto);
        System.out.println(saludo1.concat(saludo2));

        float pi = 3.141634f;
        String PI = String.valueOf(pi);
        System.out.println(PI);

        //StringBuffer
        StringBuffer sBuffer = new StringBuffer(cadena);
        //Modificar una posicion de la cadena
        sBuffer.setCharAt(1, 'M');
        System.out.println(sBuffer);

        //Inserta en una posición
        sBuffer.insert(10, "DON QUIJOTE");
        System.out.println(sBuffer);

        //Comprobaciones sobre que tipo de caracter es
        boolean esDigito = Character.isDigit('3');
        boolean esEspacio = Character.isSpaceChar(' ');
        boolean esMayuscula = Character.isUpperCase('V');
    }
    
}
