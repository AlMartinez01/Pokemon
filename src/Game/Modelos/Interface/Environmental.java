package Game.Modelos.Interface;

public interface Environmental {
    default int effectInAttackElem(int a){return a;}
    default int effectInDefenseElem(int a){return a;}
    default boolean precisionElem(){return false;}
}
