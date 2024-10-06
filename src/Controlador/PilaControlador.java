package Controlador;

import Modelo.Pila;
import Vista.PilaVista;

public class PilaControlador {
    private Pila modelo;
    private PilaVista vista;

    public PilaControlador(Pila modelo, PilaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    int valor = vista.leerNumero();
                    if (valor >= 1 && valor <= 99) {
                        if (!modelo.estaLlena()) {
                            modelo.push(valor);
                            vista.mostrarMensaje("Valor insertado correctamente.");
                        } else {
                            vista.mostrarMensaje("Error: La pila está llena.");
                        }
                    } else {
                        vista.mostrarMensaje("Error: El número debe estar entre 01 y 99.");
                    }
                    break;
                case 2:
                    if (!modelo.estaVacia()) {
                        int eliminado = modelo.pop();
                        vista.mostrarValor("Elemento eliminado", eliminado);
                    } else {
                        vista.mostrarMensaje("Error: La pila está vacía.");
                    }
                    break;
                case 3:
                    modelo.mostrar();
                    break;
                case 4:
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public static void main(String[] args) {
        Pila modelo = new Pila();
        PilaVista vista = new PilaVista();
        PilaControlador controlador = new PilaControlador(modelo, vista);
        controlador.iniciar();
    }
}

