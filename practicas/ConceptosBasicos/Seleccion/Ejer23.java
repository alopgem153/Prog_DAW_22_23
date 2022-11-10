package ConceptosBasicos.Seleccion;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Ejer23 {
    
    public static void main(String[] args) {
        
        final int IVA_NORMAL = 21;
        final int IVA_REDUCIDO = 10;
        final int IVA_SUPER_REDUCIDO = 4;


        //Variables que voy a necesitar
        double baseImponible = 0;
        double ivaSeleccionado = 0;
        double importeIVA = 0;
        double precioConIVA = 0;
        double descuento = 0;
        double total = 0;

        String error = "";

        //Lectura de datos
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el importe de la base");
        baseImponible = sc.nextDouble();

        //Limpiamos el buffer
        sc.nextLine();
        
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
        String tipoIVA = sc.nextLine().toLowerCase();

        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
        String codigoPromocional = sc.nextLine().toLowerCase();

        //Calculo el iva seleccionado

        switch (tipoIVA)
        {
            case "general":
                ivaSeleccionado = IVA_NORMAL;
                break;
            case "reducido":
                ivaSeleccionado = IVA_REDUCIDO;
                break;
            case "superreducido":
                ivaSeleccionado = IVA_SUPER_REDUCIDO;
                break;
            default:
                error = "Tipo de IVA no válido";


        }

        //Calculo el importe de IVA
        importeIVA = baseImponible * (ivaSeleccionado/100.0);

        //Calculo del precio con IVA
        precioConIVA = baseImponible + importeIVA;

        //Calculo el descuento
        switch(codigoPromocional)
        {
            case "5porc":
                descuento = precioConIVA * 0.05;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "mitad":
                descuento = precioConIVA / 2.0;
                break;
            default:
                descuento = 0;
                break;
        }

        total = precioConIVA - descuento;


        System.out.println("Base Imponible: " + baseImponible);
        System.out.println("IVA ("+ ivaSeleccionado+"%) : " + importeIVA  );
        System.out.println("Descuento ("+ codigoPromocional + ") : "+ -descuento );
        System.out.println("TOTAL: " + total);
    }
}
