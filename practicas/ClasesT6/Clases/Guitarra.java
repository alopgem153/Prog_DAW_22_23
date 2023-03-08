package practicas.ClasesT6.Clases;

public class Guitarra extends Instrumento {

    public Guitarra()
    {
        super();
    }

    public void interpretar()
    {
        for (Notas notas : melodia) {
            
            switch (notas)
            {
                case DO:
                    System.out.print("DOOOO ");
                    break;
                case RE:
                    System.out.print("REeeeeee ");
                    break;
                case MI:
                    System.out.print("MIiiiiiii ");
                    break;
                case FA:
                    System.out.print("FAaaaaaaa ");
                    break;
                case SOL:
                    System.out.print("SOLllllll ");
                    break;
                case LA:
                    System.out.print("LAaaaaaaaa ");
                    break;
                case SI:
                    System.out.print("SIiiiiiiiiii ");
                    break;
                default:
                    break;
                
                
            }
        }
    }
    
}
