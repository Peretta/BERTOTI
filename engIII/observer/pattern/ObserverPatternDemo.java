package observer.pattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsChannel channel = new NewsChannel();

        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.notifyObservers("Nova atualizacao disponível!");

        channel.unsubscribe(user2);
        channel.notifyObservers("Outro evento importante aconteceu!");
    }
}
