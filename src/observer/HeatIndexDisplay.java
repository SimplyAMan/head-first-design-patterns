package observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    private double heatIndex;
    private float temperature;
    private float humidity;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index is: " + heatIndex);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        heatIndex = 16.923 + 1.85212 * 10 - 1 * temperature + 5.37941 * humidity - 1.00254 * 10 - 1 *
                temperature * humidity + 9.41695 * 10 - 3 * Math.pow(temperature, 2) +
                7.28898 * 10 - 3 * Math.pow(humidity, 2) + 3.45372 *
                10 - 4 * Math.pow(temperature, 2) * humidity - 8.14971 * 10 - 4 * temperature * Math.pow(humidity, 2) +
                1.02102 * 10 - 5 * Math.pow(temperature, 2) *
                Math.pow(humidity, 2) - 3.8646 * 10 - 5 * Math.pow(temperature, 3) +
                2.91583 * 10 - 5 * Math.pow(humidity, 3) + 1.42721 * 10 - 6
                * Math.pow(temperature, 3) * humidity + 1.97483 * 10 - 7 * temperature * Math.pow(humidity, 3) -
                2.18429 * 10 - 8 * Math.pow(temperature, 3) * Math.pow(humidity, 2)
                + 8.43296 * 10 - 10 * Math.pow(temperature, 2) * Math.pow(humidity, 3) - 4.81975 * 10 - 11 *
                Math.pow(temperature, 3) * Math.pow(humidity, 3);
        display();
    }
}
