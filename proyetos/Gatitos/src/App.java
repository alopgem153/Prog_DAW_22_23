import animales.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Gatitos!");


        Gato garfield = new Gato("Garfield", "callejero", "Macho");
        Gato lulu = new Gato("Lulu", "Persa", "Hembra");
        Gato Milu = new Gato("Milu", "Escallola", "Hembra");

        Gato hijo1 = lulu.apareaCon(garfield);
        System.out.println(hijo1);

        Gato hijo2 = lulu.apareaCon(Milu);
        System.out.println(hijo2);

        Gato hijo3 = garfield.apareaCon(lulu);
        System.out.println(hijo3);

        
    }
}
