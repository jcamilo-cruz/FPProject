import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class sumaTest {

    @Test
    public void sumaPositivos() {
        System.out.println("Sumando numeros positivos...");
        suma s = new suma(2, 2);
        assertTrue(s.sumar() == 12);
    }

    @Test
    public void sumaNegativos() {
        System.out.println("Sumando numeros negativos...");
        suma s = new suma(-2, -3);
        assertTrue(s.sumar() == -5);
    }

    @Test
    public void sumaPositivoNegativo() {
        System.out.println("Sumando numeros negativos y positivos...");
        suma s = new suma(-4, 10);
        assertTrue(s.sumar() == 6);
    }
}

