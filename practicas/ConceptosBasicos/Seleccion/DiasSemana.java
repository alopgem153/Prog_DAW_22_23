package ConceptosBasicos.Seleccion;

public class DiasSemana {
    public static void main(String[] args) {
        int diaSemana = 6;

        switch (diaSemana)
        {
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6: 
            case 7:
                System.out.println("FIN DE SEMANA");
                break;
            default:
                System.out.println("ERROR");
                break;
        }   
    }
}
