import java.util.ArrayList;
public class WeatherData implements Subject {
	private ArrayList<Observer> Observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		Observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		Observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = Observers.indexOf(o);
		if(i >= 0) {
			Observers.remove(i);
		}
	}

	public void notifyObservers() {
		for(int i = 0; i < Observers.size(); i++) {
			Observer observer = (Observer)Observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	
	}
	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
	
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}
	
	

}
