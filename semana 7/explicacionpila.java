import java.util.Stack;
public class explicacionpila {
    public static void main(String[] args) {
        
        Stack<String> objPila =  new Stack<>();

        objPila.push("Camilo");
        objPila.push("Daniela");
        objPila.push("Francisco");
        objPila.push("Andrea");
        objPila.push("Dario");

        System.out.println(objPila);

        System.out.println("pila vacia: " + objPila.isEmpty());

        System.out.println("eLEMENTO REMOVIDO: " + objPila.pop());
        System.out.println(objPila);

        System.out.println("POSICION DE CAMILO: " + objPila.search("Camilo"));
        System.out.println("POSICION DE DANIELA: " + objPila.search("Daniela"));
        System.out.println("POSICION DE FRANCISCO: " + objPila.search("Francisco"));
        System.out.println("POSICION DE ANDREA: " + objPila.search("Andrea"));
        System.out.println("POSICION DE DARIO: " + objPila.search("Dario"));


    }
}
    