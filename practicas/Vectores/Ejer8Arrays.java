package Vectores;

import java.util.Scanner;

public class Ejer8Arrays {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        double[] temperaturas = new double[12];

        String[] meses = {"Ene", "Feb", "Maz", "Abr", "may", "Jun", "Jul", "Ago", "Sep", "oct", "Nov", "Dic"};

        //preguntar por temperatura
        rellenarTemperatura(temperaturas, meses);


        pintartemperatura(temperaturas, meses);

    }

    static void rellenarTemperatura(double[] temperaturas, String[] meses)
    {
        for (int i = 0; i < meses.length; i++) 
        {
          double temp = pedirTemperaturaMes(meses[i]);  
          temperaturas[i] = temp;
        }
        
    }

    static double pedirTemperaturaMes(String mes)
    {
        System.out.println("Dime la temperatura media de "+ mes);
        double temp = sc.nextDouble();
        return temp;
    }

    static void pintartemperatura(double[] temperaturas, String[] meses)
    {
        for (int i = 0; i < meses.length; i++) 
        {
            double temp = temperaturas[i];
            System.out.println(meses[i] + "("+ temp + "): \t" + asteriscos(temp) );
            
        }
    }

    static String asteriscos(double numero)
    {
        String resultado = "";
        for (int i = 0; i < numero; i++) {
            resultado += "*";
        }

        return resultado;
    }


}
