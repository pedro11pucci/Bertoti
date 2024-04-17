package tasks;

public class SimpleTask implements Task {
    private String name;

    public SimpleTask(String name) {
        this.name = name;
    }

    public void execute() {
        System.out.println("Executando tarefa simplse: " + name);
    }
}