public class Controller implements controllerInterface {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    @Override
    public void setTemperature(float temp) {
        model.setMeasurements(temp, modelHumidity(), modelPressure());
    }

    @Override
    public void setHumidity(float humidity) {
        model.setMeasurements(modelTemperature(), humidity, modelPressure());
    }

    @Override
    public void setPressure(float pressure) {
        model.setMeasurements(modelTemperature(), modelHumidity(), pressure);
    }

    private float modelTemperature() {
        return (float) (Math.random() * 40);
    }

    private float modelHumidity() {
        return (float) (Math.random() * 100);
    }

    private float modelPressure() {
        return (float) (1000 + Math.random() * 50);
    }
}
