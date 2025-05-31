public class View implements Observer {
    public View(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display(temperature, humidity, pressure);
    }

    public void display(float temp, float humidity, float pressure) {
        System.out.println("Exibição Atual:");
        System.out.println("Temperatura: " + temp + "°C");
        System.out.println("Umidade: " + humidity + "%");
        System.out.println("Pressão: " + pressure + " hPa");
        System.out.println("-----------------------------");
    }
}
