import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int unidades = 100;

        int recepcionesExitosas = 0;
        int retirosExitosos = 0;
        int operacionesRechazadas = 0;

        int totalUnidadesRecibidas = 0;
        int totalUnidadesRetiradas = 0;

        int opc = 0;

        do {
            System.out.println("\n--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Recibir");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar");
            System.out.println("4. Finalizar");
            System.out.print("Seleccione una opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    int uniRec;
                    do {
                        System.out.print("Cuántas unidades se recibieron: ");
                        uniRec = teclado.nextInt();
                        if (uniRec <= 0) {
                            System.out.println("La cantidad debe ser mayor a 0.");
                        }
                    } while (uniRec <= 0);

                    if (unidades + uniRec > 250) {
                        System.out.println("Capacidad excedida");
                        operacionesRechazadas++;
                    } else {
                        unidades += uniRec;
                        totalUnidadesRecibidas += uniRec;
                        recepcionesExitosas++;
                        System.out.println("Recepción exitosa.");

                        if (unidades < 30) {
                            System.out.println("Inventario bajo");
                        }
                    }
                    break;

                case 2:
                    int retiro;
                    do {
                        System.out.print("Cuántas unidades desea retirar: ");
                        retiro = teclado.nextInt();
                        if (retiro <= 0) {
                            System.out.println("La cantidad debe ser mayor a 0.");
                        }
                    } while (retiro <= 0);

                    if (retiro > unidades) {
                        System.out.println("Existencias insuficientes");
                        operacionesRechazadas++;
                    } else {
                        unidades -= retiro;
                        totalUnidadesRetiradas += retiro;
                        retirosExitosos++;
                        System.out.println("Retiro exitoso.");

                        if (unidades < 30) {
                            System.out.println("Inventario bajo");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Existencias actuales: " + unidades);
                    break;

                case 4:
                    System.out.println("\n=== REPORTE FINAL ===");
                    System.out.println("Existencias finales: " + unidades);
                    System.out.println("Total de unidades recibidas: " + totalUnidadesRecibidas);
                    System.out.println("Total de unidades retiradas: " + totalUnidadesRetiradas);
                    System.out.println("Recepciones exitosas: " + recepcionesExitosas);
                    System.out.println("Retiros exitosos: " + retirosExitosos);
                    System.out.println("Operaciones rechazadas: " + operacionesRechazadas);
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

        } while (opc != 4);
    }
}
