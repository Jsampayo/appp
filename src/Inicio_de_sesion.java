package src;

import java.util.Scanner;

public class Inicio_de_sesion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //     String Username = Inicio_de_sesion_User(input);
    //     System.out.println(Username);
    }
    
    public static String Inicio_de_sesion_User(Scanner input) {
        System.out.print("Ingrese su nombre de usuario: ");
        String Username = input.nextLine();
        return Username;
    }

    public static String Inicio_de_sesion_UserPassword(Scanner input) {
        System.out.println("Ingrese su contraseña:");
        String UserPassword = input.nextLine();
        return UserPassword;

    }







}
