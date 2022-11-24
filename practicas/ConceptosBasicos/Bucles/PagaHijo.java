package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class PagaHijo {

    public static void main(String[] args) {
        final float PAGA_INICIAL = 0.05f;
        final int PRECIO_BICI = 2000;

        float pagaFinal =PAGA_INICIAL;
        
        int contadorSemana =0;
        float totalAhorrado=0;
        do {
            pagaFinal=pagaFinal*2;

            totalAhorrado=totalAhorrado+pagaFinal;
            contadorSemana++;

        } while (totalAhorrado<PRECIO_BICI);

        System.out.println("Tardará " + contadorSemana + " Semanas en recibir 2000€" );
        System.out.println("Ahorrando un total de " + totalAhorrado);

    }
    
}
