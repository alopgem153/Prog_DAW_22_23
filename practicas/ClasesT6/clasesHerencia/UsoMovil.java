package practicas.ClasesT6.clasesHerencia;

public class UsoMovil {

    public static void main(String[] args) {
        

        Movil m1 = new Movil("678 11 22 33", "rata");
        Movil m2 = new Movil("644 74 44 69", "mono");
        Movil m3 = new Movil("622 32 89 09", "bisonte");
        System.out.println(m1);
        System.out.println(m2);
        m1.llama(m2, 320);
        m1.llama(m3, 200);
        m2.llama(m3, 550);
        m3.llama(m1, 60);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        /*
         *
         * No 678 11 22 33 - 0s de conversación - tarificados 0,00 euros
        No 644 74 44 69 - 0s de conversación - tarificados 0,00 euros
        No 678 11 22 33 - 520s de conversación - tarificados 0,52 euros
        No 644 74 44 69 - 870s de conversación - tarificados 1,10 euros
        No 622 32 89 09 - 750s de conversación - tarificados 0,00 euros 
         * 
         */
    }
    
}
