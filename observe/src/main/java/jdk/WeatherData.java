package jdk;

import java.util.Observable;

/**
 * 被观察者，天气数据
 */
public class WeatherData extends Observable {
    //温度
    private float temperature;
    //湿度
    private float humidity;
    //气压
    private float pressure;

    public WeatherData(){}

    //数据发布
    public void publishData(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //用来标记已经改变的事实，超类的方法
        setChanged();
        //通知所有的观察者
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public float getPressure() {
        return pressure;
    }
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
