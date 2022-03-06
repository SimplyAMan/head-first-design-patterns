package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private WeatherData weatherData;

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(CurrentConditionsDisplay.class.getName() + " temperature: " + temperature + ", humidity: " + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
