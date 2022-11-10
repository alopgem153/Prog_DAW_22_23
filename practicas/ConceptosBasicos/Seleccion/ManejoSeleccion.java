package ConceptosBasicos.Seleccion;

public class ManejoSeleccion {

    public static void main(String[] args) {
        
        int diaSemana = 2;

        if (diaSemana == 1) 
        {
            System.out.println("Lunes");
        } 
        else if (diaSemana == 2)
        {
            System.out.println("MARTES");
        }
        else if (diaSemana == 3)
        {
            System.out.println("Miercoles");
        }
        else if (diaSemana == 4)
        {
            System.out.println("JUEVES");
        }
        else if (diaSemana == 5)
        {
            System.out.println("VIERNES");
        }
        else if (diaSemana == 6 || diaSemana == 7)
        {
            System.out.println("FIN DE SEMANA");
        }
        else 
        {
            System.out.println("VALOR NO VALIDO");
            
        }

        System.out.println("Fin de programa");

    }
    
}
