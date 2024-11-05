import java.util.Scanner;

// Klass som räknar rader och tecken
class TextCounter {
    private int lineCount = 0;
    private int charCount = 0;

    public void addLine(String line) {
        lineCount++;
        charCount += line.length();
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }
}
