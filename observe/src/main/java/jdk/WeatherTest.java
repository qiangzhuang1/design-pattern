package jdk;

public class WeatherTest{
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.publishData(10.12f,20.56f,30.098f);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        currentConditionsDisplay.update(weatherData, currentConditionsDisplay);
    }
}
