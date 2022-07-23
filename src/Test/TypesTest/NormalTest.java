package Test.TypesTest;

import Game.Modelos.AbstracClass.TypePokemon;
import Game.Modelos.Types.Normal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class NormalTest {
    Normal normal;

    @BeforeEach
    void setUp(){
        normal = new Normal();
    }

    @Test
    void toStringTest(){
        assertEquals(" Normal",normal.toString());
        normal.setTypePokemon(new Normal());
        assertEquals(" Normal y Normal",normal.toString());
    }

    @Test
    void Defense() {
        int a = new Random().nextInt(2,9);
        int i = a / 2;
        assertEquals(i,normal.defNormal(a));
    }
}