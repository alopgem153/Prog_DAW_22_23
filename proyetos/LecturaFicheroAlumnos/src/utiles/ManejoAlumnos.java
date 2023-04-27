package utiles;

import java.util.ArrayList;
import java.util.Collections;

import modelos.Alumno;

public class ManejoAlumnos {


    public String OrdenarPorEdad(ArrayList<Alumno> listaAlumno)
    {
        String cadena = "";
        Collections.sort(listaAlumno);

        for (Alumno alu : listaAlumno) {
            cadena += alu.toString() + "\n";
        }

        return cadena;

    }

    public double MediaEdades(ArrayList<Alumno> listaAlumno)
    {
        double media = 0;
        int suma = 0;

        for (Alumno alu : listaAlumno) {
            suma += alu.getEdad();
        }

        media = suma / listaAlumno.size();

        return media;
            
        
    }


    
}
