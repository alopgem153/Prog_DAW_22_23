package utiles;

public class ExcepcionDivision extends Exception {


    public ExcepcionDivision()
    {
        super();
    }

    public ExcepcionDivision(String arg)
    {
        super(arg);
        
    }

    @Override
    public String toString() {
        return "Division por cero desde ExcepcionDivision";
    }
    
}
