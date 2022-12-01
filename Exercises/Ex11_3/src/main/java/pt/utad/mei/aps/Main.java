package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(1, "John Doe", "johnDoe", "123456", "123 Main Street");
        var extendedEmployee = new ExtendedEmployee(employee, "johndoe@gmail.com", "123456789");

        extendedEmployee.details();
    }
}