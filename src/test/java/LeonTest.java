import logicaNegocio.Animal;
import logicaNegocio.Leon;
import logicaNegocio.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeonTest extends AnimalTest {

    @Override
    @Test
    void testEmitirSonido() {
        Animal leon = new Leon(TipoHabitat.TERRESTRE);
        assertEquals("Rugido", leon.emitirSonido());
    }

    @Override
    @Test
    void testObtenerDieta() {
        Animal leon = new Leon(TipoHabitat.TERRESTRE);
        assertEquals("Carnívoro", leon.obtenerDieta());
    }

    @Test
    void testLeonHabitat() {
        Animal leon = new Leon(TipoHabitat.TERRESTRE);
        assertEquals(TipoHabitat.TERRESTRE, leon.getHabitat());
    }
}
