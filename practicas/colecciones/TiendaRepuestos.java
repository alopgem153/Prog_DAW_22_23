package practicas.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

import javax.lang.model.util.ElementScanner6;

public class TiendaRepuestos {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Creacion y inicialización de atributos del ejercicio
        HashMap<String, Integer> existencias = new HashMap<>();

        boolean salir = false;
        //realizo bucle para mostrar el menú toda las veces necesarias
        do
        {
            //Impresión del menú y tomar la opcion del usuario
            int opcion = menu();

            //Según la opcion realizo una u otra accion
            switch(opcion)
            {
                //1 - Insertar producto
                case 1:
                    System.out.println("Dime el codigo del producto...");
                    String codigo = sc.nextLine().toUpperCase();
                    insertarNuevoProducto(codigo, existencias);
                    break;
                //2 - Borrar Producto
                case 2:
                    BorrarProducto(existencias);
                    break;
                //3 - Cambiar Stock
                case 3:
                    System.out.println("indica el codigo...");
                    codigo = sc.nextLine().toUpperCase();
                    
                    if (existencias.containsKey(codigo))
                    {
                        System.out.println("Dime la nueva cantidad...");
                        int nuevaCantidad = sc.nextInt();
                        int antigua = existencias.put(codigo, nuevaCantidad);
                        System.out.println(antigua);
                        
                    }
                    else 
                    {
                        System.out.println(" No existe el codigo " + codigo);
                    }

                    break;
                //4 - mostrar Información
                case 4:
                    System.out.println(existencias);
                    break;
                case 5:
                    ordenarPorCantidad(existencias);
                //0 - salir
                case 0:
                    salir = true;
                    break;
                default: 
                    System.out.println(" Opcion no valida.");
                    break;
            }

        } while(!salir);
    }

    public static int menu()
    {
        System.out.println("------ EXISTENCIAS -------");
        System.out.println("1 - Insertar producto");
        System.out.println("2 - Borrar producto");
        System.out.println("3 - Cambiar Stock producto");
        System.out.println("4 - Mostrar Información");
        System.out.println("5 - Mostrar Información ordenanda por cantidad");
        System.out.println("0 - Salir");
        System.out.println("Seleccione opción...");
        int opcion = sc.nextInt();
        sc.nextLine(); //Limpio buffer

        return opcion;

    }

    public static void insertarNuevoProducto(String codigo, HashMap<String, Integer> existencias)
    {
        if (!existencias.containsKey(codigo))
        {
            existencias.put(codigo, 0);
        }
        else
        {
            System.out.println("Ya existe el producto "+ codigo + " con "+ existencias.get(codigo) + " elementos");
        }
    }
    public static void BorrarProducto(HashMap<String, Integer> existencias){
        System.out.println("Introduzca el código del producto");
        String codigo=sc.nextLine().toUpperCase();
        
        if(existencias.containsKey(codigo)){
            existencias.remove(codigo);
        }else{
            System.out.println("No existe el codigo del producto buscado");
        }
    }

    public static void ordenarPorCantidad(HashMap<String, Integer> existencias)
    {
        //Ordenamos la salida de productor por la cantidad que tiene
        existencias.values();

        TreeMap<String, Integer> diccionarioExistencias = new TreeMap<>(existencias);
        
        List<Entry<String, Integer>> list = new ArrayList<>(existencias.entrySet());

        list.sort(Entry.comparingByValue());
        System.out.println(list);

    }
}
