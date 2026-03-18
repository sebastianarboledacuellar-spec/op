import java.util.Random;

public class GalacticExpress {

    public static void main(String[] args) {

        Random random = new Random();

        // PASO 1: Arreglo con 12 valores aleatorios entre 50 y 150
        int[] energiaContenedores = new int[12];

        for (int i = 0; i < energiaContenedores.length; i++) {
            energiaContenedores[i] = random.nextInt(101) + 50;
        }

        // Imprimir arreglo original
        System.out.println("Energia de contenedores:");

        for (int energia : energiaContenedores) {
            System.out.print(energia + " ");
        }

        System.out.println();

        // Filtrar múltiplos de 10
        int[] filtrados = new int[12];
        int contador = 0;

        for (int energia : energiaContenedores) {

            if (energia % 10 == 0) {
                filtrados[contador] = energia;
                contador++;
            }

        }

        // Imprimir filtrados
        System.out.println("\nEnergias multiplos de 10:");

        for (int i = 0; i < contador; i++) {
            System.out.print(filtrados[i] + " ");
        }

        System.out.println();

        // PASO 2: Matriz 3x3
        int[][] mapaCarga = new int[3][3];

        int indice = 0;

        for (int fila = 0; fila < 3; fila++) {

            for (int col = 0; col < 3; col++) {

                if (indice < contador) {
                    mapaCarga[fila][col] = filtrados[indice];
                    indice++;
                } else {
                    mapaCarga[fila][col] = -1;
                }

            }

        }

        // Imprimir matriz
        System.out.println("\nMapa de carga:");

        for (int fila = 0; fila < 3; fila++) {

            for (int col = 0; col < 3; col++) {

                System.out.print(mapaCarga[fila][col] + "\t");

            }

            System.out.println();
        }

        // PASO 3: Manifiesto de vuelo
        Suministro[] manifiesto = new Suministro[9];

        int pos = 0;

        for (int fila = 0; fila < 3; fila++) {

            for (int col = 0; col < 3; col++) {

                int energia = mapaCarga[fila][col];

                if (energia != -1) {

                    String id = "C-" + fila + "-" + col;

                    String prioridad;

                    if (energia > 100) {
                        prioridad = "ALTA";
                    } else {
                        prioridad = "ESTÁNDAR";
                    }

                    manifiesto[pos] = new Suministro(id, energia, prioridad);

                } else {

                    manifiesto[pos] = null;

                }

                pos++;

            }

        }

        // Imprimir manifiesto
        System.out.println("\nManifiesto de vuelo:");

        for (int i = 0; i < manifiesto.length; i++) {

            if (manifiesto[i] != null) {

                System.out.println(
                        manifiesto[i].id +
                        " | Energia: " +
                        manifiesto[i].nivelEnergia +
                        " | Prioridad: " +
                        manifiesto[i].prioridad
                );

            } else {

                System.out.println("null");

            }

        }

    }
}