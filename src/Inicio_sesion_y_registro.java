package src;

import java.util.HashMap;
import java.util.Scanner;

public class Inicio_sesion_y_registro {
    /*
     * Creé el objeto Scanner dentro de un metodo MAIN para reutilizarlo en los
     * demas metodos, al crearlo en un metodo individual su alcance es solo local
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
    public static void Menu_cliente(Scanner input) {
    HashMap <String,String> Usuarios = new HashMap<>();
        System.out.println("1. Iniciar Sesión\n2. Registrarse");
        byte index = 1;
        byte opcion = input.nextByte();
        
        switch (opcion) {
        
            case 1:{
                    input.nextLine();
                    String Username = Inicio_sesion_y_registro.Inicio_de_sesion_User(input);
                    System.out.println("Username "+ Username);
                    String UserPassword = Inicio_sesion_y_registro.Inicio_de_sesion_UserPassword(input);
                    System.out.println("Password "+ UserPassword);
                    break;
            }

            case 2: {                        
                    input.nextLine();
                    String RegistroUser = Inicio_sesion_y_registro.Registrar_Username(input);
                    System.out.println("Register Username: "+ RegistroUser);
                     String RegistroPassword = Inicio_sesion_y_registro.Registro_Password(input);
                    System.out.println("Register Password: "+ RegistroPassword); 
                    
                    Usuarios.put(IdAdmin, PasswordAdmin);
                    if (Usuarios.containsKey(RegistroUser)){
                        Mensajes.Sesion_en_uso();
                    }

                    else {
                        Usuarios.put(RegistroUser, RegistroPassword);

                        for (String user : Usuarios.keySet()){
                            System.out.println(index+". Usuario: "+user);
                        }
                    }
                    break;
            }
            
            default:{
                    Mensajes.Opción_Invalida();
                    Menu_cliente(input);        
                    break;
            }
        }
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

    //Menu mostrado al elegir la opcion Administrador en el menu principal 
    public static String AdminUser(Scanner input){
        System.out.println("Ingrese su Nombre de administrador");
        String AdminName = input.nextLine();
        return AdminName;
    }

    //Menu mostrado al elegir la opcion Administrador en el menu principal 
    public static String AdminPassword(Scanner input){
        System.out.println("Ingrese su Contraseña de administrador");
        String AdminPassword = input.nextLine();
        return AdminPassword;
    }
    

}
