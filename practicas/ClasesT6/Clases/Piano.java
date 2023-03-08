package practicas.ClasesT6.Clases;

public class Piano  extends Instrumento {
    
    public Piano()
    {
        super();
    }

    public void interpretar()
    {
        for (Notas notas : melodia) {
            
            switch (notas)
            {
                case DO:
                    System.out.print("DO ");
                    break;
                case RE:
                    System.out.print("RE ");
                    break;
                case MI:
                    System.out.print("MI ");
                    break;
                case FA:
                    System.out.print("FA ");
                    break;
                case SOL:
                    System.out.print("SOL ");
                    break;
                case LA:
                    System.out.print("LA ");
                    break;
                case SI:
                    System.out.print("SI ");
                    break;
                default:
                    break;
                
                
            }
        }
    }

}
