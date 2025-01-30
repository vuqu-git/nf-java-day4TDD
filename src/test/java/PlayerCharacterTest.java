import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {

    @BeforeEach
    public void setUp() {
        // Initialize the board
        PlayerCharacter.setX(0);
        PlayerCharacter.setY(0);
    }


    @Test
    void expect0_when_initial_invoking_getX() {
        // WHEN
        int actual = PlayerCharacter.getX();

        // THEN
        int expected = 0;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expect0_when_initial_invoking_getY() {
        // WHEN
        int actual = PlayerCharacter.getY();

        // THEN
        int expected = 0;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expect1_when_initial_invoking_move_withW() {
        // GIVEN
        String keystroke = "W";

        // WHEN
        PlayerCharacter.move(keystroke);

        int actualX = PlayerCharacter.getX();
        int actualY = PlayerCharacter.getY();

        // THEN
        int expectedX = 0;
        int expectedY = 1;

        Assertions.assertEquals(expectedX, actualX);
        Assertions.assertEquals(expectedY, actualY);
    }

    @Test
    void expect1_when_initial_invoking_move_withSAAD() {
        // GIVEN
        String[] keystrokes = {"S", "A", "A", "D"};


        // WHEN
        for(String keystroke : keystrokes) {
            PlayerCharacter.move(keystroke);
        }
        int actualX = PlayerCharacter.getX();
        int actualY = PlayerCharacter.getY();

        // THEN
        int expectedX = -1;
        int expectedY = -1;


        Assertions.assertEquals(expectedX, actualX);
        Assertions.assertEquals(expectedY, actualY);
    }

}
