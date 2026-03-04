import java.util.Scanner;

public class SistemaPuerto {
    private Contenedor[][] matrizPuerto = new Contenedor[10][10];
    private String[] buques = new String[10];
    private int buquesContador = 0;

    // Registro Buque
    public void registrarBuque(String nombre) {
        if (buquesContador < 10) {
            buques[buquesContador++] = nombre;
            System.out.println("Buque '" + nombre + "' registrado en muelle.");
        } else {
            System.out.println("Error: Muelle de buques lleno.");
        }
    }

    // Registr Contenedor con regla de apilado (de abajo hacia arriba)
    public void registrarContenedor(int columna, double peso, String origen) {
        if (columna < 0 || columna >= 10) {
            System.out.println("Columna inválida.");
            return;
        }

        // Buscar la primera fila vacía de abajo (fila 9) hacia arriba (fila 0)
        for (int fila = 9; fila >= 0; fila--) {
            if (matrizPuerto[fila][columna] == null) {
                matrizPuerto[fila][columna] = new Contenedor(peso, origen);
                System.out.println("Contenedor ubicado en Fila " + fila + ", Columna " + columna);
                return;
            }
        }
        System.out.println("Error: La columna " + columna + " está llena.");
    }

    public void mostrarMapa() {
        System.out.println("\n--- Mapa de Contenedores (0=Vacío, X=Ocupado) ---");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizPuerto[i][j] == null ? "[ ] " : "[X] ");
            }
            System.out.println();
        }
    }

    public double calcularPesoTotal() {
        double total = 0;
        for (Contenedor[] fila : matrizPuerto) {
            for (Contenedor c : fila) {
                if (c != null) total += c.getPeso();
            }
        }
        return total;
    }

    public void listarPorOrigen() {
        System.out.println("\n--- Listado por Origen ---");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizPuerto[i][j] != null) {
                    System.out.println("Pos["+i+"]["+j+"] - Origen: " + matrizPuerto[i][j].getOrigen());
                }
            }
        }
    }
}