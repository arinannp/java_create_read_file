import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CreateFile {
    private static File createEmptyFile(final String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();

        return file;
    }

    private static File createFileSpesificSize(final String filename, final long sizeInBytes) throws IOException {
        File file = createEmptyFile(filename);

        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.setLength(sizeInBytes);
        raf.close();

        return file;
    }

    public static void main(String[] args) {
        try {
            createFileSpesificSize("dummy.txt", 11_000_000_000L);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}