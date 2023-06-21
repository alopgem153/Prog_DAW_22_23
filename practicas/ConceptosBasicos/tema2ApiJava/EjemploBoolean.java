package practicas.ConceptosBasicos.tema2ApiJava;
public class EjemploBoolean {
    public static void main(String[] args) {
        
        boolean mayorEdad = true;

        boolean carnetConducir = false;

        //Para hacer AND en java se utiliza &&
        boolean puedeConducir = mayorEdad && carnetConducir;

        System.out.println("¿El usuario puede conducir?" + puedeConducir);

        boolean estudioMucho = false;
        boolean sacoChuleta = false;

        boolean apruebo = estudioMucho || sacoChuleta;
    
        System.out.println("¿Apruebo?" + apruebo);
    }
}
