package practicas.interfaces;

public interface Sonido_I {

    public void voz();

    //Puede haber metodos con implementación por defecto
    default void vozDurmiendo() {

        System.out.println("Zzz  - metodo por defecto de interfaz");
        
    }

    //Metodo ESTATICO 
    static void bostezo() {//public por defecto

        System.out.println("¡Aaaauuuh!  - Metodo estatico de interfaz");
        
    }

    
}
