
public class Contenedor {
    private double peso;
    private String origen;

    public Contenedor(double peso, String origen) {
        this.peso = peso;
        this.origen = origen;
    }

    public double getPeso() { return peso; }
    public String getOrigen() { return origen; }

    @Override
    public String toString() {
        return "[C:" + origen + "|" + peso + "kg]";
    }
}