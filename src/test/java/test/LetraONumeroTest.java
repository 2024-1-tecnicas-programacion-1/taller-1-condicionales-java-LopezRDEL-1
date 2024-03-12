package test;

import ejercicios.LetraONumero;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class LetraONumeroTest {
    @Test
    public void testEsNumero() {
        String valorEsperado = "Es número";
        String valorActual = LetraONumero.evaluar('c');
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testEsLetra() {
        String valorEsperado = "Es letra";
        String valorActual = LetraONumero.evaluar('A');
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testCaracterEspecial() {
        String valorEsperado = "Es caracter especial";
        String valorActual = LetraONumero.evaluar('?');
        assertEquals(valorEsperado, valorActual);
    }
    
}
