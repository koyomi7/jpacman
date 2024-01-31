package nl.tudelft.jpacman.level;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;

public class PelletTest{

    @Test
    public void testPelletCreation() {
        // Arrange
        int points = 10;
        Sprite image = null;

        // Act
        Pellet pellet = new Pellet(points, image);

        // Assert
        assertNotNull(pellet);
        assertEquals(points, pellet.getValue());

    }
}
