package Game.Modelos.AbstracClass;

import Game.Modelos.Interface.Attacks;
import Game.Modelos.Interface.Defendible;

public abstract class TypePokemon implements Attacks, Defendible {
    TypePokemon typePokemon;

    public TypePokemon() {this.typePokemon = null;}

    public TypePokemon getTypePokemon() {return typePokemon;}

    public void setTypePokemon(TypePokemon typePokemon) {this.typePokemon = typePokemon;}

    @Override
    public int defNormal(int a) {
        if (typePokemon == null) return Defendible.super.defNormal(a);
        return typePokemon.defNormal(a);
    }

    @Override
    public int defFuego(int a) {
        if (typePokemon == null) return Defendible.super.defFuego(a);
        return typePokemon.defFuego(a);
    }

    @Override
    public int defAgua(int a) {
        if (typePokemon == null) return Defendible.super.defAgua(a);
        return typePokemon.defAgua(a);
    }

    @Override
    public int defPlanta(int a) {
        if (typePokemon == null) return Defendible.super.defPlanta(a);
        return typePokemon.defPlanta(a);
    }

    @Override
    public int defEspNormal(int a) {
        if (typePokemon == null) return Defendible.super.defEspNormal(a);
        return typePokemon.defEspNormal(a);
    }

    @Override
    public int defEspFuego(int a) {
        if (typePokemon == null) return Defendible.super.defEspFuego(a);
        return typePokemon.defEspFuego(a);
    }

    @Override
    public int defEspAgua(int a) {
        if (typePokemon == null) return Defendible.super.defEspAgua(a);
        return typePokemon.defEspAgua(a);
    }

    @Override
    public int defEspPlanta(int a) {
        if (typePokemon == null) return Defendible.super.defEspPlanta(a);
        return typePokemon.defEspPlanta(a);
    }

    @Override
    public int atkNormal(int a) {
        if (typePokemon == null) return Attacks.super.atkNormal(a);
        return typePokemon.atkNormal(a);
    }

    @Override
    public int atkFuego(int a) {
        if (typePokemon == null)return Attacks.super.atkFuego(a);
        return typePokemon.atkFuego(a);
    }

    @Override
    public int atkAgua(int a) {
        if (typePokemon == null)return Attacks.super.atkAgua(a);
        return typePokemon.atkAgua(a);
    }

    @Override
    public int atkPlanta(int a) {
        if (typePokemon == null)return Attacks.super.atkPlanta(a);
        return typePokemon.atkPlanta(a);
    }

    @Override
    public int atkEspNormal(int a) {
        if (typePokemon == null)return Attacks.super.atkEspNormal(a);
        return typePokemon.atkEspNormal(a);
    }

    @Override
    public int atkEspFuego(int a) {
        if (typePokemon == null)return Attacks.super.atkEspFuego(a);
        return typePokemon.atkEspFuego(a);
    }

    @Override
    public int atkEspAgua(int a) {
        if (typePokemon == null)return Attacks.super.atkEspAgua(a);
        return typePokemon.atkEspAgua(a);
    }

    @Override
    public int atkEspPlanta(int a) {
        if (typePokemon == null)return Attacks.super.atkEspPlanta(a);
        return typePokemon.atkEspPlanta(a);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == this.getClass();
    }

    @Override
    public String toString() {
        if (typePokemon== null)return " "+this.getClass().getSimpleName();
        return " "+this.getClass().getSimpleName()+" y"+typePokemon.toString();
    }
}
