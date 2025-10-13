import java.util.Scanner;
import java.util.HashMap;
public class Array_test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        /* Para crear un HashMap (Diccionario de Python en Java) 
        1. Se debe import el Framework java.util.HashMap
        2. Definir la variable de tipo HashMap dandole entre signos de comparacion de valor tanto el tipo de dato de la clave como el del valor
        3. Definir nombre de nuestro HashMap 
        4. Usar el constructor New y ponerle el tipo HashMap<>() ....

         HashMap<String, String> Usuarios = new HashMap<>();

        //Pedimos por teclado nuestra clave y valor en este caso Usuario y Contraseña
        System.out.println("Nombre Usuario: ");
        String user = input.nextLine();
        System.out.println("Contraseña");
        String password = input.nextLine();

        //Con en metodo .put agregamos valores a nuestro hashmap y se define de esta manera - NombreHasMap.put(Key,Value)
        Usuarios.put(user,password);

        // Bucle for each que se lee 
        // Por cada usuario dentro del HashMap Usuarios, Imprime el usuario mas su clave 
        // Key set accede a las claves mientras que get devuelve el valor de esa clave 
        for (String usuario : Usuarios.keySet()){
            System.out.println("Usuario: "+usuario+" Contraseña: "+Usuarios.get(usuario));
        }
        */
        
        Byte i = 1;
        String id = "123";
        String contra = "321";

        HashMap <String,String> Usuarios =new HashMap<>();
        Usuarios.put(id, contra);

        System.out.println("Digite su usuario: ");
        String usua = input.nextLine();
        System.out.println("Digite su contraseña: ");
        String contras = input.nextLine();

        for (String useri : Usuarios.keySet()){
            if (usua.equals(useri)){
                System.out.println("Usuario ya Registrado");
            }
            else Usuarios.put(usua, contras);
            ;
        }



      for (String user : Usuarios.keySet()){
        System.out.println(i+". Usuario: "+user+" Contraseña: "+Usuarios.get(user));
        i++;
      }




    }
}

