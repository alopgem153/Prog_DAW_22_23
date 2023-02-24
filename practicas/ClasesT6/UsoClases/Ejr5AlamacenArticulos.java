package practicas.ClasesT6.UsoClases;

import practicas.ClasesT6.Clases.Articulo;

/*
* 5. Crea el programa GESTISIMAL (GESTIón SIMplifcada de Almacén) para llevar
*
el control de los artículos de un almacén. De cada artículo se debe saber
*
el código, la descripción, el precio de compra, el precio de venta y el
*
stock (número de unidades). El menú del programa debe tener, al menos, las
*
siguientes opciones:
*
<p>
*
1. Listado
*
2. Alta
*
3. Baja
*
4. Modifcación
*
5. Entrada de mercancía
*
6. Salida de mercancía
*
7. Salir
*
<p>
*
La entrada y salida de mercancía supone respectivamente el incremento y
*
decremento de stock de un determinado artículo. Hay que controlar que no
*
se pueda sacar más mercancía de la que hay en el almacén.
*
*
@author Luis José Sánchez
*/

public class Ejr5AlamacenArticulos {

    public static void main(String[] args) {
        int opcion;
        

        int i;
        int stockIntroducido;
        double precioDeCompraIntroducido;
        double precioDeVentaIntroducido;
        String codigo;
        String codigoIntroducido = "";
        String descripcionIntroducida;
        String precioDeCompraIntroducidoString;
        String precioDeVentaIntroducidoString;
        String stockIntroducidoString;
        boolean existeCodigo;
        // Crea el array de artículos
        Articulo[] almacen = new Articulo[0];
        

        // Menu
        do {
            System.out.println("\n\nG E S T I S I M A L");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                /////////////////////////////////////////////////////////////////////////////
                // LISTADO //////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////
                case 1:
                    System.out.println("\nLISTADO");
                    System.out.println("=======");
                    for (i = 0; i < almacen.length; i++) 
                    {

                        System.out.println(almacen[i]);
                        
                    }
                    break;
                /////////////////////////////////////////////////////////////////////////////
                // ALTA /////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////
                case 2:
                    System.out.println("\nNUEVO ARTÍCULO");
                    System.out.println("==============");
                    
                   
                    // Introducción de datos
                    System.out.println("Por favor, introduzca los datos del artículo.");
                    System.out.print("Código: ");
                    // Comprueba que el código introducido no se repita
                    existeCodigo = true;
                    while (existeCodigo) {
                        existeCodigo = false;
                        codigoIntroducido = System.console().readLine();
                        for (i = 0; i < almacen.length; i++) {
                            if (codigoIntroducido.equals(almacen[i].getCodigo())) {
                                existeCodigo = true;
                            }
                        }

                        if (existeCodigo) {
                            System.out.println("Ese código ya existe en la base de datos.");
                            System.out.print("Introduzca otro código: ");
                        }
                    } // while (existeCodigo)
                    Articulo articuloNuevo = new Articulo();
                    articuloNuevo.setCodigo(codigoIntroducido);
                    System.out.print("Descripcion: ");
                    descripcionIntroducida = System.console().readLine();
                    articuloNuevo.setDescripcion(descripcionIntroducida);
                    System.out.print("Precio de compra: ");
                    precioDeCompraIntroducido = Double.parseDouble(System.console().readLine());
                    articuloNuevo.setPrecioDeCompra(precioDeCompraIntroducido);
                    System.out.print("Precio de venta: ");
                    precioDeVentaIntroducido = Double.parseDouble(System.console().readLine());
                    articuloNuevo.setPrecioDeVenta(precioDeVentaIntroducido);
                    System.out.print("Stock: ");
                    stockIntroducido = Integer.parseInt(System.console().readLine());
                    articuloNuevo.setStock(stockIntroducido);
                    
                    almacen = insertarArticulo(almacen, articuloNuevo);

                break;
                /////////////////////////////////////////////////////////////////////////////
                // BAJA /////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////
                case 3:
                    System.out.println("\nBAJA");
                    System.out.println("====");
                    System.out.print("Por favor, introduzca el código del artículo que desea dar de baja : ");
                    codigoIntroducido = System.console().readLine();
                    i = buscarCodigo(almacen, codigoIntroducido);
                    
                    if (i == -1) {
                        System.out.println("Lo siento, el código introducido no existe.");
                    } else {
                        almacen = eliminarArticulo(almacen, i);
                        
                        System.out.println("articulo borrado.");
                    }
                    break;
                /////////////////////////////////////////////////////////////////////////////
                // MODIFICACIÓN /////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////
                case 4:
                    System.out.println("\nMODIFICACIÓN");
                    System.out.println("============");
                    System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
                    codigoIntroducido = System.console().readLine();
                    i = buscarCodigo(almacen, codigoIntroducido);
                    
                    if (i != -1)
                    {
                        System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");
                        System.out.println("Código: " + almacen[i].getCodigo());
                        System.out.print("Nuevo código: ");
                        codigoIntroducido = System.console().readLine();
                        if (!codigoIntroducido.equals("")) {
                            almacen[i].setCodigo(codigoIntroducido);
                        }
                        System.out.println("Descripción: " + almacen[i].getDescripcion());
                        System.out.print("Nueva descripción: ");
                        descripcionIntroducida = System.console().readLine();
                        if (!descripcionIntroducida.equals("")) {
                            almacen[i].setDescripcion(descripcionIntroducida);
                        }
                        System.out.println("Precio de compra: " + almacen[i].getPrecioDeCompra());

                        System.out.print("Nuevo precio de compra: ");
                        precioDeCompraIntroducidoString = System.console().readLine();
                        if (!precioDeCompraIntroducidoString.equals("")) {
                            almacen[i].setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
                        }
                        System.out.println("Precio de venta: " + almacen[i].getPrecioDeVenta());
                        System.out.print("Nuevo precio de venta: ");
                        precioDeVentaIntroducidoString = System.console().readLine();
                        if (!precioDeVentaIntroducidoString.equals("")) {
                            almacen[i].setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
                        }
                        System.out.println("Stock: " + almacen[i].getStock());
                        System.out.print("Nuevo stock: ");
                        stockIntroducidoString = System.console().readLine();
                        if (!stockIntroducidoString.equals("")) {
                            almacen[i].setStock(Integer.parseInt(stockIntroducidoString));
                        }
                    }
                    else 
                    {
                        System.out.println("Codigo de articulo NO encontrado");
                    }

                    break;
                /////////////////////////////////////////////////////////////////////////////
                // ENTRADA DE MERCANCÍA /////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////
                case 5:
                    System.out.println("\nENTRADA DE MERCANCÍA");
                    System.out.println("====================");
                    System.out.print("Por favor, introduzca el código del artículo: ");
                    codigoIntroducido = System.console().readLine();
                    
                    codigo = "";
                    i = buscarCodigo(almacen, codigoIntroducido);
                    
                    if (i == -1) {
                        System.out.println("Lo siento, el código introducido no existe.");
                    } else {
                        System.out.println("Entrada de mercancía del siguiente artículo: ");
                        System.out.println(almacen[i]);
                        System.out.print("Introduzca el número de unidades que entran al almacén: ");

                        stockIntroducidoString = System.console().readLine();
                        almacen[i].setStock(Integer.parseInt(stockIntroducidoString) + almacen[i].getStock());
                        System.out.println("La mercancía ha entrado en el almacén.");
                    }
                    break;
                /////////////////////////////////////////////////////////////////////////////
                // SALIDA DE MERCANCÍA //////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////
                case 6:
                    System.out.println("\nSALIDA DE MERCANCÍA");
                    System.out.println("===================");
                    System.out.print("Por favor, introduzca el código del artículo: ");
                    codigoIntroducido = System.console().readLine();
                    
                    codigo = "";
                    i = buscarCodigo(almacen, codigoIntroducido);

                    if (i == -1) {
                        System.out.println("Lo siento, el código introducido no existe.");
                    } else {
                        System.out.println("Salida de mercancía del siguiente artículo: ");
                        System.out.println(almacen[i]);
                        System.out.print("Introduzca el número de unidades que desea sacar del almacén");
                        stockIntroducido = Integer.parseInt(System.console().readLine());
                        if (almacen[i].getStock() - stockIntroducido > 0) {
                            almacen[i].setStock(almacen[i].getStock() - stockIntroducido);
                            System.out.println("La mercancía ha salido del almacén.");
                        } else {
                            System.out.println("Lo siento, no se pueden sacar tantas unidades.");
                        }
                    }
                    break;

            } // switch
        } while (opcion != 7);
    }


    public static Articulo[] insertarArticulo(Articulo[] almancen, Articulo articulo )
    {
        Articulo[] nuevoAlmacen = new Articulo[almancen.length+1];
        for (int i = 0; i < almancen.length; i++) 
        {
            nuevoAlmacen[i] = almancen[i];
            
        }

        nuevoAlmacen[nuevoAlmacen.length-1] = articulo;

        return nuevoAlmacen;
    }

    public static int buscarCodigo(Articulo[] almacen, String codigoBuscado)
    {
        int posicion = -1;
        for (int i = 0; i < almacen.length; i++) 
        {
            if (almacen[i].getCodigo().equals(codigoBuscado))
            {
                posicion = i;
            }    
        }
        return posicion;
    }

    public static Articulo[] eliminarArticulo(Articulo[] almancen, int posicionAEliminar )
    {
        Articulo[] nuevoAlmacen = new Articulo[almancen.length-1];
        for (int i = 0; i < almancen.length; i++) 
        {
            if (i<posicionAEliminar)
            {
                nuevoAlmacen[i] = almancen[i];
            }
            else if (i>posicionAEliminar)
            {
                nuevoAlmacen[i] = almancen[i+1];
            }
            
        }

        return nuevoAlmacen;
    }
    
}
