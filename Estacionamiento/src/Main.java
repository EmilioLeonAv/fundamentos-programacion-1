import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAutos = 0;
        double totalRecaudado = 0;
        int autosConDescuento = 0;

        System.out.print("Ingrese las horas estacionadas : ");
        System.out.println("Ingrese 0 si desea terminar");
        double horas = scanner.nextDouble();

        while (horas != 0) {

            if (horas < 0) {
                System.out.println("Las horas negativas no son validas.");
            } else {
                double costo = horas * 15;

                if (horas > 5) {
                    costo = costo - 10;
                    autosConDescuento = autosConDescuento + 1;
                }

                totalAutos = totalAutos + 1;
                totalRecaudado = totalRecaudado + costo;

                System.out.println("Monto a pagar: $" + costo);
            }

            System.out.print("Ingrese las horas estacionadas : ");
            System.out.println("Ingrese 0 si desea terminar");
            horas = scanner.nextDouble();
        }

        System.out.println("Total de automoviles atendidos: " + totalAutos);
        System.out.println("Total de dinero recaudado: $" + totalRecaudado);
        System.out.println("Cantidad de automoviles que recibieron descuento: " + autosConDescuento);

        if (totalAutos > 0) {
            double promedio = totalRecaudado / totalAutos;
            System.out.println("Promedio pagado por automovil: $" + promedio);
        } else {
            System.out.println("Promedio pagado por automovil: $0");
        }
    }
}