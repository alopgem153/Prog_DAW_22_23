package ConceptosBasicos.ManejoNumeros;

public class Dados {
    public static void main(String[] args) {
        
        int tirada1 = (int)(Math.random() * 6 + 1);
        int tirada2 = (int)(Math.random() * 6 + 1);
        int tirada3 = (int)(Math.random() * 6 + 1);

        System.out.println(" Tirada1: " + tirada1);
        System.out.println(" Tirada2: " + tirada2);
        System.out.println(" Tirada3: " + tirada3);

        int resultadoMax = Math.max(tirada1, tirada2);
        resultadoMax = Math.max(resultadoMax, tirada3);

        int resultadoMax2 = Math.max(tirada3, Math.max(tirada1, tirada2));

        System.out.println("Maximo2 "+ resultadoMax);

        System.out.println("El maximo es: " + resultadoMax);

    }
    
}
