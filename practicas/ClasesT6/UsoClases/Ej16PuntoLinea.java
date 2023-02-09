package practicas.ClasesT6.UsoClases;

import practicas.ClasesT6.Clases.Linea;
import practicas.ClasesT6.Clases.Punto;

public class Ej16PuntoLinea {
    
    public static void main(String[] args) {
        Punto p1 = new Punto(4.21, 7.3);
        Punto p2 = new Punto(-2, 1.66);
        Linea l = new Linea(p1, p2);
        System.out.println(p1);
        System.out.println(l);
    }
}
