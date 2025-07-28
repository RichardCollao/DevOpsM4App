package com.richard.paginaweb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testConstructorAndGetters() {
        Usuario usuario = new Usuario("Juan", 70.5);
        assertEquals("Juan", usuario.getNombre());
        assertEquals(70.5, usuario.getPeso());
    }

    @Test
    void testActualizarPeso() {
        Usuario usuario = new Usuario("Ana", 60.0);
        usuario.actualizarPeso(62.3);
        assertEquals(62.3, usuario.getPeso());
    }

    @Test
    void testMostrarInformacion() {
        Usuario usuario = new Usuario("Luis", 80.0);
        // Redirigir System.out para capturar la salida
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        usuario.mostrarInformacion();
        String expected = "Usuario: Luis, Peso Actual: 80.0 kg";
        assertTrue(outContent.toString().trim().contains(expected));
        // Restaurar System.out
        System.setOut(System.out);
    }
}
