package ConceptosBasicos.Bucles;

public class Ejer19_Piramide {
    public static void main(String[] args) {
        /*
         * Realiza un programa que pinte una pirámide por pantalla.
         */
        
        int altura = 4;

        //Pintamos cada una de las filas
        for(int alturaActual = 1; alturaActual <= altura; alturaActual++)
        {
            //Pongo los espacios en blanco de la linea
            //Cada linea tiene (altura - alturaActual) de espacios en blanco
            for(int blancos = 1; blancos <= (altura -alturaActual); blancos++)
            {
                System.out.print("_");
            }

            // //Pongo los asteriscos de cada linea
            // for(int relleno = 1; relleno <= (alturaActual *2) -1; relleno++)
            // {
            //     System.out.print("*");
            // }
            // System.out.println();

            /*
             * OTRA FORMA SIN LA FORMULA  (alturaActual * 2) -1
             */


            //Pinto la piramide de la izquierda
            // Pinto tanto relleno como altura en la que estoy
            for(int relleno = 1; relleno <= alturaActual; relleno++)
            {
                //System.out.print("*");
                System.out.print(relleno);
            }

            //Pinto la piramide de la derecha
            for(int relleno = 1; relleno <= alturaActual-1; relleno++)
            {
                System.out.print("M");
            }

            //Hago salto de línea
            System.out.println();

            


        }

    }
}
