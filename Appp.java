import java.util.Scanner;

public class Appp {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
    
        String[][] tablaReservas = {
            {"Juan", "Alameda", "11 pm - 12am"}
        };
        
        int numeroReservasActivas = 1;
        
        //Menu principal
            System.out.println("----------------------------------------\nSistema de reservar para canchas sinteticas\n----------------------------------------\n1. cliente\n2. Administrador de cancha\n3. Dueño\n4. salir");
            
            System.out.print("\nSelecione su tipo de usuario con el numero de opcion: ");
            byte opcionMenuPrincpial = teclado.nextByte();

            switch (opcionMenuPrincpial) {

                case 1:
                    System.out.println("----------------------------------------\nMenu cliente\n----------------------------------------\n1. Ver reservas activas\n2. Reservar una cancha\n3. volver");
                    
                    System.out.print("\nSelecciona la opcion de tu preferencia: ");
                    byte opcionMenuCliente = teclado.nextByte();

                    if (opcionMenuCliente == 1 && numeroReservasActivas > 0) {
                        System.out.println("Actualmente tienes (" + numeroReservasActivas + ") reservas activas\n\n");
                        System.out.printf("%-10s %-10s %-10s\n", "NOMBRE", "CANCHA", "HORA");
                        
                        for (String[] fila : tablaReservas){
                            System.out.printf("%-10s %-10s %-10s\n", fila[0], fila[1], fila[2]);
                            System.out.println("\n");
                        }
                    } else{System.out.println("No tienes reservas activas en este momento");}
                    
                    if (opcionMenuCliente == 2) {
                        System.out.println("Actualmente tienes (" + numeroReservasActivas + ") reservas activas\n\n");
                        System.out.printf("%-10s %-10s %-10s\n", "NOMBRE", "CANCHA", "HORA");
                        
                        for (String[] fila : tablaReservas){
                            System.out.printf("%-10s %-10s %-10s\n", fila[0], fila[1], fila[2]);
                            System.out.println("\n");
                        }
                    }//else{System.out.println("No tienes reservas activas en este momento");}




                    break;

                case 2:
                    System.out.println("----------------------------------------\nMenu administrador de cancha\n----------------------------------------\n1. Consultar reservas - Modificar reservas\n+ 2. Consultar cliente\n3. volver");

                case 3:
                    System.out.println("----------------------------------------\nMenu cliente\n----------------------------------------\n1. Ver reservas activas\n2. Reservar una cancha\n3. volver");
                    break;

                case 4:
                    System.out.println("----------------------------------------\nMenu Dueño de cancha\n----------------------------------------\n1. Consultar sedes\n2. Consultar reservas\n3. Ver estadisticas\n4. volver");
                    break;

                default:
                    System.out.println("----------------------------------------\nOpcion incorrecta\n----------------------------------------");
                    break;





        }
        teclado.close();
    
        

    }
}
        
// inicio de sesion con cc para cada tipo de usuario
/*
List<String[]> tablaReservasList = new ArrayList<>(); CREACION DEL ARRAY

tablaReservasList.add(new String[]{"Juan", "Alameda", "11 pm – 12am"}); AGG ELEMENTOS

.size() PARA TAMAÑO

guardar usuario por cc para mas facil


*/