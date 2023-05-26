package utiles;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Usuario;

public class UtilWS {

    public static List<Usuario> leerUsuariosFromWS()
    {
        List<Usuario> listaUsuarios = new ArrayList<>();

        try {
            
            URL url = new URL("https://jsonplaceholder.typicode.com/users");

            URLConnection connection = url.openConnection();

            //connection.addRequestProperty(null, null);
            InputStream stream =  new BufferedInputStream(connection.getInputStream());

            ObjectMapper mapper = new ObjectMapper();

            listaUsuarios = mapper.readValue(stream, new TypeReference<List<Usuario>>() { } );


        } catch (Exception e) {
            System.out.println("Error al leer usuarios desde el WS");
        }


        return listaUsuarios;
    }


    public static Usuario leerUsuarioFromWSByCodigo(int codigo)
    {
        Usuario usuarioBuscado = null;

        try {
            
            URL url = new URL("https://jsonplaceholder.typicode.com/users/"+codigo );

            URLConnection connection = url.openConnection();

            //connection.addRequestProperty(null, null);
            InputStream stream =  new BufferedInputStream(connection.getInputStream());

            ObjectMapper mapper = new ObjectMapper();

            usuarioBuscado = mapper.readValue(stream, Usuario.class);


        } catch (Exception e) {
            System.out.println("Error al leer usuarios desde el WS");
        }


        return usuarioBuscado;
    }
    
}
