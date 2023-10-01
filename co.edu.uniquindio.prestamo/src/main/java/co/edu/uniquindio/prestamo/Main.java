package co.edu.uniquindio.prestamo;
import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.Empleado;
import co.edu.uniquindio.prestamo.model.Objeto;
import co.edu.uniquindio.prestamo.model.PrestamoUq;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrestamoUq prestamoUq = inicializarDatosPrueba();

        //Crud cliente

        //Create
        crearCliente("Juan", "Sanchez", "1087653421", 34, prestamoUq);
        crearCliente("Maria", "Rodriguez", "1034543343", 23, prestamoUq);
        crearCliente("Santiago", "Perez", "1016745323", 15, prestamoUq);
        crearCliente("Sofia", "Cardona", "1094574839", 19, prestamoUq);

        //Read
        System.out.println("Información clientes: ");
        mostrarInformacionCliente(prestamoUq);

        //Delate
        eliminarCliente("1016745323", prestamoUq);
        System.out.println("-----> Información luego de eliminar");
        mostrarInformacionCliente(prestamoUq);

        //Update
        actualizarCliente("1087653421", "Andres", "Ortega", 20, prestamoUq);
        System.out.println("-----> Informacion luego de actualizar: ");
        mostrarInformacionCliente(prestamoUq);

        //Crud empleado

        //Create
        crearEmpleado("Sebastian", "Calderon", "1096493875", 25, prestamoUq);
        crearEmpleado("Duvan", "Ceron", "1093983821", 31, prestamoUq);
        crearEmpleado("Monica", "Carvajal", "1016870947", 29, prestamoUq);
        crearEmpleado("Mariana", "Lopez", "1082748329", 38, prestamoUq);

        //Read
        System.out.println("Información empleados:");
        mostraInformacionEmpleado(prestamoUq);

        //Delate
        eliminarEmpleado("1082748329", prestamoUq);
        System.out.println("-----> Información luego de eliminar");
        mostraInformacionEmpleado(prestamoUq);

        //Update
        actualizarEmpleado("1096493875", "Arturo", "Ortiz", 34, prestamoUq);
        System.out.println("-----> Informacion luego de actualizar: ");
        mostraInformacionEmpleado(prestamoUq);

        //Crud objeto

        //Create
        crearObjeto("Computador","1094", prestamoUq);
        crearObjeto("Tablet","1040", prestamoUq);
        crearObjeto("Celular","1022", prestamoUq);
        crearObjeto("Auriculares", "1098",prestamoUq);

        //Read
        System.out.println("Información objetos: ");
        mostrarInformacionObjeto(prestamoUq);

        //Delate
        eliminarObjeto("1098", prestamoUq);
        System.out.println("-----> Información luego de eliminar");
        mostrarInformacionObjeto(prestamoUq);

        //Update
        actualizarObjeto("1094","Reloj digital", prestamoUq);
        System.out.println("-----> Informacion luego de actualizar: ");
        mostrarInformacionObjeto(prestamoUq);
    }

    private static PrestamoUq inicializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamo rapido");

        return prestamoUq;
    }

    private static void crearEmpleado(String nombre,
                                      String apellido,
                                      String cedula,
                                      int edad,
                                      PrestamoUq prestamoUq) {

        prestamoUq.crearEmpleado(nombre, apellido, cedula, edad);

    }

    private static void crearObjeto(String nombre,String id, PrestamoUq prestamoUq) {

        prestamoUq.crearObjeto(nombre, id);
    }

    private static void crearCliente(String nombre,
                                     String apellido,
                                     String cedula,
                                     int edad,
                                     PrestamoUq prestamoUq) {
        prestamoUq.crearCliente(nombre, apellido, cedula, edad);
    }

    private static void mostrarInformacionCliente(PrestamoUq prestamoUq) {

        List<Cliente> listaClientes = prestamoUq.obtenerClientes();
        int tamanoLista = listaClientes.size();
        for (int i=0; i < tamanoLista; i++){
            Cliente cliente = listaClientes.get(i);
            System.out.println(cliente.toString());
        }
    }

    private static void mostraInformacionEmpleado(PrestamoUq prestamoUq){

        List<Empleado> listaEmpleados = prestamoUq.obtenerEmpleados();
        int tamanoLista = listaEmpleados.size();
        for (int i = 0; i < tamanoLista; i ++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.toString());
        }
    }

    private static void mostrarInformacionObjeto(PrestamoUq prestamoUq) {

        List<Objeto> listaObjetos = prestamoUq.obtenerObjetos();
        int tamanoLista = listaObjetos.size();
        for (int i=0; i < tamanoLista; i++){
            Objeto objeto = listaObjetos.get(i);
            System.out.println(objeto.toString());
        }
    }

    private static void eliminarEmpleado(String cedula, PrestamoUq prestamoUq) {
        prestamoUq.eliminarEmpleado(cedula);
    }

    private static void eliminarObjeto(String id, PrestamoUq prestamoUq) {

        prestamoUq.eliminarObjeto(id);
    }

    private static void eliminarCliente(String cedula, PrestamoUq prestamoUq) {
        prestamoUq.eliminarCliente(cedula);
    }

    private static void actualizarObjeto(String id, String nombreNuevo, PrestamoUq prestamoUq) {
        prestamoUq.actualizarObjeto(id, nombreNuevo);
    }

    private static void actualizarCliente(String cedula, String nuevoNombre, String nuevoApellido, int nuevaEdad, PrestamoUq prestamoUq){
        prestamoUq.actualizarCliente(cedula, nuevoNombre, nuevoApellido, nuevaEdad);
    }

    private static void actualizarEmpleado(String cedula, String nuevoNombre, String nuevoApellido, int nuevaEdad, PrestamoUq prestamoUq) {
        prestamoUq.actualizarEmpleado(cedula, nuevoNombre, nuevoApellido,nuevaEdad);
    }

}