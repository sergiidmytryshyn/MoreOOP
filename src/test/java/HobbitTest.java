import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lotr.Hobbit;

public class HobbitTest {
    private Hobbit character;

    @BeforeEach
    public void init() {
        character = new Hobbit();
    }

    @Test
    public void testToString() {
        assertEquals("Hobbit{hp=3, power=0}", character.toString());
    }

    @Test
    public void testIsClass() {
        assertTrue(character instanceof lotr.Character);
    }

    @Test
    public void testSetHp() {
        character.setHp(-100);
        assertEquals(0, character.getHp());
    }
}