package src;

public class Sesiones_de_inicio {
    
    
    //menus para colocar a la hora de que la sesion o de un error o sea correcta para continuar
    public void Sesion_usuario() {
        
        System.out.print("╔═════════════════════════════════╗");
        System.out.print("║                                 ║");
        System.out.print("║      Bienvenido cliente         ║");
        System.out.print("║                                 ║");
        System.out.print("╚═════════════════════════════════╝"); 
    }
   public void Sesion_admin() {
        System.out.print("╔═════════════════════════════════╗");
        System.out.print("║                                 ║");
        System.out.print("║    Bienvenido Administrador     ║");
        System.out.print("║                                 ║");
        System.out.print("╚═════════════════════════════════╝");
    }
   public void Sesion_error() {
        System.out.print("╔═════════════════════════════════╗");
        System.out.print("║                                 ║");
        System.out.print("║      su usario o contraseña     ║");
        System.out.print("║         son incorrectos         ║");
        System.out.print("║                                 ║");
        System.out.print("╠═════════════════════════════════╣");
        System.out.print("║                                 ║");
        System.out.print("║                                 ║");
        System.out.print("║                                 ║");
        System.out.print("║ porfavor dijiste nuevamente su  ║");
        System.out.print("║       usario y contraseña       ║");
        System.out.print("║                                 ║");
        System.out.print("║                                 ║");
        System.out.print("║                                 ║");
        System.out.print("╚═════════════════════════════════╝");
    }

}