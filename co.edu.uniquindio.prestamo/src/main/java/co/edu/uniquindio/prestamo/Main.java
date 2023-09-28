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
        eliminarCliente(prestamoUq, "1016745323");
        System.out.println("-----> Información luego de eliminar");
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
        eliminarEmpleado(prestamoUq, "Mariana");
        System.out.println("-----> Información luego de eliminar");
        mostraInformacionEmpleado(prestamoUq);

        //Crud objeto

         //Create
        crearObjeto("Computador", prestamoUq);
        crearObjeto("Tablet", prestamoUq);
        crearObjeto("Celular", prestamoUq);
        crearObjeto("Auriculares", prestamoUq);

        //Read
        System.out.println("Información objetos: ");
        mostrarInformacionObjeto(prestamoUq);

        //Delate
        eliminarObjeto(prestamoUq, "Celular");
        System.out.println("-----> Información luego de eliminar");
        mostrarInformacionObjeto(prestamoUq);
    }

    private static void crearEmpleado(String nombre,
                                      String apellido,
                                      String cedula,
                                      int edad,
                                      PrestamoUq prestamoUq) {

        prestamoUq.crearEmpleado(nombre, apellido, cedula, edad);

    }

    private static void eliminarCliente(PrestamoUq prestamoUq, String cedula) {
        prestamoUq.eliminarCliente(cedula);
    }

    private static PrestamoUq inicializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamo rapido");

        return prestamoUq;
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

    private static void eliminarEmpleado(PrestamoUq prestamoUq, String nombre) {
        prestamoUq.eliminarEmpleado(nombre);
    }

    private static void crearObjeto(String nombre, PrestamoUq prestamoUq) {

        prestamoUq.crearObjeto(nombre);
    }

    private static void mostrarInformacionObjeto(PrestamoUq prestamoUq) {

        List<Objeto> listaObjetos = prestamoUq.obtenerObjetos();
        int tamanoLista = listaObjetos.size();
        for (int i=0; i < tamanoLista; i++){
            Objeto objeto = listaObjetos.get(i);
            System.out.println(objeto.toString());
        }
    }

    private static void eliminarObjeto(PrestamoUq prestamoUq, String nombre) {

        prestamoUq.eliminarObjeto(nombre);
    }


}