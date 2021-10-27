package unidad3;
import java.util.Scanner;

public class ifAnidado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.println("Ingresa el nombre de usuario");
        nombre = teclado.nextLine();

        if (nombre.equals("admin")){
            System.out.println("Ingresa una contraseña");
            String password = teclado.nextLine();

            if (password.equals("adminadmin")){
                System.out.println("Acceso autorizado");
            } else {
                System.out.println("Acceso denegado, password incorrecta");
            }
        } else {
            System.out.println("Usuario no valido");

            System.out.println("Ingresa un codigo valido");
            int codigoTemporal = teclado.nextInt();

            if (codigoTemporal == 666){
                System.out.println("Acceso temporal");
            } else {
                System.out.println("Codigo erroneo");
            }
        }
    }
}
