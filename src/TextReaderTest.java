package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextReaderTest {

    @Test
    void testMultipleLines() {
        // Simulerar inmatning av flera rader, följt av "stopp"

        TextCounter counter = new TextCounter();
        counter.addLine("hej");
        counter.addLine("Detta är en testmening");
        counter.addLine("En rad till.");

        assertEquals(3, counter.getLineCount(), "Antalet rader ska vara 3");
        assertEquals(37, counter.getCharCount(), "Antalet tecken ska vara 37");
    }

    @Test
    void testSingleLine() {
        // Simulerar inmatning av en enda rad följt av "stopp"
        TextCounter counter = new TextCounter();
        counter.addLine("Endast en rad..");

        assertEquals(1, counter.getLineCount(), "Antalet rader ska vara 1");
        assertEquals(15, counter.getCharCount(), "Antalet tecken ska vara 15");
    }

    @Test
    void testDirectStop() {
        // Simulerar att användaren skriver "stopp" direkt utan annan inmatning
        TextCounter counter = new TextCounter();

        assertEquals(0, counter.getLineCount(), "Antalet rader ska vara 0");
        assertEquals(0, counter.getCharCount(), "Antalet tecken ska vara 0");
    }
}
