package ConceptosBasicos;

import java.util.Scanner;

public class EresVip {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Eres socio?");
    boolean eresSocio = sc.nextBoolean();

    System.out.println("has pagado cuotas?");
    boolean alDiaEnCuotas = sc.nextBoolean();

    System.out.println("llevas zapatizas de deportes");
    boolean conZapatillas = sc.nextBoolean();

    System.out.println("TE han recomendado?");
    boolean recomendado = sc.nextBoolean();

    System.out.println("Dentro del periodo de prueba?");
    boolean enPeriodoPrueba = sc.nextBoolean();

    boolean eresVip = (eresSocio && alDiaEnCuotas && !conZapatillas) || ( recomendado && enPeriodoPrueba);

    System.out.println((eresVip) ? "Entra pa entro" : "FUERA ALIMAÑA!");



    }
    
}
