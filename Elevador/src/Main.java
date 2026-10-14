import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("En que piso estas?");
        int actual = teclado.nextInt();

        if (actual <= 0) {
            System.out.println("No hay piso 0");
            System.out.println("En que piso estas?");
            actual = teclado.nextInt();
        } else if (actual > 10) {
            System.out.println("Solo hay 10 pisos");
            System.out.println("En que piso estas?");
            actual = teclado.nextInt();
        }


        System.out.println("A que piso vas?");
        int destino = teclado.nextInt();

        if (destino <= 0) {
            System.out.println("Dame un destino diferente al 0");
            destino = teclado.nextInt();
        }else if (destino > 10) {
            System.out.println("Solo hay 10 pisos");
            System.out.println("A que piso vas?");
            destino = teclado.nextInt();
        }

        if (destino == actual) {
            System.out.println("Dame un destino diferente al piso actual");
            destino = teclado.nextInt();

        }
        if (destino > actual) {
            while (actual <= destino) {
                System.out.println("" + actual + "");
                actual++;

            }
        } else {
            while (actual >= destino) {
                System.out.println("" + actual + "");
                actual--;
            }
        }
    }
}