package PruebasUnitarias;

import Modelo.Pila;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilaTest {
    private Pila pila;

    @BeforeEach
    public void setUp() {
        pila = new Pila();  // Crear una instancia de Pila antes de cada prueba
    }

    @Test
    public void testPush() {
        pila.push(10);
        assertFalse(pila.estaVacia(), "La pila no debería estar vacía después de insertar un elemento.");
    }

    @Test
    public void testPop() {
        pila.push(10);
        int valorEliminado = pila.pop();
        assertEquals(10, valorEliminado, "El valor eliminado debería ser 10.");
        assertTrue(pila.estaVacia(), "La pila debería estar vacía después de eliminar el único elemento.");
    }

    @Test
    public void testPilaLlena() {
        for (int i = 1; i <= 6; i++) {
            pila.push(i * 10);  // Insertar hasta llenar la pila
        }
        assertTrue(pila.estaLlena(), "La pila debería estar llena después de 6 inserciones.");
        pila.push(70);  // Intentar insertar en una pila llena
        assertTrue(pila.estaLlena(), "La pila debería permanecer llena después de intentar insertar en ella.");
    }

    @Test
    public void testPopEnPilaVacia() {
        int valor = pila.pop();
        assertEquals(-1, valor, "El valor eliminado debería ser -1 cuando la pila está vacía.");
    }

    @Test
    public void testMostrar() {
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.mostrar();  // Aquí solo se imprime el estado de la pila
        assertEquals(40, pila.pop(), "El valor en la cima debería ser 40.");
        assertEquals(30, pila.pop(), "Después de eliminar, el valor en la cima debería ser 30.");
        assertEquals(20, pila.pop(), "El último valor en la pila debería ser 20.");
    }
}

