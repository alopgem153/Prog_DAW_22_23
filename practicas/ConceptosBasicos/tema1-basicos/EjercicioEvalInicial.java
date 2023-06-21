package ConceptosBasicos;

import java.util.Scanner;

public class EjercicioEvalInicial {
    public static void main(String[] args) {
        
        //Declaracion de constantes
        final float SUELDO_BASE = 950;
        final float BONO_ANTIGUEDAD = 150;
        final float BONO_POR_HIJO = 10;
        final float HORA_EXTRA = 21.4f;
        final float DEDUCCION_FORMACION = 0.05f;

        //Leer informacion
        Scanner sc = new Scanner(System.in);

        System.out.println("Años de antiguedad?");
        int antiguedad = sc.nextInt();

        System.out.println("Numero de hijos?");
        int numHijos = sc.nextInt();

        System.out.println("horas extras?");
        int horasExtras = sc.nextInt();

        sc.close();

        //Cálculos

        //float nominaTotal = SUELDO_BASE;

        //Importe Antiguedad
        float sueldoAntiguedad = antiguedad * BONO_ANTIGUEDAD;

        //Importe Hijo
        float sueldoHijos = (numHijos * BONO_POR_HIJO);

        //Si tiene 3 hijos o mas, se le suma un bono de 100€
        sueldoHijos = (numHijos >= 3) ? 
                        sueldoHijos + 100 : sueldoHijos;

        //Importe Horas_Extras
        float sueldoHorasExtras = horasExtras * HORA_EXTRA;

        float sueldoSinFormacion = SUELDO_BASE + sueldoAntiguedad
                                + sueldoHijos + sueldoHorasExtras;

        float descuentoFormacion = sueldoSinFormacion * DEDUCCION_FORMACION;                        

        float sueldoTotal = sueldoSinFormacion - descuentoFormacion;

        //Mostrar por pantalla


    }
    
}
