package Game.Modelos.ability;

import Game.Modelos.Interface.Ability;
import Game.Modelos.AbstracClass.Pokemon;

public class CoarseIgnite implements Ability {
    Pokemon pokemon;
    int potent = 1;

    public CoarseIgnite(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public int atkFuego(int a) {
        return Ability.super.atkFuego(potent*a);
    }

    @Override
    public int defFuego(int a) {
        return Ability.super.defFuego(a/2);
    }

}
