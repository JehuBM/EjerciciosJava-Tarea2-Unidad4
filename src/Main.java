
public class Main {
    public static void main(String[] args) {

        Cola cola = new Cola();

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        System.out.println("Cola:");
        cola.imprimir();

        System.out.println("Frente: " + cola.verFrente());
        System.out.println("Elemento eliminado: " + cola.desencolar());

        System.out.println("Cola después de eliminar:");
        cola.imprimir();

        System.out.println("Tamaño: " + cola.tamaño());
    }
}
