package refactoring.guru;

import java.io.*;

public class FileDataSource implements DataSource {
    private final String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream out = new FileOutputStream(file)) {
            out.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            if (reader.read(buffer) != -1)
                return new String(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
