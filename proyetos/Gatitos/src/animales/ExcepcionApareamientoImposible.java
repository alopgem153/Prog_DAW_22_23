package animales;

public class ExcepcionApareamientoImposible extends Exception {

    public ExcepcionApareamientoImposible(String gato1, String gato2)
    {
        super("El gato "+ gato1 + " no puede aparearse con " + gato2);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }

    
}
