

import com.example.tasks.*;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task(1, "Design Database", "Pending");
        Task task2 = new Task(2, "Develop API", "In Progress");
        Task task3 = new Task(3, "Test Application", "Pending");

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        System.out.println("All Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task searchedTask = manager.searchTask(2);
        System.out.println(searchedTask);

        System.out.println("\nDeleting Task with ID 2:");
        manager.deleteTask(2);
        manager.traverseTasks();
    }
}
