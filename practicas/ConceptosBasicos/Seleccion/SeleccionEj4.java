package ConceptosBasicos.Seleccion;

public class SeleccionEj4 {
    public static void main(String[] args) {
        final int PRECIO_HORAS_COMUNES = 12;
        final int PRECIO_HORAS_EXTRA = 16;

        int horas =41;

        double salario;
        int horasExtra;
        if (horas <= 40)
        {
            salario = horas * PRECIO_HORAS_COMUNES;
        }
        else
        {
            horasExtra = horas - 40;
            salario = (40 * PRECIO_HORAS_COMUNES) + 
                (horasExtra * PRECIO_HORAS_EXTRA);
        }

        System.out.println("El salario semanal es de " + salario+ "€");
        

    }
    
}
