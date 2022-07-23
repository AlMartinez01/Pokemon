package Game.Modelos.EfectStates;

import Game.Modelos.Interface.EffectedStates;
import Game.Modelos.AbstracClass.Pokemon;

import java.util.Objects;

public class StateNormal implements EffectedStates {
    Pokemon pokemon;

    public StateNormal() {}

    @Override
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StateNormal that = (StateNormal) o;

        return Objects.equals(pokemon, that.pokemon);
    }
}
