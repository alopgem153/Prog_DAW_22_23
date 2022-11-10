package ConceptosBasicos.Seleccion;

public class SeleccionEj6 {
    
    public static void main(String[] args) {
        /*
         * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
            una altura h. Aplica la fórmula 
            t =√2h/g
            siendo g = 9.81m/s
        
         */

        final double GRAVEDAD = 9.81;

         double altura = 1000;
         double tiempoEnSegundos = 0;
         if (altura >0)
         {
            tiempoEnSegundos = Math.sqrt((2 * altura)/GRAVEDAD);
         }
    
         System.out.println("Se tarda "+ tiempoEnSegundos + " seg.");
    }

}
