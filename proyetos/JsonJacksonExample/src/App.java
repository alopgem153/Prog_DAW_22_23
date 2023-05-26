import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modelo.Coche;
import modelo.Employee;
import modelo.People;
import modelo.People2;
import modelo.Persona;
import modelo.Persona2;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JSon!");

        //Leer Json que contiene 1 objeto y convertirlo en objeto 
        Employee emp1 = jsonUtils.LeerEmpleadoFromJsonFile("src/recursos/employee.txt");

        System.out.println("==============================================");



        //Leer Json que contiene 1 array de objetos y convertirlo en un list<objeto> 
        List<Employee> listaEmpleados = jsonUtils.LeerListEmpleadoFromJsonFile("src/recursos/employeeArray.txt");
        System.out.println("====== ARRAY EMPLEADOS ========================");

        for (Employee employee : listaEmpleados) {
            System.out.println(employee);
        }

        System.out.println("==============================================");

        //Convertir objeto a Json
        jsonUtils.convertToJson();

        System.out.println("==============================================");

        Coche coche = jsonUtils.leerCocheFromJSON();
        System.out.println(coche);

        List<Coche> listaCoches = jsonUtils.LeerListCochesFromJSONFile(); 

        for (Coche coche2 : listaCoches) {
            System.out.println(coche2);
        }
        

        listaCoches.add(coche);

        System.out.println("==============================================");


        jsonUtils.crearFicheroCoches(listaCoches);


        System.out.println("=============== ARRAY de PERSONAS ============================");

        People people = jsonUtils.leerFicheroPersonas();

        for (Persona persona : people.getPeople()) {
            System.out.println(persona);
        } 


        System.out.println("=============== ARRAY de PERSONAS 2 (ESPAÑOL) ============================");

        People2 people2 = jsonUtils.leerFicheroPersonas2();

        for (Persona2 persona : people2.getPeople()) {
            System.out.println(persona);
        } 
        
        System.out.println("==============================================");


        ArrayList<Persona> personasCon24 = new ArrayList<>();

        for (Persona persona : people.getPeople()) {
            if (persona.getAge().equals(24))
            {
                personasCon24.add(persona);
            }
        }

        People persona2 = new People();

        persona2.setPeople(personasCon24);

        jsonUtils.crearFicheroPersonas(persona2);

        System.out.println("=============== HASHMAP<DNI:PERSONA> ============================");

        // HashMap<String, Persona> diccionarioPersonas = new HashMap<>();

        // diccionarioPersonas.put("12345678P", people.getPeople().get(0));
        // diccionarioPersonas.put("98765432Z", people.getPeople().get(1));
        // diccionarioPersonas.put("55578321Y", people.getPeople().get(2));

        // jsonUtils.crearFicheroDiccionario(diccionarioPersonas);

        HashMap<String, Persona> diccionarioPersonas = jsonUtils.leerJsonDiccionariopersona();


    }
}
