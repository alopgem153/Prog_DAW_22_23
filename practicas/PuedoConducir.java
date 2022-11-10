import java.util.Scanner;

public class PuedoConducir {
    public static void main(String[] args) {
        
        final int MAYORIA_EDAD = 16;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu edad");
        int edad = sc.nextInt();

        System.out.println("¿Tienes carnet? (1 para si, otro numero para NO)");
        int tieneCarnet = sc.nextInt();

        sc.close();

        //Añadimos la parte de LÓGICA
        boolean esMayordeEdad = (edad >= MAYORIA_EDAD);
        boolean booleanTieneCarnet = (tieneCarnet == 1);

        boolean resultado2 = (edad >= MAYORIA_EDAD) && (tieneCarnet == 1);

        boolean resutadoFinal = (esMayordeEdad && booleanTieneCarnet);

        System.out.println("¿Puede conducir? " + resutadoFinal);

        System.out.println("DESDE PC INSTITUTO");
  
    }
}
