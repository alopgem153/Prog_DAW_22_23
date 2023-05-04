package modelos;

public class Alumno implements Comparable<Alumno> {

    private String sexo;
    private int edad;
    private double altura;
    private int punt1;
    private int punt2;
    private String calificacion;

    public Alumno(String sexo, int edad, double altura, int p1, int p2, String calif)
    {
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.punt1 = p1;
        this.punt2 = p2;
        this.calificacion = calif;
    }

    @Override
    public String toString() {
        return sexo + " " + edad + "(" + altura + ") -> " + calificacion ;
    }

    @Override
    public int compareTo(Alumno o) {
        if (this.edad == o.getEdad())
        {
            Double alturaThis = Double.valueOf(this.altura);
            Double alturaO = Double.valueOf(o.getAltura());

            return alturaThis.compareTo(alturaO);
        }
        else 
        {
            return (this.edad - o.edad)  ;
        }

    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public String getCalificacion() {
        return calificacion;
    }

    
    
}


