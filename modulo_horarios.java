import java.util.Scanner;

public class modulo_horarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreCancha = "LA CANTERA";

        String[] horarioCancha = {
                "4 PM - 6 PM",
                "6 PM - 8 PM",
                "8 PM - 10 PM",
                "10 PM - 12 AM",

        };

        int[] canchas = { 10, 14, 16 };

        int[] dias = { 1, 2, 3, 4, 5 };

        System.out.print("Que dia del mes desea reservar (solo escribir el numero) : ");
        int diaReserva = teclado.nextInt();

        if (diaReserva < 30 && diaReserva > 0) {

            System.out.println("\nHORARIOS CANCHA (" + nombreCancha + ") PARA EL DIA " + diaReserva);
            System.out.println("\n");

            System.out.printf("%-30s %-20s %-20s\n", "HORA DISPONIBLE", "DIA", "CAPACIDAD\n");

            for (int j = 0; j < horarioCancha.length; j++) {
                for (int k = 0; k < canchas.length; k++) {
                    System.out.printf("%-30s %-20s  %-20s\n", horarioCancha[j], diaReserva, canchas[k]);

                }
                System.out.println("\n");
            }
        }

        System.out.println("fecha incorrecta");
        System.out.println("hola, esto es una prueba");

        teclado.close();
    }
}
