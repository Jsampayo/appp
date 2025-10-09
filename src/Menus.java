package src;

import java.util.Scanner;

public class Menus {
    //Creé el objeto Scanner dentro de un metodo MAIN para reutilizarlo en los demas metodos, al crearlo en un metodo individual su alcance es solo local
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Username = Inicio_de_sesion_User(input);
        System.out.println(Username);
    }

    static void menu_principal(){
        System.out.println("La Cantera Reservas");
        System.out.println("\n1. Acceder como cliente\n2.Acceder como administrador");
    }

    static void Inicio_de_sesion_admin(){

        System.out.print("Ingrese su usuario de admin: ");

        System.out.print("Ingrese su contraseña: ");

        
    }
    


    // Menus de usuario
    public static String Inicio_de_sesion_User(Scanner input){
        System.out.println("Ingrese su nombre de usuario:");
        String Username = input.nextLine();
            return Username;
    }

    public static String Inicio_de_sesion_UserPassword(Scanner input){
        System.out.println("Ingrese su contraseña:");
        String UserPassword = input.nextLine();
            return UserPassword;
        
    }
    }







