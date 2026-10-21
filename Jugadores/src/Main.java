import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int puntosAcumulados = 0;
        int partidasMayores = 0;
        int partidasMenores = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese la puntuacion de la partida " + i + ": ");
            int puntos = scanner.nextInt();

            puntosAcumulados += puntos;

            if (puntos > 1000) {
                partidasMayores++;
            } else {
                partidasMenores++;
            }
        }

        double promedio = (double) puntosAcumulados / 7;

        System.out.println("Puntos acumulados: " + puntosAcumulados);
        System.out.println("Promedio de puntuacion: " + promedio);
        System.out.println("Partidas con mas de 1000 puntos: " + partidasMayores);
        System.out.println("Partidas con 1000 puntos o menos: " + partidasMenores);

    }
}