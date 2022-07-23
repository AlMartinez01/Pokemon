package Game.Modelos.Interface;

public interface Attacks{
    default int atkNormal(int a){return a;}
    default int atkFuego(int a){return a;}
    default int atkAgua(int a){return a;}
    default int atkPlanta(int a){return a;}
    default int atkEspNormal(int a){return a;}
    default int atkEspFuego(int a){return a;}
    default int atkEspAgua(int a){return a;}
    default int atkEspPlanta(int a){return a;}
}
