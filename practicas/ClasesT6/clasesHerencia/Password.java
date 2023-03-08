package practicas.ClasesT6.clasesHerencia;

class Password {

    int longitud;
    String clave;
    

    //constructor
    public Password()
    {
        this.longitud = 8;
        this.clave = generarContraseña(8);
    }


    private String generarContraseña(int cantidad)
    {
        String resultado = "";

        String cadena = "ABCDEFGHI....xyz0123456789";

        for (int i = 0; i < cantidad; i++) 
        {
            int posicion  = (int)(Math.random()*cadena.length());

            char letra = cadena.charAt(posicion);
            resultado += letra;
        }

        return resultado;

    }
}
