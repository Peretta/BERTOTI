public class ControllerTrial implements controllerInterface {
    private Model model;

    public ControllerTrial(Model model) {
        this.model = model;
    }

    @Override
    public void setTemperature(float temp) {
        model.setMeasurements(temp, 50, 1013);
    }

    @Override
    public void setHumidity(float humidity) {
        model.setMeasurements(25, humidity, 1013);
    }

    @Override
    public void setPressure(float pressure) {
        model.setMeasurements(25, 50, pressure);
    }
}
