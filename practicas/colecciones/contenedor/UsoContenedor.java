package practicas.colecciones.contenedor;

import practicas.interfaces.Perro;

public class UsoContenedor {


    public static void main(String[] args) {
        
        Perro[] listaPerros = new Perro[0];
        Contenedor<Perro> perrera = new Contenedor<Perro>(listaPerros);

        Integer[] numerosArray = {};
        Contenedor<Integer> numeros = new Contenedor<Integer>(numerosArray);
        numeros.insertarAlPrincipio(1);
        numeros.insertarAlPrincipio(6);
        numeros.insertarAlPrincipio(99);


        Perro p1 = new Perro("ROKO", "Pitbul");
        Perro p2 = new Perro("SULTAN", "Pitbul");
        Perro p3 = new Perro("MILIKI", "Pitbul");

        perrera.insertarAlFinal(p2);
        perrera.insertarAlFinal(p1);

        System.out.println(perrera.toString());

        perrera.insertarAlPrincipio(p3);

        System.out.println(perrera.toString());

        perrera.ordenar();

        System.out.println(perrera.toString());

        Perro p4 = perrera.extraerDelFinal();
        System.out.println(p4.toString());
        Perro p5 = perrera.extraerDelPrincipio();
        System.out.println(p5.toString());

        System.out.println("-----------------------");

        System.out.println(numeros.toString());

    }
    
}
