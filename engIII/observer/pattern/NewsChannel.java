package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel {
    private List<Observer> observers = new ArrayList<>();

    // Adicionar um novo observador
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    // Remover um observador
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    // Notificar todos os observadores
    public void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}
