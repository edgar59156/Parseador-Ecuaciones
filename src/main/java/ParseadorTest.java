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


}
