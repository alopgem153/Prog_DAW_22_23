import java.util.List;

import modelo.Coche;
import modelo.Employee;
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
    }
}
