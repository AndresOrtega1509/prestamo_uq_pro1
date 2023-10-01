package co.edu.uniquindio.prestamo;
import co.edu.uniquindio.prestamo.model.PrestamoUq;
import co.edu.uniquindio.prestamo.util.CapturaDatosUtil;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        PrestamoUq prestamoUq = new PrestamoUq();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = CapturaDatosUtil.leerIntConsola("");

            switch (opcion) {
                case 1:
                    String nombre = CapturaDatosUtil.leerStringConsola("Ingresa el nombre del empleado: ");
                    String apellido = CapturaDatosUtil.leerStringConsola("Ingresa el apellido del empleado: ");
                    String cedula = CapturaDatosUtil.leerStringConsola("Ingresa la cedula del empleado: ");
                    int edad = CapturaDatosUtil.leerIntConsola("Ingresa la edad del empleado: ");
                    prestamoUq.crearEmpleado(nombre, apellido, cedula, edad);

                    break;

                case 2:
                    nombre = CapturaDatosUtil.leerStringConsola("Ingrese el nombre del objeto: ");
                    String id = CapturaDatosUtil.leerStringConsola("Ingrese el Id del objeto");
                    prestamoUq.crearObjeto(nombre, id);

                    break;

                case 3:
                    nombre = CapturaDatosUtil.leerStringConsola("Ingresa el nombre del cliente: ");
                    apellido = CapturaDatosUtil.leerStringConsola("Ingresa el apellido del cliente: ");
                    cedula = CapturaDatosUtil.leerStringConsola("Ingresa la cedula del cliente: ");
                    edad = CapturaDatosUtil.leerIntConsola("Ingresa la edad del cliente: ");
                    prestamoUq.crearCliente(nombre, apellido, cedula, edad);

                    break;

                case 4:
                    cedula = CapturaDatosUtil.leerStringConsola("Ingresa la cedula para actualizar el empleado: ");
                    nombre = CapturaDatosUtil.leerStringConsola("Ingresa el nuevo nombre del empleado: ");
                    apellido = CapturaDatosUtil.leerStringConsola("Ingresa el nuevo apellido del empleado: ");
                    edad = CapturaDatosUtil.leerIntConsola("Ingresa la nueva edad del empleado: ");
                    prestamoUq.actualizarEmpleado(cedula, nombre, apellido,edad);

                    break;

                case 5:
                    id = CapturaDatosUtil.leerStringConsola("Ingrese el Id para actualizar el objeto: ");
                    nombre = CapturaDatosUtil.leerStringConsola("Ingrese el nuevo nombre del objeto: ");
                    prestamoUq.actualizarObjeto(id, nombre);

                    break;

                case 6:
                    cedula = CapturaDatosUtil.leerStringConsola("Ingrese la cedula para actualizar el cliente");
                    nombre = CapturaDatosUtil.leerStringConsola("Ingresa el nuevo nombre del cliente: ");
                    apellido = CapturaDatosUtil.leerStringConsola("Ingresa el nuevo apellido del cliente: ");
                    edad = CapturaDatosUtil.leerIntConsola("Ingresa la nueva edad del cliente: ");
                    prestamoUq.actualizarCliente(cedula, nombre, apellido, edad);

                    break;

                case 7:
                    prestamoUq.mostrarEmpleado();
                    break;

                case 8:
                    prestamoUq.mostrarObjeto();
                    break;


                case 9:
                    prestamoUq.mostrarCliente();
                    break;


                case 10:
                    cedula = CapturaDatosUtil.leerStringConsola("Ingrese la cedula del empleado para eliminarlo: ");
                    prestamoUq.eliminarEmpleado(cedula);
                    break;

                case 11:
                    id = CapturaDatosUtil.leerStringConsola("Ingrese el Id del objeto para eliminarlo: ");
                    prestamoUq.eliminarObjeto(id);

                    break;

                case 12:
                    cedula = CapturaDatosUtil.leerStringConsola("Ingrese la cedula del cliente para eliminarlo: ");
                    prestamoUq.eliminarCliente(cedula);

                    break;

                case 13:
                    System.out.println("El usuario ha salido del sistema.");
                    break;

            }
            if(opcion == 13) {
                break;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de CRUD:");
        System.out.println("1. Crear Empleado");
        System.out.println("2. Crear Objeto");
        System.out.println("3. Crear Cliente");
        System.out.println("4. Actualizar Empleado");
        System.out.println("5. Actualizar Objeto");
        System.out.println("6. Actualizar Cliente");
        System.out.println("7. Leer Empleado");
        System.out.println("8. Leer Objeto");
        System.out.println("9. Leer Cliente");
        System.out.println("10. Eliminar Empleado");
        System.out.println("11. Eliminar Objeto");
        System.out.println("12. Eliminar Cliente");
        System.out.println("13. Salir");
        System.out.print("Selecciona una opción: ");
    }

}
