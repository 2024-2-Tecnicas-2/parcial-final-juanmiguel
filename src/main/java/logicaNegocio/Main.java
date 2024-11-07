package logicaNegocio;

public class Main {

    public static void main(String[] args) {

        Perro p = new Perro(TipoHabitat.TERRESTRE);
        Delfin d = new Delfin(TipoHabitat.ACUATICO);
        Leon l = new Leon(TipoHabitat.TERRESTRE);

        System.out.println(p.emitirSonido());
        System.out.println(d.emitirSonido());
        System.out.println(l.emitirSonido());
        
        System.out.println(p.obtenerDieta());
        System.out.println(d.obtenerDieta());
        System.out.println(l.obtenerDieta());
        
        System.out.println(p.interactuarConHumano());
    }

}
