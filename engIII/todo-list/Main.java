import model.TaskModel;
import view.TaskView;
import controller.TaskController;
import controller.strategy.ShowAllStrategy;

public class Main {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, new ShowAllStrategy());
        view.setController(controller);
        model.addObserver(view);
        view.setVisible(true);
    }
}