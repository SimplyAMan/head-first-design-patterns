package observer;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float minTemperature;
    private float maxTemperature;

    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Min/Max: " + minTemperature + "/" + maxTemperature);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        if (temperature > maxTemperature || maxTemperature == 0) {
            maxTemperature = temperature;
        }
        if (temperature < minTemperature || minTemperature == 0) {
            minTemperature = temperature;
        }
        display();
    }
}
