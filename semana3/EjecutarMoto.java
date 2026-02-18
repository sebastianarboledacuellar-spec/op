public class EjecutarMoto {
    public static void main(String[] args) {
        Moto[] m = new Moto[8];
        m[0] = new Moto(2024, "yamaha", "negro", 125, 100000);
        m[1] = new Moto(2024, "kawasaki", "azul", 900, 50000);
        m[2] = new Moto(2024, "hero", "blanco", 125, 70000);
        m[3] = new Moto(2024, "honda", "rojo", 150, 200000);
        m[4] = new Moto(2024, "ducati", "gris", 1000, 100000);
        m[5] = new Moto(2024, "ktm", "verde", 350, 100000);
        m[6] = new Moto(2024, "susuki", "negro", 250, 700000);
        m[7] = new Moto(2024, "bmw", "azul", 1000, 90000);

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
}