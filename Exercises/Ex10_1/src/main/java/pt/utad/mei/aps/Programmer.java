package pt.utad.mei.aps;

public class Programmer extends Collaborator {
    public Programmer(Task task) {
        super(task);
    }

    @Override
    public void produce() {
        System.out.println("Programmer is working...");
        this.task.doTask();
    }
}
