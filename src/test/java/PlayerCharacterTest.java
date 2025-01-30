import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {

    @Test
    void expect0_when_invoking_getX() {
        // WHEN
        int actual = PlayerCharacter.getX();

        // THEN
        int expected = 0;


        Assertions.assertEquals(expected, actual);

    }
}
