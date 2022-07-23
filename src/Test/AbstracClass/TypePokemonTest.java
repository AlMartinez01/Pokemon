package Test.AbstracClass;

import Game.Modelos.AbstracClass.TypePokemon;
import Game.Modelos.Types.Normal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypePokemonTest {
    TypePokemon typeNormal;

    @BeforeEach
    void setUp(){
        typeNormal = new Normal();
    }

    @Test
    void Normal(){
        var expectNormal = new Normal();
        assertEquals(expectNormal,typeNormal);
    }

}
