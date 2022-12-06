package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        String connectionString = "jdbc:sqlserver://localhost:1433;databaseName=master";
        DbConnection dbConnection = DbConnection.getInstance(connectionString);
        dbConnection.connect();
        dbConnection.executeQuery("SELECT * FROM sys.databases");
        dbConnection.disconnect();
    }
}