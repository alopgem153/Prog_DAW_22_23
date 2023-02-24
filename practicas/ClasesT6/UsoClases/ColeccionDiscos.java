package practicas.ClasesT6.UsoClases;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

import practicas.ClasesT6.Clases.Disco;

/**
 * ColeccionDeDiscosPrincipal.java
 * Gestión de una colección de discos.
 * 
 * @author Luis José Sánchez
 */
public class ColeccionDiscos {
  public static void main(String[] args) {
   

    //Crea el array de discos
    Disco[] discos = new Disco[0];

    
    // Carga varios discos
    Disco d1 = new Disco(
      "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);

    discos = insertarDiscos(discos, d1);

    Disco d2 = new Disco(
      "FGHQ64", "Metallica", "Black album", "hard rock", 46);

      discos = insertarDiscos(discos, d2);
      
    Disco d3 = new Disco(
      "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
      discos = insertarDiscos(discos, d3);

    int opcion;
    Scanner s = new Scanner(System.in);
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int duracionIntroducida;

    do {
      System.out.println("\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
      case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");


        for(Disco d : discos) {
          //if (!d.getCodigo().equals("LIBRE")) {
            System.out.println(d);
          //}
        }

        break;
        
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        
        
        System.out.println("Por favor, introduzca los datos del disco.");  
        System.out.print("Código: ");
        codigoIntroducido = s.nextLine();

        if (buscarCodigo(discos, codigoIntroducido) == -1)
        {
          System.out.print("Autor: ");
          autorIntroducido = s.nextLine();
          System.out.print("Título: ");
          tituloIntroducido = s.nextLine();
          System.out.print("Género: ");
          generoIntroducido = s.nextLine();
          System.out.print("Duración: ");
          duracionIntroducida = Integer.parseInt(s.nextLine());
          Disco discoNuevo = new Disco(
            codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);
          
          discos = insertarDiscos(discos, discoNuevo);
        }
        else 
        {
          System.out.println("Ese código de disco ya existe");
        }


        break;
        
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = s.nextLine();
  

        //Buscar codigo
        int i = buscarCodigo(discos, codigoIntroducido);
        if (i != -1)
        {
          System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
    
          System.out.println("Código: " + discos[i].getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntroducido = s.nextLine();
          if (!codigoIntroducido.equals("")) {
            discos[i].setCodigo(codigoIntroducido);
          }
          
          System.out.println("Autor: " + discos[i].getAutor());
          System.out.print("Nuevo autor: ");
          autorIntroducido = s.nextLine();
          if (!autorIntroducido.equals("")) {
            discos[i].setAutor(autorIntroducido);
          }
          
          System.out.println("Título: " + discos[i].getTitulo());
          System.out.print("Nuevo título: ");
          tituloIntroducido = s.nextLine();
          if (!tituloIntroducido.equals("")) {
            discos[i].setTitulo(tituloIntroducido);
          }
          
          System.out.println("Género: " + discos[i].getGenero());
          System.out.print("Nuevo género: ");
          generoIntroducido = s.nextLine();
          if (!generoIntroducido.equals("")) {
            discos[i].setGenero(generoIntroducido);
          }
          
          System.out.println("Duración: " + discos[i].getDuracion());
          System.out.print("Duración: ");
          final String duracionIntroducidaString = s.nextLine();
          if (!duracionIntroducidaString.equals("")) {
            discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
          }
        }
        else 
        {
          System.out.println("No existe el disco con código: " + codigoIntroducido);
        }
        
        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = s.nextLine();
  
        i = buscarCodigo(discos, codigoIntroducido);
        
        if (i != -1)
        {
          discos = borrarDisco(discos, i);
          System.out.println("Album borrado.");
        }
        else 
        {
          System.out.println("No existe el disco con código "+ codigoIntroducido);
        }

        
        
        
        break;
        
      default:
      
      } // switch
    } while (opcion != 5);
  }


  public static Disco[] insertarDiscos(Disco[] discos, Disco disco)
  {
    Disco[] nuevaColeccion = new Disco[discos.length+1];

    for (int i = 0; i < discos.length; i++) 
    {
      nuevaColeccion[i] = discos[i];
    }

    nuevaColeccion[nuevaColeccion.length-1] = disco;

    return nuevaColeccion;
  }

  /**
   * Busca un disco en el array de discos y devuelve su posición 
   * en el array. Si no está devuelve -1
   * @param discos
   * @param codigoIntroducido
   * @return
   */
  public static int buscarCodigo(Disco[] discos,String codigoIntroducido)
  {
    int posicion = -1;

    for (int i = 0; i < discos.length; i++) 
    {
      Disco disco = discos[i];
      if(disco.getCodigo().equalsIgnoreCase(codigoIntroducido)) 
      {
        posicion = i;
      } 
    }

    return posicion;
  }

  public static Disco[] borrarDisco(Disco[] discos, int posicion)
  {
    Disco[] nuevaColeDiscos = new Disco[discos.length-1];

    for (int i = 0; i < nuevaColeDiscos.length; i++) 
    {
      if(i<posicion)
      {
        nuevaColeDiscos[i] = discos[i];
      }
      else if (i>posicion)
      {
        nuevaColeDiscos[i] = discos[i+1];
      }
    }

    return nuevaColeDiscos;
  }
}
