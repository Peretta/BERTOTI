package controller;

import controller.strategy.TaskViewStrategy;
import model.TaskModel;

public class TaskController {
    public final TaskModel model;
    private TaskViewStrategy strategy;

    public TaskController(TaskModel model, TaskViewStrategy defaultStrategy) {
        this.model = model;
        this.strategy = defaultStrategy;
    }

    public void addTask(String desc) {
        model.addTask(desc);
    }

    public void toggleTask(int index) {
        model.toggleTask(index);
    }

    public void setStrategy(TaskViewStrategy strategy) {
        this.strategy = strategy;
        model.notifyObservers();
    }

    public TaskViewStrategy getStrategy() {
        return strategy;
    }
}