package practicas.ClasesT6.Clases;

public class Rectangulo {

    //Atributos
    private int base;
    private int altura;

    private static int numeroRectangulosCreados;

    //constructor
    public Rectangulo(int base, int altura)
    {
        this.altura = altura;
        this.base = base;

        numeroRectangulosCreados++;
    }

    public static int getRectangulosCreados()
    {
        return numeroRectangulosCreados;
    }

    @Override
    public String toString()
    {
        String resultado = "";
        for (int i = 0; i < this.altura; i++) 
        {
            for (int j = 0; j < this.base; j++) 
            {
                resultado += "*";    
            }    
            resultado += "\n"; //salto de linea
        }

        return resultado;
    }
    
}
