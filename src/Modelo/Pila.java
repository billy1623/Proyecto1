package Modelo;
public class Pila {
    private final int[] pila;
    private int cima;
    private static final int MAX = 6;

    public Pila() {
        pila = new int[MAX];
        cima = -1;
    }

    // Método para insertar un elemento en la pila
    public void push(int valor) {
        if (cima == MAX - 1) {
            System.out.println("Error: La pila está llena.");
        } else {
            cima++;
            pila[cima] = valor;
        }
    }

    // Método para eliminar el elemento en la cima de la pila
    public int pop() {
        if (cima == -1) {
            System.out.println("Error: La pila está vacía.");
            return -1;
        } else {
            int valor = pila[cima];
            cima--;
            return valor;
        }
    }

    // Método para mostrar el estado de la pila
    public void mostrar() {
        if (cima == -1) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Estado de la pila:");
            for (int i = 0; i <= cima; i++) {
                System.out.println("Índice " + i + " -> Valor: " + pila[i]);
            }
            System.out.println("CIMA: " + pila[cima]);
        }
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == MAX - 1;
    }
}
