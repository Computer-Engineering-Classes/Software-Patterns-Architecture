package pt.utad.mei.aps;

public class DbConnection {
    private static DbConnection instance;
    private final String connectionString;

    private DbConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DbConnection getInstance(String connectionString) {
        if (instance == null) {
            instance = new DbConnection(connectionString);
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from database...");
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }

    @Override
    public String toString() {
        return "DbConnection [connectionString=" + connectionString + "]";
    }
}
