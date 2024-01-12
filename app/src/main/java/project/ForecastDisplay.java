package project;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // Register statisticsdisplay as an observer of the weatherdata subject
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Forecast:\n" + temperature + "F degrees temperature, " + humidity + "% humidity and "
                + pressure + "atm airpressure");
    }

}
