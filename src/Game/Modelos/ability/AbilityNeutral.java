package Game.Modelos.ability;

import Game.Modelos.Interface.Ability;
import Game.Modelos.AbstracClass.Pokemon;

public class AbilityNeutral implements Ability {
    Pokemon pokemon;

    @Override
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
