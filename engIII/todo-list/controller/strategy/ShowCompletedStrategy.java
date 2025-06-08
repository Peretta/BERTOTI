package controller.strategy;

import model.Task;
import java.util.List;
import java.util.stream.Collectors;

public class ShowCompletedStrategy implements TaskViewStrategy {
    public List<Task> filter(List<Task> tasks) {
        return tasks.stream().filter(Task::isCompleted).collect(Collectors.toList());
    }
}