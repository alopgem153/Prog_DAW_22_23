package animales;

public class Gato {

    private String nombre;
    private String raza;
    private String sexo;


    public Gato(String nombre, String raza, String sexo)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return this.nombre + " ( " + this.sexo + ")";
    }

    public Gato apareaCon(Gato pareja) 
    {
        Gato hijo = null;

        try
        {
            if(this.sexo.equals(pareja.sexo))
            {
                throw new ExcepcionApareamientoImposible(this.nombre, pareja.nombre);
            }
            else
            {
                String sexoHijo = "Macho";
                if (Math.random()>=0.5)
                {
                    sexoHijo = "Hembra";
                }
                hijo = new Gato(this.nombre+"Junior", this.raza, sexoHijo );
            }
        }
        catch(ExcepcionApareamientoImposible exAparea)
        {
            System.out.println(exAparea);
        }

        return hijo;


    }
    
}
