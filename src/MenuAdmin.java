package src;

import java.util.Scanner;

public class MenuAdmin {
    public static int consultarReservaCliente(Scanner input) {
        System.out.print("Digite el id del cliente a consultar: ");
        int idCliente = input.nextInt();
        return idCliente;

    }
}
