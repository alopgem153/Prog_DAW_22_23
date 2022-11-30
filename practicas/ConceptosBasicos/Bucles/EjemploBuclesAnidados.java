package ConceptosBasicos.Bucles;

public class EjemploBuclesAnidados {

    public static void main(String[] args) {
        

        int altura = 4;

        for(int i = 0; i<altura; i++)
        {
            System.out.print("Altura "+ i + "-");

            for(int j= 0; j<i; j++)
            {
                System.out.print(j);
            }
            //cuando termino de pintar la linea hago un salto de linea
            System.out.println();

        }


        System.out.println();
        for(int i = altura; i>0; i--)
        {
            System.out.print("Altura "+ i + "-");

            for(int j= 0; j<i; j++)
            {
                System.out.print(j);
            }
            //cuando termino de pintar la linea hago un salto de linea
            System.out.println();
        }
        
        System.out.println("HACEMOS el 8");
        int caracteres = 12;
        
        for(int aux = 0; aux < 2; aux++)
        {
            //imprimo las 2 lineas de *
            for(int j = 0; j< 2; j++)
            {
                for(int i = 0; i< caracteres; i++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            //imprimo  ***____*** 2 veces
            for(int j = 0; j< 2; j++)
            {
                for(int i = 0; i< caracteres; i++)
                {
                    if(i>=3 && i<9)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        //imprimir la parte de abajo (2 ultimas lineas)
        for(int j = 0; j< 2; j++)
        {
            for(int i = 0; i< caracteres; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //Manejo de caracteres
        char inicio = 'A';

        int codigoInicio = (int)inicio;
        System.out.println(inicio + " - " + codigoInicio);

        for(int i = 0; i<5; i++)
        {
            char imprimir = (char)(codigoInicio+i);
            System.out.print(imprimir);
        }
        System.out.println();

        String frase = "HOLA QUE TAL ESTAS";
        String[] palabras = frase.split(" ");
        String[] partes = frase.split("A");

        for (int i = 0; i < partes.length; i++) 
        {
            System.out.println(partes[i]);    
        }

        System.out.println(frase.substring(5));


        
    }
    
}
