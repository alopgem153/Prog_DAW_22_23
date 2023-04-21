import clases.utiles.LecturaTeclado;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int cantidad = 6;
        int maximo = -1;

        LecturaTeclado lc = new LecturaTeclado();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce un numero");
            int numero = lc.LeerInteger();
            
            if (numero>maximo)
            {
                maximo = numero;
            }
            
        }

        System.out.println("Numero maximo introducido: " + maximo);
    }
}
