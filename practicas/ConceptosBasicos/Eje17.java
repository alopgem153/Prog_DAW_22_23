package ConceptosBasicos;

public class Eje17 {
    public static void main(String[] args) {
        
        final float PI = 3.1416f;

        float radio = 3f;
        float altura = 9f;

        float total1 = (PI * (radio * radio)* altura)/3;

        float total2 = 1/3f * (PI * (radio * radio)* altura);

        float total3 = 0.33333333f * (PI * (radio * radio)* altura);

        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
    }
    
}
