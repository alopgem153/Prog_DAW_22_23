import java.time.LocalDate;
import java.util.ArrayList;

import modelos.Alumno;
import utiles.LecturaAlumnos;
import utiles.ManejoAlumnos;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Alumnos");

        ArrayList<Alumno> listaAlumnos = LecturaAlumnos.leerFichero();


        ManejoAlumnos manejo = new ManejoAlumnos();

        String alumnos = manejo.OrdenarPorEdad(listaAlumnos);

        System.out.println(alumnos);
        System.out.println(manejo.MediaEdades(listaAlumnos));

        
    }
}
