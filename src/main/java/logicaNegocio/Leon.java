package logicaNegocio;

public class Leon extends Animal{

    public Leon(TipoHabitat habitat) {
        super(habitat);
    }

    @Override
    public String emitirSonido() {
       return "Rugido";
    }

    @Override
    public String obtenerDieta() {
        return "Carnívoro";
    }
    
}
