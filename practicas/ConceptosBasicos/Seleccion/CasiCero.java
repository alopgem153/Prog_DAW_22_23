package ConceptosBasicos.Seleccion;

import javax.lang.model.util.ElementScanner6;

public class CasiCero {
    public static void main(String[] args) {
        
        double numero = 0;

        if ( numero != 0 && numero > -1 && numero < 1 )
        {
            System.out.println(numero + " SI es CASI 0");
        }
        else {
            System.out.println(numero + " No es CASI 0");
        }
    }
    
}
