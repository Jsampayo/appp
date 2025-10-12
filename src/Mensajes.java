package src;

public class Mensajes {
    
    
    //menus para colocar a la hora de que la sesion o de un error o sea correcta para continuar
    public static void Sesion_usuario() {
        
        System.out.print("╔═════════════════════════════════╗");
        System.out.print("║                                 ║");
        System.out.print("║      Bienvenido cliente.        ║");
        System.out.print("║                                 ║");
        System.out.print("╚═════════════════════════════════╝"); 
    }
public static void Sesion_admin() {
        System.out.print("╔═════════════════════════════════╗");
        System.out.print("║                                 ║");
        System.out.print("║    Bienvenido Administrador.    ║");
        System.out.print("║                                 ║");
        System.out.print("╚═════════════════════════════════╝");
    }
public static void Sesion_Exitosa() {
        System.out.print("╔═════════════════════════════════╗");
        System.out.print("║                                 ║");
        System.out.print("║       Su registro a sido        ║");
        System.out.print("║             Exitosó.            ║");
        System.out.print("║                                 ║");
        System.out.print("╚═════════════════════════════════╝");
    }
public static void Sesion_error() {
        System.out.print("╔═════════════════════════════════╗");
        System.out.print("║                                 ║");
        System.out.print("║      su usario o contraseña     ║");
        System.out.print("║         son incorrectos.        ║");
        System.out.print("║                                 ║");
        System.out.print("╚═════════════════════════════════╝");

    }
public static void Sesion_en_uso() {
        System.out.print("╔═════════════════════════════════╗");
        System.out.print("║                                 ║");
        System.out.print("║      Este usuario ya esta       ║");
        System.out.print("║           registrado.           ║");
        System.out.print("║                                 ║");
        System.out.print("╚═════════════════════════════════╝");
    }
        //Crear Menu opcion no Valida
        //Conectar Metodos inicio de sesion User en base al diagrama de flujo utilizando If y imprimiendo lo ingresado por teclado 
        
        


}