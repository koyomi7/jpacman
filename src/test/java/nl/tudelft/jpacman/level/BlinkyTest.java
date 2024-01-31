package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.Blinky;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Map;
import java.util.HashMap;


import static org.junit.jupiter.api.Assertions.assertNotNull;

class BlinkyTest {

    @Test
    void testBlinky() {
        Map<Direction, Sprite> spriteMap = new HashMap<>();
        Ghost ghost = new Blinky(spriteMap);

        assertNotNull(ghost);
    }

    // Add more test cases as needed for other methods and behaviors
}

