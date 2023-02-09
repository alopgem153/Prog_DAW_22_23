package practicas.ClasesT6.Clases;

import java.text.DecimalFormat;

public class TarjetaRegalo {

    //Atributos
    private double saldo;
    private int codigo;

    //Constructor
    public TarjetaRegalo(double saldo)
    {
        this.saldo = saldo;
        this.codigo = (int)(Math.random()*100000);
        
    }



    //Metodos
    public double getSaldo() {
        return saldo;
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public void gasta(double cantidad)
    {
        if(this.saldo < cantidad)
        {
            System.out.println("No tienes saldo suficiente");
        }
        else if (cantidad < 0)
        {
            System.out.println("No puedes gastar una cantidad negativa");
        }
        else
        {
            //this.saldo -= cantidad;
            this.setSaldo(this.getSaldo()-cantidad); 
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t)
    {
        //sumar importes de las 2 tarjetas
        //double total = this.saldo + t.saldo;
        double total = this.getSaldo() + t.getSaldo();

        //crear la tarjeta
        TarjetaRegalo tNueva = new TarjetaRegalo(total);

        //vaciar las 2 tarjetas originales
        this.setSaldo(0);
        t.setSaldo(0);

        return tNueva;
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0.00");

        String resultado = "Tarjeta Nº " + this.codigo + 
                        " - Saldo " + df.format(getSaldo());
        
        return resultado;
    }

    
}
