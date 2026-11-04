import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el numero de guia del primer paquete: ");
        int guia1 = scanner.nextInt();


        if (guia1 <= 0) {
            System.out.println("El numero de guia debe ser mayor a cero.");
        } else {
            scanner.nextLine();
            System.out.print("Ingrese la ciudad de destino: ");
            String destino1 = scanner.nextLine();


            System.out.print("Ingrese el peso en kg: ");
            double peso1 = scanner.nextDouble();


            if (peso1 <= 0) {
                System.out.println("El peso debe ser mayor a cero.");
            } else {
                mostrarEtiqueta(guia1, destino1, peso1);
            }
        }


        System.out.print("Ingrese el numero de guia del segundo paquete: ");
        int guia2 = scanner.nextInt();


        if (guia2 <= 0) {
            System.out.println("El numero de guia debe ser mayor a cero.");
        } else {
            scanner.nextLine();
            System.out.print("Ingrese la ciudad de destino: ");
            String destino2 = scanner.nextLine();


            System.out.print("Ingrese el peso en kg: ");
            double peso2 = scanner.nextDouble();


            if (peso2 <= 0) {
                System.out.println("El peso debe ser mayor a cero.");
            } else {
                mostrarEtiqueta(guia2, destino2, peso2);
            }
        }
    }


    public static void mostrarEtiqueta(int guia, String destino, double peso) {
        System.out.println("Numero de guia: " + guia);
        System.out.println("Destino: " + destino);
        System.out.println("Peso: " + peso + " kg");
    }
}
