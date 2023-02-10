package practicas.ClasesT6.Clases;

public class Piramide {

    //atributo
    private int altura;
    
    private static int numeroPiramidesCreadas;

    //Constructor
    public Piramide(int altura)
    {
        this.altura = altura;
        numeroPiramidesCreadas++;
    }

    public static int getPiramidesCreadas()
    {
        return numeroPiramidesCreadas;
    }

    @Override
    public String toString()
    {
        String resultado = "";

        for (int i = 0; i < altura; i++) 
        {
            //pinto los espacios
            for (int j = 0; j < altura-1-i; j++) 
            {
                resultado += "_";
            }
            
            //pinto lado izquierda de la piramide
            for(int j = 0; j<=i; j++)
            {
                resultado += "*";
            }

            //pinto lado derecho de la piramide
            for (int j = 0; j < i; j++) 
            {
                resultado += "X";
            }

            //salto de linea
            resultado += "\n";
        }

        return resultado;
    }
    
}
