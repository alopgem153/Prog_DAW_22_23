package clases;

public class Producto implements Comparable<Producto> {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;

    private static int contadorproductos;


    public Producto(String nom, String desc, double precio, String cat)
    {
        this.nombre = nom;
        this.descripcion = desc;
        this.precio = precio;
        
        this.categoria = cat;

        contadorproductos++;
        this.id = contadorproductos;
    }


    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }


    public String getCategoria() {
        return categoria;
    }

    
    @Override
    public String toString() {
        
        String cadena = "";
        cadena = this.nombre + " " + this.precio + " " + this.categoria;
        return cadena;
    }

    

    public double getPrecio() {
        return precio;
    }


    /**
     * El orden natural de producto es por su id
     * @param o
     * @return
     */
    @Override
    public int compareTo(Producto o) {
        
        return this.getId() - o.getId();
    }

    @Override
    public boolean equals(Object obj) {
        Producto p = (Producto) obj;

        return this.getNombre().equals(p.getNombre());
    }
}
