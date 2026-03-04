import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaPuerto sistema = new SistemaPuerto();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ LOGÍSTICA JH ---");
            System.out.println("1. Registro de Buques");
            System.out.println("2. Registro de Contenedores");
            System.out.println("3. Mostrar Peso Total");
            System.out.println("4. Listar por Origen");
            System.out.println("5. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del Buque: ");
                    sistema.registrarBuque(sc.nextLine());
                    break;
                case 2:
                    sistema.mostrarMapa();
                    System.out.print("Columna (0-9): ");
                    int col = sc.nextInt();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Origen: ");
                    String origen = sc.nextLine();
                    sistema.registrarContenedor(col, peso, origen);
                    break;
                case 3:
                    System.out.println("Peso total en puerto: " + sistema.calcularPesoTotal() + " kg");
                    break;
                case 4:
                    sistema.listarPorOrigen();
                    break;
                case 5:
                    System.out.println("Cerrando aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}