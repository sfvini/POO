package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void soma(){
        Calculadora a = new Calculadora();

        assertEquals(2, a.soma(1,1), "Positivos");
        assertEquals(0, a.soma(1,-1), "Nulo");
        assertEquals(0, a.soma(-1,1), "Nulo");
        assertEquals(-2, a.soma(-1,-1), "Negativos");
        assertEquals(0, a.soma(0,0), "Nulo");
        assertEquals(2, a.soma(0,2), "Positivos");
    }

    @Test
    public void tipoTiangulo(){
        Calculadora a = new Calculadora();
        assertEquals("equilátero", a.tipoTiangulo(3, 3, 3));
        assertEquals("escaleno", a.tipoTiangulo(2, 3, 4));

        assertEquals("isósceles", a.tipoTiangulo(3, 3, 5));
        assertEquals("isósceles", a.tipoTiangulo(3, 5, 3));
        assertEquals("isósceles", a.tipoTiangulo(5, 3, 3));

        assertEquals("inválido", a.tipoTiangulo(-7, 3, 3));
        assertEquals("inválido", a.tipoTiangulo(3, -7, 3));
        assertEquals("inválido", a.tipoTiangulo(3, 3, -7));

        assertEquals("inválido", a.tipoTiangulo(0, 3, 3));
        assertEquals("inválido", a.tipoTiangulo(3, 0, 3));
        assertEquals("inválido", a.tipoTiangulo(3, 3, 0));

        assertEquals("inválido", a.tipoTiangulo(80, 3, 3));
        assertEquals("inválido", a.tipoTiangulo(3, 80, 3));
        assertEquals("inválido", a.tipoTiangulo(3, 3, 80));
    }
}
