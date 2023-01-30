package alf.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BibliotecaArrayTest {
    
    private int[] vector = {10, 20};
    private int[] vector1 = {10};
    private int[] vector2 = {10, 20, 30, 40, 50, 60, 70};

    @Before
    public void setUp()
    {
        //vector = {10, 20};
    }


    @Test
    public void testLimpiar()
    {
        int[] arrayEsperado =  {};
        
        //ArraysT5.UtilesArrayAlfonso.
        vector = BibliotecaArray.limpiar();
        assertArrayEquals(arrayEsperado, vector);
    }

    @Test
    public void testRellenar()
    {
        int[] arrayEsperado =  {0, 0, 0};
        vector = BibliotecaArray.rellenar(vector, 3);
        assertArrayEquals(arrayEsperado, vector);
    }

    @Test
    public void testRellenarConValor()
    {
        int[] arrayEsperado =  {10, 10, 10};
        vector = BibliotecaArray.rellenar(vector, 3, 10);
        assertArrayEquals(arrayEsperado, vector);
    }

    @Test
    public void testInsertarFinal()
    {
        int[] arrayEsperado =  {10, 20, 15};
        vector = BibliotecaArray.insertarAlFinal(vector, 15);
        assertArrayEquals(arrayEsperado, vector);
    }



    @Test
    public void testInsertarFinal_DesdeVacio()
    {
        int[] arrayEsperado =  {10};
        int[] v = BibliotecaArray.limpiar();
        vector = BibliotecaArray.insertarAlFinal(v, 10);
        assertArrayEquals(arrayEsperado, vector);
    }
    


    @Test
    public void testInsertarAlPrincipio()
    {
        int[] arrayEsperado =  {15,10, 20};
        vector = BibliotecaArray.insertarAlPrincipio(vector, 15);
        assertArrayEquals(arrayEsperado, vector);
    }



    @Test
    public void testInsertarAlPrincipio_DesdeVacio()
    {
        int[] arrayEsperado =  {10};
        int[] v = BibliotecaArray.limpiar();
        vector = BibliotecaArray.insertarAlPrincipio(v, 10);
        assertArrayEquals(arrayEsperado, vector);
    }


    @Test
    public void testInsertarEnPosicion()
    {
        int[] arrayEsperado =  {10, 20, 30, 35, 40, 50, 60, 70};
        vector2 = BibliotecaArray.insertarEnPosicion(vector2, 35, 3);
        assertArrayEquals(arrayEsperado, vector2);
    }


    @Test
    public void testInsertarEnPosicion2()
    {
        int[] arrayEsperado =  {1,10, 20, 30, 40, 50, 60, 70};
        vector2 = BibliotecaArray.insertarEnPosicion(vector2, 1, 0);
        assertArrayEquals(arrayEsperado, vector2);
    }

    @Test
    public void testInsertarEnPosicion3()
    {
        int[] arrayEsperado =  {10, 20, 30, 40, 50, 60, 70};
        vector2 = BibliotecaArray.insertarEnPosicion(vector2, 1, 15);
        assertArrayEquals(arrayEsperado, vector2);
    }

    @Test
    public void testInsertarOrdenado()
    {
        int[] arrayEsperado =  {10, 15, 20, 30, 40, 50, 60, 70};
        vector2 = BibliotecaArray.insertarOrdenado(vector2, 15);
        assertArrayEquals(arrayEsperado, vector2);
    }


    @Test
    public void testInsertarOrdenado2()
    {
        int[] arrayEsperado =  {5, 10, 20, 30, 40, 50, 60, 70};
        vector2 = BibliotecaArray.insertarOrdenado(vector2, 5);
        assertArrayEquals(arrayEsperado, vector2);
    }


    @Test
    public void testInsertarOrdenado3()
    {
        int[] arrayEsperado =  { 10, 20, 30, 40, 50, 60, 70,99};
        vector2 = BibliotecaArray.insertarOrdenado(vector2, 99);
        assertArrayEquals(arrayEsperado, vector2);
    }


    @Test
    public void testEliminaUltimo()
    {
        int[] arrayEsperado =  {10, 20, 30, 40, 50, 60};
        vector2 = BibliotecaArray.eliminarUltimo(vector2);
        assertArrayEquals(arrayEsperado, vector2);
    }


    @Test
    public void testEliminaUltimo_Vacio()
    {
        int[] arrayEsperado =  {};
        int[] v = BibliotecaArray.limpiar();
        vector2 = BibliotecaArray.eliminarUltimo(v);
        assertArrayEquals(arrayEsperado, vector2);
    }

    @Test
    public void testEliminaUltimo2()
    {
        int[] arrayEsperado =  {};
        
        vector1 = BibliotecaArray.eliminarUltimo(vector1);
        assertArrayEquals(arrayEsperado, vector1);
    }



    @Test
    public void testEliminaPrimero()
    {
        int[] arrayEsperado =  {20, 30, 40, 50, 60, 70};
        vector2 = BibliotecaArray.eliminarPrimero(vector2);
        assertArrayEquals(arrayEsperado, vector2);
    }


    @Test
    public void testEliminaPrimero_Vacio()
    {
        int[] arrayEsperado =  {};
        int[] v = BibliotecaArray.limpiar();
        vector2 = BibliotecaArray.eliminarPrimero(v);
        assertArrayEquals(arrayEsperado, vector2);
    }

    @Test
    public void testEliminaPrimero2()
    {
        int[] arrayEsperado =  {};
        
        vector1 = BibliotecaArray.eliminarPrimero(vector1);
        assertArrayEquals(arrayEsperado, vector1);
    }

    @Test
    public void testEliminaelemento_1()
    {
        int[] arrayEsperado =  {10, 20, 30, 40, 50, 70};
        vector2 = BibliotecaArray.eliminar(vector2, 60);
        assertArrayEquals(arrayEsperado, vector2);
    }


    @Test
    public void testEliminaelemento_2()
    {
        int[] arrayEsperado =  {10, 20, 30, 40, 50, 60, 70};
        vector2 = BibliotecaArray.eliminar(vector2, 99);
        assertArrayEquals(arrayEsperado, vector2);
    }

    
    @Test
    public void testEliminaPosicion_Vacio()
    {
        int[] arrayEsperado =  {};
        int[] v = BibliotecaArray.limpiar();
        vector2 = BibliotecaArray.eliminarPosicion(v, 3);
        assertArrayEquals(arrayEsperado, vector2);
    }

    @Test
    public void testEliminaPosicion()
    {
        int[] arrayEsperado =  {10, 20, 30, 40, 60, 70};
        
        vector2 = BibliotecaArray.eliminarPosicion(vector2, 4 );
        assertArrayEquals(arrayEsperado, vector2);
    }


    @Test
    public void testEliminaPosicion2()
    {
        int[] arrayEsperado =  {10, 20, 30, 40, 50, 60, 70};
        
        vector2 = BibliotecaArray.eliminarPosicion(vector2, 10 );
        assertArrayEquals(arrayEsperado, vector2);
    }

    //invertir
    @Test
    public void testInvertir()
    {
        int[] arrayEsperado =  {70, 60, 50, 40, 30, 20, 10};
        
        vector2 = BibliotecaArray.invertir(vector2);
        assertArrayEquals(arrayEsperado, vector2);
    }

    //estaOrdenado
    @Test
    public void testEstaOrdenado()
    {
        
        boolean resultaod = BibliotecaArray.estaOrdenado(vector2);
        assertTrue(resultaod);
    }

    @Test
    public void testEstaOrdenado2()
    {
        
        int[] array2 =  {70, 60, 50, 40, 30, 20, 10};
        boolean resultaod = BibliotecaArray.estaOrdenado(array2);
        assertFalse(resultaod);
    }

    //buscar
    @Test
    public void buscar1()
    {
        int posicion = BibliotecaArray.buscar(vector2,60);

        assertTrue(posicion == 5);
    }

    @Test
    public void buscar2()
    {
        int posicion = BibliotecaArray.buscar(vector2,99);
        
        assertTrue(posicion == -1);
    }
    //partirPor
    @Test
    public void testPartirPor()
    {
        //private int[] vector2 = {10, 20, 30, 40, 50, 60, 70};
        //Parto en la posicion 2 hasta la 5 (las 2 incluidas)
        int[] arrayEsperado =  {30,40, 50, 60};
        
        vector2 = BibliotecaArray.partirPor(vector2, 2,5 );
        assertArrayEquals(arrayEsperado, vector2);
    }

    @Test
    public void testPartirPor2()
    {
        //private int[] vector2 = {10, 20, 30, 40, 50, 60, 70};
        //Parto en la posicion 2 hasta la 10 (las 2 incluidas)
        //No está dentro de los limites del array por lo tanto devuelve el mismo array.
        int[] arrayEsperado =  {10,20, 30,40, 50, 60, 70};
        
        vector2 = BibliotecaArray.partirPor(vector2, 2,10 );
        assertArrayEquals(arrayEsperado, vector2);
    }

    //sonIguales


    //concatenarArrays
    @Test
    public void testConcatenarArrays()
    {
        //private int[] vector2 = {10, 20, 30, 40, 50, 60, 70};
        //private int[] vector = {10, 20};

        int[] arrayEsperado =  {10,20, 30,40, 50, 60, 70, 10, 20};
        
        vector2 = BibliotecaArray.concatenarArrays(vector2, vector );
        assertArrayEquals(arrayEsperado, vector2);
    }
}
