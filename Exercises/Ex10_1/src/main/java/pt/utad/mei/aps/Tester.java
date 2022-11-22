package pt.utad.mei.aps;

public class Tester extends Collaborator {
    public Tester(Task task) {
        super(task);
    }

    @Override
    public void produce() {
        System.out.println("Tester is working...");
        this.task.doTask();
    }
}
