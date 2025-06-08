package controller.strategy;

import model.Task;
import java.util.List;
import java.util.stream.Collectors;

public class ShowPendingStrategy implements TaskViewStrategy {
    public List<Task> filter(List<Task> tasks) {
        return tasks.stream().filter(t -> !t.isCompleted()).collect(Collectors.toList());
    }
}