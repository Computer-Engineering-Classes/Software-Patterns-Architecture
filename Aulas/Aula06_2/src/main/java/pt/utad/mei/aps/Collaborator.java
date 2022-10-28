package pt.utad.mei.aps;

public abstract class Collaborator {
    protected Task task;

    public Collaborator(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void receiveTask(Task task) {
        this.task = task;
    }
    public abstract void produce();
}
