package unidad3;

import java.util.Scanner;

/**
 * Solicitar al usuario ingrese un nomnbre.
 *Si el nombre es administrador, solicitarle
 * el password, si el password es "adminadmin"
 * mostrar "Usuario admitido.
 * Si el uraurio no fue adminsitrador mostrar un mensaje
 * que diga "Usuario no válido". si el password no fue el
 * correcto mostrar "Password equivocado"
 * si el usaurio NO FUE administrador, solicitarle un posible 
 * código numérico temporal...Si este código es el 666 msotrar 
 * "Acceso temporal!"
 */
public class IfAnidados {
    public static void main(String[] args){
        String nombre;
        String password;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario: ");
        nombre = teclado.nextLine();
        
        if(nombre.equals("administrador"))
        {
          System.out.println("Ingrese su password: "); 
          password = teclado.nextLine();
          if(password.equals("adminadmin"))
          {
              System.out.println("Usuario valido");
          }
          else
          {
              System.out.println("Password equivocado");
          }
          
        }
        else
        {
            System.out.println("Usuario no valido");
            int codigoTemporal;
            System.out.println("Ingrese un código temporal");
            codigoTemporal = teclado.nextInt();
            
            if(codigoTemporal == 666)
            {
                System.out.println("Acceso temporal!");
            }
            
        }
    }
}
