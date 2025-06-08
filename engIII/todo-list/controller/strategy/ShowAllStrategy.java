package controller.strategy;

import model.Task;
import java.util.List;

public class ShowAllStrategy implements TaskViewStrategy {
    public List<Task> filter(List<Task> tasks) {
        return tasks;
    }
}