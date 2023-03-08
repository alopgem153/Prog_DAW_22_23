package practicas.ClasesT6.Clases;

import practicas.ClasesT6.Clases.Instrumento.Notas;

public class UsoInstrumentos {

    public static void main(String[] args) {
        
    
        //Instrumento i1 = new Instrumento(); //Al ser abstract no se puede instanciar
        
        Piano piano = new Piano();

        piano.add(Notas.LA);
        piano.add(Notas.LA);
        piano.add(Notas.FA);
        piano.add(Notas.SOL);
        piano.add(Notas.SOL);
        piano.add(Notas.DO);

        piano.interpretar();

        System.out.println();

        Guitarra guitarra = new Guitarra();

        guitarra.add(Notas.LA);
        guitarra.add(Notas.LA);
        guitarra.add(Notas.FA);
        guitarra.add(Notas.SOL);
        guitarra.add(Notas.SOL);
        guitarra.add(Notas.DO);

        guitarra.interpretar();

        System.out.println();



    }


}
