package src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String IdAdmin = "1043634434";
        String PasswordAdmin = "hola";

        
        // Llamada al menu principal y almacenamos una variable con la opcion elegida
        Byte opcion = Menus.menu_principal(input);
        

        if (opcion == 1){
            Menus.Acceder_Usuario(input);
        }   else {System.out.println("nada");
            }
        
        













        
        
        
        

    }
}
