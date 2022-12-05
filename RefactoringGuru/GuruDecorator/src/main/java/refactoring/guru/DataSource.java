package refactoring.guru;

public interface DataSource {
    void writeData(String data);

    String readData();
}
