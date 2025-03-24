package observer.pattern;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " recebeu a notícia: " + news);
    }
}
