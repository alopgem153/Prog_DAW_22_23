package ConceptosBasicos.Bucles;

public class Ejer37_Palotes {
    public static void main(String[] args) {
        

        int numero = 563;

        int numeroInverso = 0;
        //le doy la vuelta al numero
        while(numero>0)
        {
            int resto = numero % 10;
            numeroInverso = (numeroInverso * 10) + resto;
            numero = numero / 10; 
        }

        System.out.println("Numero al reves es: " + numeroInverso);

        String resultado = "";

        //recorro el numero inverso y pinto los palotes
        while(numeroInverso>0)
        {
            int resto = numeroInverso % 10;
            for(int i = 0; i<resto; i++)
            {
                resultado = "|" + resultado;
                //System.out.print("|");
            }
            resultado = "-" + resultado;
            //numeroInverso = (numeroInverso * 10) + resto;
            numeroInverso = numeroInverso / 10; 
        }
        System.out.println(resultado);
    }
}
