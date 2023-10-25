import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


    @Test
    void soma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(3, calculadora.soma(1, 2));
    }

    @Test
    void produto() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.produto(2, 1));
    }

    @Test
    void divisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.divisao(2, 2));
    }

    @Test
    void diferenca() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.diferenca(15, 10));
    }
}