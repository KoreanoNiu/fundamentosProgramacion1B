package unidad3;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero1, numero2, numero3 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el numero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingresa el numero 2: ");
        numero2 = teclado.nextInt();
        System.out.println("Ingresa el numero 3: ");
        numero3 = teclado.nextInt();
        if (numero1 > numero2){
            if (numero2 > numero3){
                System.out.println("El numero mayor es = " + numero1);
            } else {

            }
        } else {
            if (numero2 > numero3){

            } else {

            }
        }

        teclado.close();
    }
}
