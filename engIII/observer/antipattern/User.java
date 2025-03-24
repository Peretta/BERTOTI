package observer.antipattern;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void receiveNews(String news) {
        System.out.println(name + " recebeu a notícia: " + news);
    }
}
