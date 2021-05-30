import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private static String readingFile(String location) throws IOException {
        FileReader file = new FileReader(location);
        BufferedReader reader = new BufferedReader(file);

        String lineText = null;
        String display = "";
        int lineNumber = 1;

        while ((lineText = reader.readLine()) != null) {
            display = display + "Line " + lineNumber + ": " + lineText + "\n";
            lineNumber++;
        }

        reader.close();
        file.close();
        return display;
    }

    public static void main(String[] args) {
        try {
            String data = readingFile("D:/Java & Python Programming/Java Advanced 3/data-covid19-clean.csv");
            System.out.println(data);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}