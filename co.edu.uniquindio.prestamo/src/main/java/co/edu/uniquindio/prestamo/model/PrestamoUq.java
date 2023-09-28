package co.edu.uniquindio.prestamo.model;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq {
    private String nombre;

    List<Cliente> listaClientes = new ArrayList<>();
    List<Empleado> listaEmpleados = new ArrayList<>();

    public PrestamoUq() {
    }

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     *Metodo para crear un cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */
    public boolean crearCliente(String nombre, String apellido, String cedula, int edad){
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCedula(cedula);
        cliente.setEdad(edad);
        getListaClientes().add(cliente);

        return true;
    }

    /**
     * Metodo para crear un empleado
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */

    public boolean crearEmpleado(String nombre, String apellido, String cedula, int edad){
        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setCedula(cedula);
        empleado.setEdad(edad);
        getListaEmpleados().add(empleado);

        return true;
    }

    /**
     * Metodo para obtener la lista de todos los clientes
     * @return list<Cliente>
     */
    public List<Cliente> obtenerClientes() {
        return getListaClientes();
    }

    /**
     * Metodo para eliminar un cliente
     * @param cedula
     */

    public void eliminarCliente(String cedula) {
        int tamanoLista = getListaClientes().size();
        for (int i = 0; i < tamanoLista; i++){
            Cliente cliente = getListaClientes().get(i);
            if (cliente.getCedula().equalsIgnoreCase(cedula)){
                getListaClientes().remove(i);
                break;
            }
        }
    }

    /**
     * Metodo para obtener la lista de todos los empleados
     * @return list<Empleado>
     */
    public List<Empleado> obtenerEmpleados() {
        return getListaEmpleados();
    }

    /**
     * Metodo para eliminar un empleado
     * @param nombre
     */
    public void eliminarEmpleado(String nombre){
        int tamanoLista = getListaEmpleados().size();
        for (int i=0; i < tamanoLista; i++){
            Empleado empleado = getListaEmpleados().get(i);
            if (empleado.getNombre().equalsIgnoreCase(nombre)){
                getListaEmpleados().remove(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "prestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
