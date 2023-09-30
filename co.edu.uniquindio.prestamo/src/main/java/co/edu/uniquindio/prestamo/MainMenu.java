package co.edu.uniquindio.prestamo;
import co.edu.uniquindio.prestamo.model.PrestamoUq;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        PrestamoUq prestamoUq = new PrestamoUq();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
            //        crearEmpleadoConsola(scanner, prestamoUq);
                    break;

            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de CRUD:");
        System.out.println("1. Crear Estudiante");
        System.out.println("2. Leer Estudiantes");
        System.out.println("3. Actualizar Estudiante");
        System.out.println("4. Eliminar Estudiante");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    //private static void crearEmpleadoConsola(Scanner scanner, PrestamoUq prestamoUq) {
       // System.out.print("Ingrese la cedula del empleado: ");
      //  String id = (scanner.next());
      //  System.out.print("Ingrese el nombre del empleado: ");
      //  String nombre = scanner.next();
       // String apellido = scanner.next();
     //   prestamoUq.crearEmpleadoConsola(id, nombre, apellido);
   // }




}
