import logicaNegocio.Animal;
import logicaNegocio.Domestico;
import logicaNegocio.Perro;
import logicaNegocio.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PerroTest extends AnimalTest {

    @Override
    @Test
    void testEmitirSonido() {
        Animal perro = new Perro(TipoHabitat.TERRESTRE);
        assertEquals("Ladrido", perro.emitirSonido());
    }

    @Override
    @Test
    void testObtenerDieta() {
        Animal perro = new Perro(TipoHabitat.TERRESTRE);
        assertEquals("Omnívoro", perro.obtenerDieta());
    }

    @Test
    void testPerroHabitat() {
        Animal perro = new Perro(TipoHabitat.TERRESTRE);
        assertEquals(TipoHabitat.TERRESTRE, perro.getHabitat());
    }

    @Test
    void testPerroInteractuarConHumano() {
        Domestico perro = new Perro(TipoHabitat.TERRESTRE);
        assertEquals("El perro mueve la cola y ladra de felicidad", perro.interactuarConHumano());
    }
}
