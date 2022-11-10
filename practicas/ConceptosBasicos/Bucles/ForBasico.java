package ConceptosBasicos.Bucles;

public class ForBasico {
    public static void main(String[] args) {
        //Escribe 10 veces "Hola"

        int longitud = 10;

        for(int aux = 0; aux < longitud ; aux++ )
        {
            System.out.println("HOLA ->" + aux);
        }

        for(int aux = longitud; aux>0; aux--)
        {
            System.out.println("Adios ->" + aux);
        }

        // De 2 en 2
        for(int aux = 0; aux < longitud ; aux+=2 )
        {
            System.out.println("Multiplo ->" + aux);
        }

        int limite = 50;
        //Multiplos de 7
        for(int condicion = 7; condicion <= limite; condicion+=7 )
        {

            System.out.println("Multiplos: " + condicion);
        }
    }
}
