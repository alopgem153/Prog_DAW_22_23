import logCutre.LogDaw;
import logCutre.LogDaw.Tipo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LogDaw.NuevaEntradaALog("prueba", Tipo.INFORMACION);
    }
}
