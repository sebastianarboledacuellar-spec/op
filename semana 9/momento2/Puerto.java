import java.util.*;

public class Puerto {
    public static void main(String[] args) {
        // --- MÓDULO 1: Registro (Arreglo) ---
        Contenedor[] manifiesto = new Contenedor[3]; // [cite: 43]
        manifiesto[0] = new Contenedor("ABC-1", 10.0, 1);
        manifiesto[1] = new Contenedor("VIP-2", 5.5, 2); // Prioridad alta
        manifiesto[2] = new Contenedor("XYZ-3", 8.0, 1);

        double total = 0;
        for (Contenedor c : manifiesto) total += c.peso; // [cite: 15]
        System.out.println("Peso en camión: " + total + "t");

        // --- MÓDULO 2: Patio (Matriz) ---
        Contenedor[][] patio = new Contenedor[5][5]; // [cite: 44]
        patio[0][0] = manifiesto[0]; // Ubicación simple [cite: 20]
        System.out.println("Contenedor guardado en patio.");

        // --- MÓDULO 3: Inspección (Cola FIFO) ---
        Queue<Contenedor> inspeccion = new LinkedList<>(); // [cite: 45]
        inspeccion.add(manifiesto[1]); // Entra a rayos X 
        System.out.println("Revisando: " + inspeccion.poll().id); // Sale el primero [cite: 25]

        // --- MÓDULO 4: Buque (Pila LIFO) ---
        Stack<Contenedor> buque = new Stack<>(); // [cite: 46]
        
        // Reto del Bono: Estabilidad (Peso menor o igual al de abajo)
        Contenedor nuevo = manifiesto[2];
        if (buque.isEmpty() || nuevo.peso <= buque.peek().peso) { // 
            buque.push(nuevo);
            System.out.println("Cargado al buque: " + nuevo.id);
        }

        // Operación Crítica: Pila Auxiliar
        Stack<Contenedor> auxiliar = new Stack<>(); // [cite: 31]
        
    }
}