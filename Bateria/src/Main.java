import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el porcentaje inicial de la bateria: ");
        int porcentaje = scanner.nextInt();


        while (porcentaje != -1) {


            if (porcentaje < 0 || porcentaje > 100) {
                System.out.println("El porcentaje debe estar entre 0 y 100.");
            } else {
                int minutos = calcularMinutos(porcentaje);
                System.out.println("Tiempo de carga necesario: " + minutos + " minutos.");
            }


            System.out.print("Ingrese el porcentaje inicial de la bateria: ");
            porcentaje = scanner.nextInt();
        }
    }


    public static int calcularMinutos(int porcentajeInicial) {
        int carga = porcentajeInicial;
        int minutos = 0;


        while (carga < 100) {
            carga = carga + 8;
            minutos = minutos + 1;
        }


        return minutos;
    }
}
