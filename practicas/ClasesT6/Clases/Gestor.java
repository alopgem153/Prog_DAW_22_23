package practicas.ClasesT6.Clases;



public class Gestor {

    public enum PuestoTrabajo { BECARIO, AYUDANTE, SENIOR };

    // Atributos
    public String nombre;
    private String tlf;
    //Solo visible por clases vecinas
    double importeMaximo;

    private PuestoTrabajo puesto;
    


    // Constructores
    public Gestor(String nombre, String tlf) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMaximo = 10000;

        this.puesto = PuestoTrabajo.BECARIO;
    }

    public Gestor(String nombre, String tlf, double importe) {
        this(nombre, tlf);
        setImporteMaximo(importe);
        //this.importeMaximo = importe;
    }

    /**
     * Creamos el gestor
     * El importe maximo se lo damos según el puesto, le damos el maximo posible
     * @param nombre
     * @param tlf
     * @param puesto
     */
    public Gestor(String nombre, String tlf, PuestoTrabajo puesto)
    {
        this(nombre, tlf);
        
        this.puesto = puesto;

        //Actualizo el importe maximo según el puesto
        switch(puesto)
        {
            case BECARIO:
                setImporteMaximo(10000);
                break;
            case AYUDANTE:
                setImporteMaximo(50000);
                break;
            case SENIOR:
                setImporteMaximo(200000);
                break;
            default:
                setImporteMaximo(10000);
                break;
        }
    }


    // Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImporteMaximo() {
        return importeMaximo;
    }

    public void setImporteMaximo(double importeMaximo) {
        
        if (this.puesto == PuestoTrabajo.BECARIO && importeMaximo > 10000)
        {
            this.importeMaximo = 10000;
            System.out.println("El importe maximo para este gestor es 10000");    
        }
        else if(this.puesto == PuestoTrabajo.AYUDANTE && importeMaximo >50000)
        {
            this.importeMaximo = 50000;
            System.out.println("El importe maximo para este gestor es 50000");    
        }
        else if (this.puesto == PuestoTrabajo.SENIOR && importeMaximo > 200000)
        {
            this.importeMaximo = 200000;
            System.out.println("El importe maximo para este gestor es 200000");    
        }
        else 
        {
            this.importeMaximo = importeMaximo;
        }
    }

    public String getTlf() {
        return tlf;
    }

    

    public PuestoTrabajo getPuesto() {
        return puesto;
    }

    public void setPuesto(PuestoTrabajo puesto) {
        this.puesto = puesto;
    }

    public void CambiarImporte(String tlf, double importe)
    {
        if(this.tlf.equals(tlf))
        {
            this.setImporteMaximo(importe);
        }
        else
        {
            System.out.println("Te has equivocado de tlf y no puedes cambiar el importe");
        }
    }


    

    
}
