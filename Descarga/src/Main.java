import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el tamano del archivo en MB: ");
        System.out.println("Ingrese -1 si desea terminar");
        double tamano = scanner.nextDouble();


        while (tamano != -1) {


            if (tamano < 0) {
                System.out.println("El tamano del archivo no puede ser negativo.");
            } else {
                System.out.print("Ingrese la velocidad de descarga (MB/s): ");
                double velocidad = scanner.nextDouble();


                if (velocidad <= 0) {
                    System.out.println("La velocidad de descarga debe ser mayor que cero.");
                } else {
                    double tiempo = calcularTiempo(tamano, velocidad);
                    System.out.println("Tiempo estimado de descarga: " + tiempo + " segundos.");
                }
            }


            System.out.print("Ingrese el tamano del archivo en MB: ");
            System.out.println("Ingrese -1 si desea terminar");
            tamano = scanner.nextDouble();
        }
    }


    public static double calcularTiempo(double tamano, double velocidad) {
        double tiempo = tamano / velocidad;
        return tiempo;
    }
}
