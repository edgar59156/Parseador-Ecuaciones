import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EcuacionPrimerGradoIntegrationTest {
    EcuacionPrimerGrado ecuacion = new EcuacionPrimerGrado();

    @Test
    public void solucionaEcuacionConMenos() {

        Double result = ecuacion.obtenerResultado("2x - 1 = 0");

        Double valueExpected = 0.5;

        assertEquals(valueExpected, result);
    }
}