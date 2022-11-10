import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        
        final int CANTIDAD_IVA = 21;

        System.out.println("Indique la base de la factura");
        Scanner sc = new Scanner(System.in);
        float baseFactura = sc.nextFloat();

        float totalFactura = baseFactura + ((baseFactura/100)*CANTIDAD_IVA);

        System.out.println("El total de factura es " + totalFactura + " con un IVA del " + CANTIDAD_IVA);

        String cantidad = "22";

        System.out.println("DESDE MI EQUIPO");
        
        System.out.println("DESDE HITHUB");
        
        

    }
}
