package Game.Modelos.Interface;

public interface Defendible {

    default int defNormal(int a){return a;}
    default int defFuego(int a){return a;}
    default int defAgua(int a){return a;}
    default int defPlanta(int a){return a;}
    default int defEspNormal(int a){return a;}
    default int defEspFuego(int a){return a;}
    default int defEspAgua(int a){return a;}
    default int defEspPlanta(int a){return a;}

}
