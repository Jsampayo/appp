package src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idAdmin = 1043634434;
        String password = "hola";

        // llamar a los metodos aqui
        Menus.menu_principal();
        //de acuerdo a lo que elija se muestra un menu u otro

        Inicio_de_sesion.Inicio_de_sesion_User(input);


    }
}
