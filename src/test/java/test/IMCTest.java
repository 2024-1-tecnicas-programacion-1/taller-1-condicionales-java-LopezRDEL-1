package test;

import ejercicios.IMC;
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
public class IMCTest {
    @Test
    public void testBajo() {
        String valorEsperado = "bajo";
        String valorActual = IMC.evaluar(50, 1.8,   20);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testNormal() {
        String valorEsperado = "normal";
        String valorActual = IMC.evaluar(70, 1.75, 30);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testSobrepeso() {
        String valorEsperado = "sobrepeso";
        String valorActual = IMC.evaluar(80, 1.7, 45);
        assertEquals(valorEsperado, valorActual);
    }
}
