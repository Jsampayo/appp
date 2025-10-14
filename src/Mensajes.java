package src;

public class Mensajes {
    
    
    //menus para colocar a la hora de que la sesion o de un error o sea correcta para continuar
    public static void Sesion_usuario() {
        
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║                                 ║");
        System.out.println("║      Bienvenido cliente.        ║");
        System.out.println("║                                 ║");
        System.out.println("╚═════════════════════════════════╝"); 
    }
public static void Sesion_admin() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║                                 ║");
        System.out.println("║    Bienvenido Administrador.    ║");
        System.out.println("║                                 ║");
        System.out.println("╚═════════════════════════════════╝");
    }
public static void Sesion_Exitosa() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║                                 ║");
        System.out.println("║       Su registro a sido        ║");
        System.out.println("║             Exitosó.            ║");
        System.out.println("║                                 ║");
        System.out.println("╚═════════════════════════════════╝");
    }
public static void Sesion_error() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║                                 ║");
        System.out.println("║      su usario o contraseña     ║");
        System.out.println("║         son incorrectos.        ║");
        System.out.println("║                                 ║");
        System.out.println("╚═════════════════════════════════╝");

    }
public static void Sesion_en_uso() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║                                 ║");
        System.out.println("║      Este usuario ya esta       ║");
        System.out.println("║           registrado.           ║");
        System.out.println("║                                 ║");
        System.out.println("╚═════════════════════════════════╝");
    }

public static void Opción_Invalida() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║                                 ║");
        System.out.println("║        Opcion no valida.        ║");
        System.out.println("║                                 ║");
        System.out.println("╚═════════════════════════════════╝");
    }

        
        
        


}