package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class MenuFraseDaw {

    public static void main(String[] args) {
        //Declaración de Variables
        boolean salir = false;
        String frase = "";

        Scanner sc = new Scanner(System.in);

        do
        {
            //Imprimo Menu
            System.out.println("a - introducir frase");
            System.out.println("b - mostrar");
            System.out.println("c - contar palabras");
            System.out.println("d - buscar cartacter");
            System.out.println("e - limpiar frase");
            System.out.println("s - salir");

            System.out.println("Dime una opción...");
            char opcion = sc.nextLine().toLowerCase().charAt(0);

            switch (opcion)
            {
                case 'a':
                    //Añadir a la frase
                    System.out.println("Dime un trozo nuevo...");
                    String trozo = sc.nextLine();
                    frase = frase.concat(" " +trozo.trim());
                    frase = frase.trim();

                    break;
                case 'b':
                    //Mostramos la frase
                    System.out.println("La frase es \"" + frase + "\"");
                    break;
                case 'c':
                    //Contar las palabras
                    String[] palabras = frase.split(" ");
                    int cantidadPalabras = palabras.length;
                    System.out.println("La frase tiene " + cantidadPalabras + " palabras");
                    break;
                case 'd':
                    //Buscar caracter
                    System.out.println("Que caracter quieres buscar...");
                    char caracterBuscado = sc.nextLine().charAt(0);

                    //Buscar en frase el caracter
                    //Opcion 1: Recorriendo toda la frase con charAt
                    int contadorApariciones = 0;
                    String cadenaApariciones = "";

                    for(int aux = 0; aux < frase.length(); aux++)
                    {
                        if (frase.charAt(aux) == caracterBuscado)
                        {
                            //he encontrado una aparicion del caracter
                            contadorApariciones++;
                            cadenaApariciones = cadenaApariciones + " " + aux;
                        }

                    }

                    System.out.println("El caracter "+ caracterBuscado + " aparece " + contadorApariciones + " veces");
                    System.out.println("en la posiciones " + cadenaApariciones);
                    
                    //Opcion 2 Buscar el caracter con IndexOf
                    int contador = 0;
                    int posicion = frase.indexOf(caracterBuscado);
                    String cadenaapariciones2 = "";
                    while (posicion != -1)//(contador < frase.length())
                    {
                        contador++;
                        cadenaapariciones2 = cadenaapariciones2 + " " + posicion;
                        posicion = frase.indexOf(caracterBuscado,posicion+1);
                    }

                    System.out.println("El caracter "+ caracterBuscado + " aparece " + contador + " veces");
                    System.out.println("en la posiciones " + cadenaapariciones2);
                    

                    break;
                case 'e':
                    // Borrar la frase
                    frase = "";
                    System.out.println("Frase borrada");
                    break;
                case 's':
                    salir = true;
                    System.out.println("ADIOS");
                    break;
                default:
                    System.out.println("Opción NO VALIDA");
            }

            if (opcion != 's') // !salir
            {
                System.out.println("PULSA ENTER PARA SEGUIR");
                sc.nextLine();
            }

        } while (!salir);


        sc.close();

    }
    
}
