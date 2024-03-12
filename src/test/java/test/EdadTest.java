package test;

import ejercicios.Edad;
import ejercicios.SetDeTenis;
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
public class EdadTest {
    @Test
    public void test2000Enero1() {
        String valorEsperado = "Usted tiene 24 años";
        String valorActual = Edad.evaluar(1, 1, 2024);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test1990Julio15() {
        String valorEsperado = "Usted tiene 33 años";
        String valorActual = Edad.evaluar(15, 7, 1990);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2050Diciembre31() {
        String valorEsperado = "Usted tiene 29 años";
        String valorActual = Edad.evaluar(31, 12, 2050);
        assertEquals(valorEsperado, valorActual);
    }
    
}
