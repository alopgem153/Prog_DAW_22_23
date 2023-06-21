package ConceptosBasicos;

import org.w3c.dom.Notation;

public class DerechoABeca {
public static void main(String[] args) {
    

    final int NOTA_RENTA_ALTA = 8;
    final int NOTA_RENTA_BAJA = 5;

    final float RENTA_ALTA = 20000f;
    final float RENTA_BAJA = 4000f;

    float nota1 = 5.6f;
    float nota2 = 6f;
    float nota3 = 10f;

    float renta = 5000;

    float notaMedia = (nota1 + nota2 + nota3)/3;

    boolean derechoABeca = false;

    derechoABeca = (notaMedia >= NOTA_RENTA_ALTA && renta < RENTA_ALTA) ||
                        (notaMedia >=NOTA_RENTA_BAJA && renta < RENTA_BAJA);
                
    System.out.println("DERECHO a Beca= " + derechoABeca);


    // 2 años antiguedad
    // 3 hijos
    // 5 horas extras
    float total = (950+ (150 * 2)+(10*3)+(5*21.4f))* 1.05

}





    
}
