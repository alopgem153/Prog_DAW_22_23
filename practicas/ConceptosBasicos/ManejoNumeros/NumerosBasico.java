package ConceptosBasicos.ManejoNumeros;

public class NumerosBasico {
    
    public static void main(String[] args) {
        
        System.out.println("PI = "+ Math.PI);

        //Absoluto - Los pone en positivo
        float decimal1= 23.346f;
        float decimal2 = 23.7543f;
        float decimal3 = -23.00023f;

        System.out.println(decimal1 + ": " + Math.abs(decimal1));
        System.out.println(decimal2 + ": " + Math.abs(decimal2));
        System.out.println(decimal3 + ": " + Math.abs(decimal3));

        //Potencia - Pow

        System.out.println(Math.pow(2, 4));
        double resultado = Math.pow(2, 4);
        System.out.println(Math.pow(156, 5000));
        double resultadoGrande = Math.pow(156, 5000); // NaN
        System.out.println(resultadoGrande);

        double raizCuadrada = Math.sqrt(resultado);
        System.out.println("Raiz de "+ resultado + "= " + raizCuadrada);

        //Random /Aleatorio

        double aleatorio = Math.random();
        System.out.println("Aleatorio: " + aleatorio);

        double aleatorio2 = Math.random();
        //Para que sea de 0 a 100
        aleatorio2 = aleatorio2 * 100;
        System.out.println("Aleatorio2: " + aleatorio2);

        //Para que sea entre 50 y 100
        double aleatorio3 = (Math.random() * 50.0) + 50;
        System.out.println("Aleatorio3 (50 a 100): " + aleatorio3);

        //Redondear
        System.out.println(Math.round(decimal1));
        System.out.println(Math.round(decimal2));
        System.out.println(Math.round(decimal3));

        System.out.println(Math.floor(decimal1));
        System.out.println(Math.floor(decimal2));
        System.out.println(Math.floor(decimal3));

        System.out.println(Math.ceil(decimal1));
        System.out.println(Math.ceil(decimal2));
        System.out.println(Math.ceil(decimal3));

        int parteEntera1 = (int)decimal1;
        System.out.println(parteEntera1);

        //Maximo y Minimo
        System.out.println("Minimo: "+Math.min(decimal1, decimal2));
        System.out.println("Maximo: "+Math.max(decimal1, decimal3));


        //Tres jugadores tiran un dado (1 al 6) 
        //Muestra la tirada de cada no de ellos
        // y muestra la tirada mayor y la menor


    }   
}
