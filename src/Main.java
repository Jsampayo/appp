package src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Credenciales Administrador definidas por defecto 
        String IdAdmin = "1043634434";
        String PasswordAdmin = "hola";

        
        // Llamada al menu principal y almacenamos una variable con la opcion elegida para elegir el men correspondiente
        Byte opcion = Inicio_sesion_y_registro.menu_principal(input);

        // Llamamos al menu del Usuario y pedimos por teclado si desea Iniciar Sesion o Registrarse
        // Consumimos Saltos de linea con input.nextLine(); para que no ignore nuestro Scanner 
        if (opcion == 1){
            byte inicio = Inicio_sesion_y_registro.Menu_cliente(input);
                if (inicio == 1){
                    input.nextLine();
                    String Username = Inicio_sesion_y_registro.Inicio_de_sesion_User(input);
                    System.out.println("Username "+ Username);
                    String UserPassword = Inicio_sesion_y_registro.Inicio_de_sesion_UserPassword(input);
                    System.out.println("Password "+ UserPassword);
                                }
                
                else if (inicio == 2) { 
                    input.nextLine();
                    String RegistroUser = Inicio_sesion_y_registro.Registrar_Username(input);
                    System.out.println("Register Username: "+ RegistroUser);
                     String RegistroPassword = Inicio_sesion_y_registro.Registro_Password(input);
                    System.out.println("Register Password: "+ RegistroPassword); 
                                      }
                        }
       
        
            
        
        













        
        
        
        

    }
}
