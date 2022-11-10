//Genera un número aleatorio 
//e indica si está más cerca de 1 o de 0;

package ConceptosBasicos.ManejoNumeros;

public class Ejer3 {
    public static void main(String[] args) {
    
        double aleatorio = Math.random();

        System.out.println(aleatorio);

        boolean redondeo = (aleatorio >= 0.5);

        System.out.println(redondeo ? "Está más cerca de uno" : "Está más cerca de 0");


        System.out.println("Está mas cerca de: "+ Math.round(aleatorio));

        double casoRaro = 4.00000000001;
        System.out.println(Math.ceil(casoRaro));

        
    }
    
}
