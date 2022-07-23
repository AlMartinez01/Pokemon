package Game.Modelos.AbstracClass;

import Game.Modelos.AbstracClass.TypePokemon;
import Game.Modelos.Interface.EffectedStates;

public abstract class Pokemon {

    String name;
    int hpMax;
    int hpCurrent;
    int attack;
    int attackSpecial;
    int defense;
    int defenseSpecial;
    int speed;

    TypePokemon typesPokemon;
    EffectedStates states;
}
