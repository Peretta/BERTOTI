package observer.antipattern;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel {
    private List<User> users = new ArrayList<>();

    public void subscribe(User user) {
        users.add(user);
    }

    public void unsubscribe(User user) {
        users.remove(user);
    }

    public void notifyUsers(String news) {
        for (User user : users) {
            user.receiveNews(news);
        }
    }
}
