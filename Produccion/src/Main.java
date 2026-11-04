import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la tarifa por hora: ");
        System.out.println("Ingrese -1 si desea terminar");
        double tarifa = scanner.nextDouble();


        while (tarifa != -1) {


            if (tarifa <= 0) {
                System.out.println("La tarifa por hora debe ser mayor a cero.");
            } else {
                System.out.print("Ingrese la cantidad de horas: ");
                int horas = scanner.nextInt();


                if (horas <= 0) {
                    System.out.println("La cantidad de horas debe ser mayor a cero.");
                } else {
                    double total = calcularRenta(tarifa, horas);
                    mostrarComprobante(total);
                }
            }


            System.out.print("Ingrese la tarifa por hora: ");
            System.out.println("Ingrese -1 si desea terminar");
            tarifa = scanner.nextDouble();
        }
    }


    public static double calcularRenta(double tarifa, int horas) {
        double total = tarifa * horas;
        return total;
    }


    public static void mostrarComprobante(double total) {
        System.out.println("El total de la renta es: $" + total);
    }
}
