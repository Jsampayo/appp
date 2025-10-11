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
           byte inicio = Menus.Menu_cliente(input);
           if (inicio == 1){
            String Username = Menus.Inicio_de_sesion_User(input);
            String UserPassword = Menus.Inicio_de_sesion_UserPassword(input);
            //validar que estas credenciales sean correctas, si no son correctar repetir el proceso
            //if (    )
            //else {
            // Menus_continuidad_error.Sesion_error();}
           }else if (inicio == 2){
                String RegistroUser = Menus.Registrar_Username(input);
                String RegistroPassword = Menus.Registro_Password(input);
                
                
                // else{
                //  Menus_continuidad_error.Sesion_en_uso();}
           }


           else {System.out.println("dijite una opcion valida");

           }
        }   
        else if (opcion == 2){ 

        }

        
            
        
        













        
        
        
        

    }
}
