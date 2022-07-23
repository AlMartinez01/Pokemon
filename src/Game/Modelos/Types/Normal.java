package Game.Modelos.Types;

import Game.Modelos.AbstracClass.TypePokemon;

public class Normal extends TypePokemon {
    public Normal() {super();}

    @Override
    public int defNormal(int a) {
        return super.defNormal(a/2);
    }
}
