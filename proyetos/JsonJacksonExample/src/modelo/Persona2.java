package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Persona2 {

    @JsonProperty("firstNamee")
    private String nombre;
    @JsonProperty("lastName")
    private String apellido;
    @JsonProperty("gender")
    private String sexo;
    @JsonProperty("age")
    private Integer edad;
    // @JsonProperty("number")
    // private String numero;
    private String dni;
    @JsonProperty("pais-ciudad")
    private String paisCiudad;


    public Persona2()
    {
        this.dni = "----";
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public Integer getEdad() {
        return edad;
    }


    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    // public String getNumero() {
    //     return numero;
    // }


    // public void setNumero(String numero) {
    //     this.numero = numero;
    // }


    @Override
    public String toString() {
        return "Persona2 [nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad
                + "DNI: " + this.dni+  " ]";
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }



    
    
}
