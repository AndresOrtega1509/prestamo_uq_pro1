package co.edu.uniquindio.prestamo;
import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrestamoUq prestamoUq = inicializarDatosPrueba();

        //Crud

         //Create
        crearCliente("Juan", "Sanchez", "1087653421", 34, prestamoUq);
        crearCliente("Maria", "Rodriguez", "1034543343", 23, prestamoUq);
        crearCliente("Santiago", "Perez", "1016745323", 15, prestamoUq);
        crearCliente("Sofia", "Cardona", "1094574839", 19, prestamoUq);

        //Read
        mostrarInformacionCliente(prestamoUq);

        //Delate
        eliminarCliente(prestamoUq, "1016745323");
        System.out.println("-----> Información luego de eliminar");
        mostrarInformacionCliente(prestamoUq);
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
}