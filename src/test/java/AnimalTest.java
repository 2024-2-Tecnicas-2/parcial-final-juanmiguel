import logicaNegocio.Animal;
import logicaNegocio.Delfin;
import logicaNegocio.Leon;
import logicaNegocio.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public abstract class AnimalTest {

    @Test
    void testHabitatSetterAndGetter() {
        Animal leon = new Leon(TipoHabitat.TERRESTRE);
        assertEquals(TipoHabitat.TERRESTRE, leon.getHabitat());
        
        Animal delfin = new Delfin(TipoHabitat.ACUATICO);
        assertEquals(TipoHabitat.ACUATICO, delfin.getHabitat());
    }

    @Test
    abstract void testEmitirSonido();

    @Test
    abstract void testObtenerDieta();
}
