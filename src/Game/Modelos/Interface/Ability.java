package Game.Modelos.Interface;

import Game.Modelos.AbstracClass.Pokemon;

public interface Ability extends Attacks, Defendible {
    default int effectInAttack(int a){return a;}
    default int effectInDefense(int a){return a;}
    default void effectAfterDefense(){}
    default void effectAfterTurn(){}
    void setPokemon(Pokemon pokemon);
}
