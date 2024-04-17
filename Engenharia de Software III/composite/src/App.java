import tasks.Project;
import tasks.SimpleTask;

public class App {
    public static void main(String[] args) {
        Project project1 = new Project("Projet 1");
        project1.addTask(new SimpleTask("Tarefa 1"));
        project1.addTask(new SimpleTask("Tarefa 2"));

        Project project2 = new Project("Projeto 2");
        project2.addTask(new SimpleTask("Tarefa 3"));

        Project superProject = new Project("Super Projeto");
        superProject.addTask(project1);
        superProject.addTask(project2);
        superProject.addTask(new SimpleTask("Tarefa 4"));

        superProject.execute();
    }
}
