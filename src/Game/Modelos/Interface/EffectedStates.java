package Game.Modelos.Interface;

import Game.Modelos.AbstracClass.Pokemon;

public interface EffectedStates {
    default Boolean beforeTurn() {return true;}
    default void afterTurn() {}
    void setPokemon(Pokemon pokemon);
    default void restorationAbility(){}
}
