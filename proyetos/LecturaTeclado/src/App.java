import clases.utiles.LecturaTeclado;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        LecturaTeclado lc = new LecturaTeclado();

        System.out.println("introduce un numero entero");
        int numero =lc.LeerInteger();

        lc.finalizar();

        System.out.println("introduce otro numero");
        numero =lc.LeerInteger();

        System.out.println("Final del ejercicio");

    }
}
