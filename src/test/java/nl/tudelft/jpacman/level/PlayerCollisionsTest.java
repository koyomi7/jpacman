package nl.tudelft.jpacman.level;
import org.junit.jupiter.api.BeforeEach;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.Blinky;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import java.util.Map;
import java.util.HashMap;

public class PlayerCollisionsTest {

    @Mock
    private PointCalculator pointCalculator;

    private PlayerCollisions playerCollisions;
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private PlayerFactory factory = new PlayerFactory(SPRITE_STORE);
    private Player thePlayer = factory.createPacMan();
    private Map<Direction, Sprite> spriteMap = new HashMap<>();

    private class GhostCreating {
        Ghost createBlinky() {
            return new Blinky(spriteMap);
        }
    }

    @BeforeEach
    public void setUp() {
        playerCollisions = new PlayerCollisions(pointCalculator);
    }

    @Test
    public void testPlayerCollidingWithGhost() {
        GhostCreating ghostCreating = new GhostCreating(); // Create an instance
        Ghost blinky = ghostCreating.createBlinky();
        // Act
        playerCollisions.collide(thePlayer, blinky);

        // Assert
        verify(pointCalculator).collidedWithAGhost(thePlayer, blinky);
        verify(thePlayer).setAlive(false);
        verify(thePlayer).setKiller(blinky);
    }
}
