package ConceptosBasicos.Seleccion;

public class Ejer8 {
    public static void main(String[] args) {
        
        double nota1 = 5.34;
        double nota2 = 7.12;
        double nota3 = 3.8;

        double media = (nota1 + nota2 + nota3)/3;

        double[] notas = {nota1, nota2, nota3};
        media = (notas[0] + notas[1] + notas[2])/notas.length;

        System.out.println("Media:" + media);

        if (media<5)
        {
            System.out.println("INSU");
        }
        else if (media >= 5 && media <6)
        {
            System.out.println("SUFI");
        }
        else if (media >=6 && media < 8)
        {
            System.out.println("BIEN");
        }
        else if(media >=8 && media < 9)
        {
            System.out.println("NOT");
        }
        else if (media >= 9 && media <= 10)
        {
            System.out.println("SOBRESALIEnte");
        }
    }
}
