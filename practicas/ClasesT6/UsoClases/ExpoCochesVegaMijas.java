package practicas.ClasesT6.UsoClases;

import java.util.Scanner;

import practicas.ClasesT6.Clases.Zona;

public class ExpoCochesVegaMijas {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        
       //Creo las 3 zonas
       Zona zPrincipal = new Zona(1000);
       Zona zCompraVenta = new Zona(200);
       Zona zVip = new Zona(25);
       
       boolean salir = false;
       //bucle para el menu
       do
       {
        menu();
        int opcion = sc.nextInt();
        switch (opcion)
        {
            case 1:
                imprimirLibres(zPrincipal, zCompraVenta, zVip);
                break;
            case 2:
                System.out.println("¿cuantas entradas?");
                int cantidad = sc.nextInt();
                System.out.println("¿De que zona? (1-Principal/2-Compra-venta/3-Vip)");
                int zonaVenta = sc.nextInt();
                switch(zonaVenta)
                {
                    case 1:
                        zPrincipal.vender(cantidad);
                        break;
                    case 2:
                        zCompraVenta.vender(cantidad);
                        break;
                    case 3:
                        zVip.vender(cantidad);
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;

                }
            default:
                System.out.println("No valido");
                break;
            
        }


       }while(salir == false);

    }

    public static void menu()
    {
        System.out.println("1. Mostrar entradas libres ");
        System.out.println("2. Vender Entradas ");
        System.out.println("3. Salir ");
    }

    
    public static void imprimirLibres(Zona z1, Zona z2, Zona z3)
    {
        System.out.println("Zona Principal: " + z1.getEntradasPorVender() + " entradas disponibles");
        System.out.println("Zona Compra-Venta: " + z2.getEntradasPorVender() + " entradas disponibles");
        System.out.println("Zona Vip: " + z3.getEntradasPorVender() + " entradas disponibles");
    }
}

