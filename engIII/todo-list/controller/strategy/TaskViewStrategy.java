package controller.strategy;
import model.Task;
import java.util.List;

public interface TaskViewStrategy {
    List<Task> filter(List<Task> tasks);
}