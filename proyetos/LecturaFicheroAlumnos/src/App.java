import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

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


        //Collections
        Collections.sort(listaAlumnos);

        //Collections.sort(listaAlumnos,);

        int posicionEncontrada = Collections.binarySearch(listaAlumnos, 
                    new Alumno("", 28, 1.77, 0, 0, ""));

        for (Alumno alumn : listaAlumnos) {
            System.out.println(alumn);   
        }

        Alumno alumnobuscado = listaAlumnos.get(posicionEncontrada);
        System.out.println(alumnobuscado);



        
    }
}
