package src;

import java.util.Scanner;

public class Menus {
    public static void main(String[] args) {
    
}
    
    static void menu_principal(){
        System.out.println("La Cantera Reservas");
        System.out.println("\n1. Acceder como cliente\n2.Acceder como administrador");
    }

    static void Inicio_de_sesion_admin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su usuario de admin: ");
        int user = scanner.nextInt();

        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();
        
        
        scanner.close();


    }
    






}


