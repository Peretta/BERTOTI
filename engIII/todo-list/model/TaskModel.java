package model;

import observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class TaskModel {
    private final List<Task> tasks = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
        notifyObservers();
    }

    public void toggleTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).toggleCompleted();
            notifyObservers();
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }
}