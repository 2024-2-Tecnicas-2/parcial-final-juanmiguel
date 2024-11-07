package logicaNegocio;

public abstract class Animal {

    public TipoHabitat habitat;

    public Animal() {
    }

    public Animal(TipoHabitat habitat) {
        this.habitat = habitat;
    }




    public abstract String emitirSonido();

    public abstract String obtenerDieta();

    public TipoHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }

}
