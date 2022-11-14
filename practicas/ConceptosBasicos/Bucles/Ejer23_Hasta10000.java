package ConceptosBasicos.Bucles;

public class Ejer23_Hasta10000 {
    public static void main(String[] args) {
        
        int suma = 0;
        int contadorIteraciones = 0;
        int numeroMaximo, numeroMinimo;

        int nuevoNumero = (int)(Math.random() * 1000);

        System.out.println("Dime un número");
        System.out.println(nuevoNumero);

        suma = nuevoNumero;
        contadorIteraciones++;
        numeroMinimo = nuevoNumero;
        numeroMaximo = nuevoNumero;


        // Opción 1: controlado por if dentro del bucle
        // boolean salir = false;

        // while (!salir)//(suma <= 10000)
        // {

            
        //     System.out.println("Dime otro número");
        //     nuevoNumero = (int)(Math.random() * 1000);
        //     System.out.println(nuevoNumero);

        //     if (suma + nuevoNumero <= 10000)
        //     {
        //         suma = suma + nuevoNumero;
        //         contadorIteraciones++;
        //         System.out.println("La suma vale actualmente: " + suma);

        //         //Maximo y Minimo
        //         numeroMaximo = Math.max(numeroMaximo, nuevoNumero);
        //         numeroMinimo = Math.min(numeroMinimo, nuevoNumero);
        //     }
        //     else {
        //         salir = true;
        //     }
        // }

        // Opción 2: controlado por el bucle while
        while (suma + nuevoNumero <= 10000)
        {

            suma = suma + nuevoNumero;
            contadorIteraciones++;
            System.out.println("La suma vale actualmente: " + suma);

            //Maximo y Minimo
            numeroMaximo = Math.max(numeroMaximo, nuevoNumero);
            numeroMinimo = Math.min(numeroMinimo, nuevoNumero);

            System.out.println("Dime otro número");
            nuevoNumero = (int)(Math.random() * 1000);
            System.out.println(nuevoNumero);
            
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Números pedidos: "+ nuevoNumero);
        System.out.println("Media: " + suma/contadorIteraciones);
        System.out.println("Max: " + numeroMaximo + " - Min: " + numeroMinimo);



    }
}
