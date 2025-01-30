import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {

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
        int actual = PlayerCharacter.getX();

        // THEN
        int expected = 0;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expect1_when_initial_invoking_move() {
        // GIVEN
        String keystroke = "W";

        // WHEN
        int actual = PlayerCharacter.move(keystroke);

        // THEN
        int expected = 1;


        Assertions.assertEquals(expected, actual);
    }

}
