package co.edu.uniquindio.prestamo.util;

import javax.swing.*;
import java.util.Scanner;

public class CapturaDatosUtil {

    /**
     * Permite leer un numero entero mediante una caja de dialogo
     * @param mensaje El mensaje que verá el usuario
     * @return el numero ingresado por el usuario
     */
    public static int leerEnteroVentana (String mensaje)
    {
        int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }

    /**
     * Permite imprimir un mensaje
     * @param mensaje El mensaje a imprimir
     */
    public static void imprimir (String mensaje)
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }

    /**
     * Permite leer un numero double mediante una caja de dialogo
     * @param mensaje El mensaje que verá el usuario
     * @return el numero ingresado por el usuario
     */

    public static double leerDouble (String mensaje)
    {
        double dato= Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return dato;
    }

    String respuesta = JOptionPane.showInputDialog(null, "Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);

    public static void mostrarMenu() {
        System.out.println("1 - Crear Estudiante");
        System.out.println("2 - Calcular Promedio");
        System.out.println("3 - Salir");
    }

    public static String leerStringConsola(String mensaje)
    {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }




}
