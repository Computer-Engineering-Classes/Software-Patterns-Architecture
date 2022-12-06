package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        var connections = new DbConnectionPool(4);

        connections.listConnections();

        var c1 = connections.get();
        c1.query("SELECT * FROM Students");

        var c2 = connections.get();
        c2.query("SELECT Name, S.Id, SUM(Grade) " +
                "FROM Student S, Grades G " +
                "WHERE S.Id = G.StudentId " +
                "GROUP BY Name, S.Id");

        var c3 = connections.get();
        var c4 = connections.get();

        // connections.get();
        connections.release(c3);
        connections.release(c4);
        connections.listConnections();
    }
}