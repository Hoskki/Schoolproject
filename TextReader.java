import java.util.Scanner;

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
