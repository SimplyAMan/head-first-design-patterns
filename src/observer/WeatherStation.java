package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasuaments(10, 20, 30);
        weatherData.setMeasuaments(11, 23, 35);
        weatherData.setMeasuaments(12, 25, 40);
    }
}
