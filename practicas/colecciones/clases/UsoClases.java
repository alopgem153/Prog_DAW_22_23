package practicas.colecciones.clases;

public class UsoClases {

    public static void main(String[] args) {
        
        Profesor profe = new Profesor();
        profe.setNombre("Frasco");

        Alumno_NEAEE alumno = new Alumno_NEAEE();
        alumno.setNombre("KIKE");

        Notas<Profesor> notas = new Notas<Profesor>(profe);
        
        notas.escribirNota();

        Notas<Alumno_NEAEE> notas2 = new Notas<Alumno_NEAEE>(alumno);
        
        notas2.escribirNota();

    }
    
}
