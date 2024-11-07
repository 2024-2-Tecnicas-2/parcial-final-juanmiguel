import logicaNegocio.Animal;
import logicaNegocio.Delfin;
import logicaNegocio.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DelfinTest extends AnimalTest {

    @Override
    @Test
    void testEmitirSonido() {
        Animal delfin = new Delfin(TipoHabitat.ACUATICO);
        assertEquals("Chirrido", delfin.emitirSonido());
    }

    @Override
    @Test
    void testObtenerDieta() {
        Animal delfin = new Delfin(TipoHabitat.ACUATICO);
        assertEquals("Pescado", delfin.obtenerDieta());
    }

    @Test
    void testDelfinHabitat() {
        Animal delfin = new Delfin(TipoHabitat.ACUATICO);
        assertEquals(TipoHabitat.ACUATICO, delfin.getHabitat());
    }
}
