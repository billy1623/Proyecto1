package Vista;

import java.util.Scanner;

public class PilaVista {
    private final Scanner scanner;

    public PilaVista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\\nMenú:");
        System.out.println("1. Insertar");
        System.out.println("2. Eliminar");
        System.out.println("3. Mostrar");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");
        return scanner.nextInt();
    }

    public int leerNumero() {
        System.out.print("Introduce un número (01-99): ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarValor(String operacion, int valor) {
        System.out.println(operacion + " valor: " + valor);
    }
}
