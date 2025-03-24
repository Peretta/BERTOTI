package observer.antipattern;

public class AntiPatternDemo {
    public static void main(String[] args) {
        NewsChannel channel = new NewsChannel();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.notifyUsers("Nova atualização disponível!");

        channel.unsubscribe(user2);
        channel.notifyUsers("Outro evento importante aconteceu!");
    }
}
