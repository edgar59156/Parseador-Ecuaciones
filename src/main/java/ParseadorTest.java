import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParseadorTest {

    private final Parseador parseador = new Parseador();
    @Test
    public void obtenerParte1Unidades() {

        String ecuacion1 = "2x - 1 = 0";

        int resultado = parseador.obtenerParte1(ecuacion1);

        assertEquals(2, resultado);
    }
    @Test
    public void obtenerOperadorSuma() {

        String ecuacion2 = "2x + 1 = 0";

        String operador = parseador.obtenerOperador(ecuacion2);

        assertEquals("+", operador);
    }

}
