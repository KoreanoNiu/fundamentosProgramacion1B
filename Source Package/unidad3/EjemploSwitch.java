package unidad3;
import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes;
        System.out.println("Ingresa el numero de mes");
        mes = teclado.nextInt();
        final int ENERO = 1;
        final int FEBRERO = 2;
        final int MARZO = 3;
        final int ABRIL = 4;

        switch (mes){
            case ENERO:
                System.out.println("El mes " + mes + " es enero");
                break;
            case FEBRERO:
                System.out.println("El mes " + mes + " es febrero");
                break;
            case MARZO:
                System.out.println("El mes " + mes + " es marzo");
                break;
            case ABRIL:
                System.out.println("El mes " + mes + " es abril");
                break;
            default:
                System.out.println("Mes no valido");
                break;
        }

        char letra = 'a';
        switch (letra) {
            case 'a':
                System.out.println("La letra a");
                break;
            case 'b':
                System.out.println("La letra b");
                break;
            case 'c':
                System.out.println("La letra c");
                break;
        }

        String nombre = "Carlos";
        switch (nombre){
            case "Carlos":
                System.out.println("El nombre es carlos");
                break;
        }
    }
}
