package src;

import java.util.Scanner;

public class Menus {
    /*
     * Creé el objeto Scanner dentro de un metodo MAIN para reutilizarlo en los
     * demas metodos, al crearlo en un metodo individual su alcance es solo local
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Username = Inicio_de_sesion_User(input);
        System.out.println(Username);
    }

    // Menu que se muestra al inicializar el programa
    static byte menu_principal(Scanner input) {
        System.out.println("\nLa Cantera Reservas");
        System.out.println("\n1. Acceder como Cliente\n2. Acceder como administrador");
        System.out.print("\nDigite su opcion: ");
        byte opcion = input.nextByte();
        System.out.print("\n");
        return opcion;
    }

    // Menu Principal Usuario/Cliente
    public static byte Menu_cliente(Scanner input) {
        System.out.println("1. Iniciar Sesión\n2. Registrarse");
        byte opcion = input.nextByte();
        return opcion;
    }

    // Menu mostrado al elegir la opcion Usuario en el menu principal y acceder
    public static String Inicio_de_sesion_User(Scanner input) {
        System.out.print("Ingrese su nombre de usuario: ");
        String Username = input.nextLine();
        return Username;
    }

    // Menu mostrado al elegir la opcion Usuario en el menu principal y acceder
    public static String Inicio_de_sesion_UserPassword(Scanner input) {
        System.out.print("Ingrese su contraseña: ");
        String UserPassword = input.nextLine();
        return UserPassword;
    }

    // Menu mostrado al elegir la opcion Usuario en el menu principal y registrarse
    public static String Registrar_Username(Scanner input) {
        System.out.print("Ingrese su Usuario: ");
        String RegistroUser = input.nextLine();
        return RegistroUser;
    }

    // Menu mostrado al elegir la opcion Usuario en el menu principal y registrarse
    public static String Registro_Password(Scanner input) {
        System.out.println("Ingrese su contraseña: ");
        String RegistroPassword = input.nextLine();
        return RegistroPassword;
    }

}
