package morseCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest
{

    @Test
    public void toMorseCode() {
        // given
        MorseCode one = new MorseCode("");
        // when
        String message = one.toMorseCode("Hello World");
        // then
        assertEquals("**** * *-** *-** --- \t*-- --- *-* *-** -** ", message);
    }

    @Test
    public void toMessage() {
        // given
        MorseCode one = new MorseCode("");
        // when
        String message = one.toMessage("**** * *-** *-** --- \t *-- --- *-* *-** -** ");
        // then
        assertEquals("HELLO WORLD", message);
    }
}