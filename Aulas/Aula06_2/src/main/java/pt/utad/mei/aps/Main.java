package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        var task = new CSharpProgramming();
        var programmer = new Programmer(task);
        programmer.produce();

        var task2 = new AutomatedTesting();
        programmer.receiveTask(task2);
        programmer.produce();

        var task3 = new ManualTesting();
        var tester = new Tester(task3);
        tester.produce();

        var task4 = new JavaProgramming();
        tester.receiveTask(task4);
        tester.produce();
    }
}