package ConceptosBasicos.Seleccion;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class SeleccionEj2 {

  public static void main(String[] args) {
        
    
  Scanner teclado = new Scanner(System.in);

  int horaIntroducida= 0;
  String saludo = " ";


  System.out.println("Inroduce la hora");

   horaIntroducida = teclado.nextInt();

    if(horaIntroducida >=6 && horaIntroducida<=12){

       saludo = "Buenos dias";


        } else if(horaIntroducida >=13 && horaIntroducida<=20){

            saludo = "Buenas tardes";

        } else if((horaIntroducida >=21 && horaIntroducida <=23) 
                    || (horaIntroducida >= 0 && horaIntroducida <= 5) ){

            saludo = "Buenas noches";
       

       
       } else{

       
            System.out.println("error");


        }

    System.out.println(saludo);

    }


    
}
