import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner teclado= new Scanner(System.in);
        int puntos=100;
        int opcion=0;
        do {
            System.out.println("1.- Ganar 20 puntos");
            System.out.println("2.- Gastar 15 puntos");
            System.out.println("3.-Consultar puntos");
            System.out.println("4.-Salir");
            System.out.println("Elige una opcion");
            opcion= teclado.nextInt();


            switch (opcion) {
                case 1:
                    puntos+=20;
                    System.out.println("Ganaste 20 puntos");
                    break;
                case 2:
                    if (puntos>=15) {
                        puntos-=15;
                        System.out.println("Gastaste 15 puntos");
                    }else {
                        System.out.println("No tienes suficientes puntos para gastar");
                    }


                    break;
                case 3:
                    System.out.println("Puntos actuales "+puntos);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Elige una opcion valida");
                    break;


            }
        }while(opcion!=4);
        System.out.println("Terminaste con "+puntos+" puntos");
    }
}
