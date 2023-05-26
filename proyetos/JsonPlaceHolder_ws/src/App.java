import java.util.ArrayList;
import java.util.List;

import modelos.Usuario;
import utiles.UtilWS;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, WS!");


        List<Usuario> listaUsuarios = UtilWS.leerUsuariosFromWS();

        System.out.println(listaUsuarios);

        Usuario usuario3 = UtilWS.leerUsuarioFromWSByCodigo(5);

        System.out.println(usuario3);
    }
}
