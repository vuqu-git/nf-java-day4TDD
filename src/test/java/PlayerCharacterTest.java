import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;

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
    void yield01_when_initial_invoking_move_withW() {
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

    @ParameterizedTest(name = "Case {index}: keystroke={0} => x={1}, y={2}")
    @CsvSource(
            delimiter = ':',
            value = {
                    "W:0:1",
                    "D:1:0",
                    "A:-1:0",
                    "S:0:-1"
            }
    )
    void paramTest_with_allKeystrokes(String keystroke, int expectedX, int expectedY) {
        // GIVEN

        // WHEN
        PlayerCharacter.move(keystroke);
        int actualX = PlayerCharacter.getX();
        int actualY = PlayerCharacter.getY();

        // THEN

        Assertions.assertEquals(expectedX, actualX);
        Assertions.assertEquals(expectedY, actualY);
    }



    @Test
    void yieldm1m1_when_initial_invoking_move_withSAAD() {
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

    @Test
    void yieldm1m1_when_initial_invoking_moveALot_withSAAD() {
        // GIVEN
        String[] keystrokes = {"S", "A", "A", "D"};

        // WHEN
        PlayerCharacter.moveALot(keystrokes);

        int actualX = PlayerCharacter.getX();
        int actualY = PlayerCharacter.getY();

        // THEN
        int expectedX = -1;
        int expectedY = -1;

        Assertions.assertEquals(expectedX, actualX);
        Assertions.assertEquals(expectedY, actualY);
    }


    @ParameterizedTest(name = "Case {index}: keystrokes={0} => x={1}, y={2}")
    @CsvSource(
            delimiter = ':',
            value = {
                    "W,W:0:2",
                    "D,W,W,A,A:-1:2",
                    "A,S,S,D,D:1:-2"
            }
    )
    void paramTest_with_KeystrokeSequences(String keystrokes, int expectedX, int expectedY) {
        // GIVEN

        // WHEN
        String[] keystrokesArray = keystrokes.split(",");
        PlayerCharacter.moveALot(keystrokesArray);
        int actualX = PlayerCharacter.getX();
        int actualY = PlayerCharacter.getY();

        // THEN

        Assertions.assertEquals(expectedX, actualX);
        Assertions.assertEquals(expectedY, actualY);
    }

}
