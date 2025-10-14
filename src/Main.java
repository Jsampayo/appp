package src;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Credenciales Administrador definidas por defecto 
        String IdAdmin = "1043634434";
        String PasswordAdmin = "hola";

        // Llamada al menu principal y almacenamos una variable con la opcion elegida para elegir el menú correspondiente
        Byte opcion = Inicio_sesion_y_registro.menu_principal(input);

        // Si la opcion es 1 llamamos al menu del Usuario 
        if (opcion == 1){
           Inicio_sesion_y_registro.Menu_cliente(input);
        }
    
        //Jesus tu parte (Convertir en metodo)
        // Si la opcion es 2 llamamos pedimos las credenciales directamente ya que el admin no necesita registrarse       
        else if (opcion == 2){
            input.nextLine();
            String AdminName = Inicio_sesion_y_registro.AdminUser(input);
            System.out.println("AdminName: "+AdminName);
            String AdminPassword = Inicio_sesion_y_registro.AdminPassword(input);
            System.out.println("AdminPassword: "+AdminPassword);

        // Validamos directamente que el nombre y contraseña sea el preestablecido con .equals que es la manera correcta de comparar strings  
                if (! AdminName.equals(IdAdmin) || ! AdminPassword.equals(PasswordAdmin)){
                    Mensajes.Sesion_error();
                }
                else {
                    Mensajes.Sesion_admin();
                }
        }   
                
    
    
    
    }

       
        
            
        
        













        
        
        
        

    }
