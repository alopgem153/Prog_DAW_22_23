package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class AdivinaNumeroCompleto {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int totalPartidas = 0;
        int totalGanadas = 0;
        int intentosMenor = 0;

        boolean terminar = false;

        //JUEGO

        while (!terminar)
        {

            //PARTIDA
            int contadorIntentosPartida =0; 
            int numeroSecreto = (int)(Math.random() * 100)+1;

            System.out.println("Trata de adivinar el número");
            int numero = sc.nextInt();

            while (numero != numeroSecreto && numero != -1)
            {
                if (numero > numeroSecreto)
                {
                    System.out.println("El numero es menor");
                }
                else
                {
                    System.out.println("El numero es mayor");
                }
                contadorIntentosPartida++;
                //actualizar condicion
                System.out.println("Dime otro");
                numero = sc.nextInt();
                
            }


            totalPartidas++;
            if (numero == numeroSecreto)
            {
                System.out.println("HAS GANADO!!");
                totalGanadas++;

                if(totalGanadas == 1)
                {
                    intentosMenor = contadorIntentosPartida;    
                }
                else
                {
                    intentosMenor = Math.min(intentosMenor, contadorIntentosPartida); 
                }
            }
            else
            {
                System.out.println("HAS PERDIDO");
            }


            System.out.println("¿QUIERES JUGAR OTRA VEZ (s para si/otra cosas salir)");
            //limpiar buffer
            sc.nextLine();
            String respuesta = sc.nextLine();
            terminar = !respuesta.equals("s");

        }//end JUEGO

        System.out.println("Has jugado: "+ totalPartidas);
        System.out.println("HAs ganado: " + totalGanadas);
        System.out.println("La partida mas rapida es: " + intentosMenor);

        sc.close();
    }
}
