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

// Klass som läser in text och skriver ut resultatet
class TextReader {
    private TextCounter counter = new TextCounter();
    private Scanner scanner = new Scanner(System.in);

    public void readText() {
        System.out.println("Skriv in text rad för rad. Skriv 'stopp' för att avsluta.");

        while (true) {
            String line = scanner.nextLine();
            if (line.trim().equalsIgnoreCase("stopp")) {
                break;
            }
            counter.addLine(line);
        }
    }

    public void displayResults() {
        System.out.println("Antal rader: " + counter.getLineCount());
        System.out.println("Antal tecken: " + counter.getCharCount());
    }
}

public class Main {
    public static void main(String[] args) {
        TextReader reader = new TextReader();
        reader.readText();
        reader.displayResults();
    }
}
