package view;

import controller.TaskController;
import controller.strategy.ShowAllStrategy;
import controller.strategy.ShowCompletedStrategy;
import controller.strategy.ShowPendingStrategy;
import model.TaskModel;
import model.Task;
import observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TaskView extends JFrame implements Observer {
    private TaskController controller;
    private final JTextField input = new JTextField();
    private final JPanel taskListPanel = new JPanel();

    public TaskView() {
        super("Lista de Tarefas");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton addButton = new JButton("Adicionar");
        addButton.addActionListener(e -> {
            controller.addTask(input.getText());
            input.setText("");
        });

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(input, BorderLayout.CENTER);
        topPanel.add(addButton, BorderLayout.EAST);

        taskListPanel.setLayout(new BoxLayout(taskListPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(taskListPanel);

        JPanel filterPanel = new JPanel();
        JButton allBtn = new JButton("Todas");
        JButton pendBtn = new JButton("Pendentes");
        JButton compBtn = new JButton("Concluídas");

        allBtn.addActionListener(e -> controller.setStrategy(new ShowAllStrategy()));
        pendBtn.addActionListener(e -> controller.setStrategy(new ShowPendingStrategy()));
        compBtn.addActionListener(e -> controller.setStrategy(new ShowCompletedStrategy()));

        filterPanel.add(allBtn);
        filterPanel.add(pendBtn);
        filterPanel.add(compBtn);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(filterPanel, BorderLayout.SOUTH);
    }

    public void setController(TaskController controller) {
        this.controller = controller;
    }

    @Override
    public void update() {
        taskListPanel.removeAll();
        TaskModel model = controller.model;
        List<Task> filtered = controller.getStrategy().filter(model.getTasks());

        for (int i = 0; i < filtered.size(); i++) {
            Task t = filtered.get(i);
            JPanel taskPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JCheckBox checkBox = new JCheckBox(t.getDescription(), t.isCompleted());
            final int idx = i;
            checkBox.addActionListener(e -> controller.toggleTask(idx));
            taskPanel.add(checkBox);
            taskListPanel.add(taskPanel);
        }

        taskListPanel.revalidate();
        taskListPanel.repaint();
    }
}