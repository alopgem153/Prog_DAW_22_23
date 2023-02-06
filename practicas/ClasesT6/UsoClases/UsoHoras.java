package practicas.ClasesT6.UsoClases;

import java.util.Scanner;

import practicas.ClasesT6.Clases.Hora;

public class UsoHoras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que hora vas a crear....");
        int horas = sc.nextInt();

        System.out.println("Cuantos segundos vas a mostrar....");
        int iteraciones = sc.nextInt();

        
        Hora hora = new Hora(horas);
        
        for (int i = 0; i < iteraciones; i++) 
        {
            System.out.println(hora);
            
            hora.setSegundos(hora.getSegundos()+1);
        }

    }
    
}
