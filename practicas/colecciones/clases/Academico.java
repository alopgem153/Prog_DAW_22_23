package practicas.colecciones.clases;

public class Academico implements Comparable<Academico> {

    private String nombre;
    private int yearIngreso;

    public Academico(String nombre, int year)
    {
        this.nombre = nombre;
        this.yearIngreso = year;
    }

    public String getNombre() {
        return nombre;
    }

    public int getYearIngreso() {
        return yearIngreso;
    }

    @Override
    public String toString() {
        
        return this.nombre + " - " + this.yearIngreso;
    }


    /**
     * Se compara por nombre y por año de ingreso
     * @param acad
     * @return
     */
    @Override
    public int compareTo(Academico acad) {
        
        if (this.nombre.compareTo(acad.getNombre()) == 0) 
        {
            return this.yearIngreso - acad.getYearIngreso();
        }
        else
        {
            return this.nombre.compareTo(acad.getNombre());
        }

    }
    
}
