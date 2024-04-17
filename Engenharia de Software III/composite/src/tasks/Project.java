package tasks;

import java.util.ArrayList;
import java.util.List;

public class Project implements Task {
    private String name;
    private List<Task> tasks = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void execute() {
        System.out.println("Executando projeto: " + name);
        for (Task task : tasks) {
            task.execute();
        }
    }
}