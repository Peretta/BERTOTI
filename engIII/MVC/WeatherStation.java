public class WeatherStation {
    public static void main(String[] args) {
        Model weatherData = new Model();

        Controller controller = new Controller(weatherData);

        controller.setTemperature(30.5f);
        controller.setHumidity(65.0f);
        controller.setPressure(1012.5f);

        // Testando outro controller (Strategy Pattern)
        ControllerTrial trial = new ControllerTrial(weatherData);
        trial.setTemperature(22.0f);
    }
}
