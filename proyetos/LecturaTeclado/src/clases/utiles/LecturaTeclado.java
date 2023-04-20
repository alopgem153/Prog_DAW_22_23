package clases.utiles;

import java.util.Scanner;

public class LecturaTeclado {
    
    private Scanner sc;

    public LecturaTeclado()
    {
        sc = new Scanner(System.in);
    }

    public String LeerCadena()
    {
        String cadena = "";
        try 
        {
            cadena=  sc.nextLine();
        }
        catch(IllegalStateException illegalStatement )
        {
            System.out.println("Scanner cerrado");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return cadena;
        
    }

    public int LeerInteger() 
    {
        boolean salida = false;
        int res = 0;
        while(!salida)
        {
            try 
            {
                res = Integer.parseInt(sc.nextLine());
                salida = true;
                
            }  
            catch (NumberFormatException nfe)
            {
                System.out.println("Dato incorrecto...Introduzaca un dato del tipo pedido");
            }
            catch (IllegalStateException ise)
            {
                System.out.println("Scanner cerrado");
                salida = true;
            }
            catch(Exception ex)
            {
                System.out.println();
                salida = true;
            }
        }
        return res;
    }

    public Float LeerFloat() 
    {
        boolean salida = false;
        float res = 0;
        while(!salida)
        {
            try 
            {
                res = Float.parseFloat(sc.nextLine());
                salida = true;
                
            } catch (NumberFormatException nfe)
            {
                System.out.println("Dato incorrecto...Introduzaca un dato del tipo pedido");
            } 
            catch(Exception ex)
            {
                System.out.println("Error de lectura");
                salida = true;
            }
        }
        return res;
    }

    public Double LeerDouble () 
    {
        boolean salida = false;
        double res = 0;
        while(!salida)
        {
            try 
            {
                res = Double.parseDouble(sc.nextLine());
                salida = true;
                
            } catch (NumberFormatException nfe)
            {
                System.out.println("Dato incorrecto...Introduzaca un dato del tipo pedido");
            } 
            catch(Exception ex)
            {
                System.out.println("Error de lectura");
                salida = true;
            } 
        }
        return res;
    }

    public void finalizar() {
        sc.close();
    }
}
