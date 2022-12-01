package pt.utad.mei.aps;

public class Employee {
    private final int number;
    private final String name;
    private final String username;
    private final String password;
    private final String address;

    public Employee(int number, String name, String username, String password, String address) {
        this.number = number;
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public void details() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Address: " + address);
    }
}
