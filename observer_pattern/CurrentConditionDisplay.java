public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;	
	
	public CurrentConditionDisplay(Subject weatherData) {
			this.weatherData = weatherData;
			System.out.println(weatherData);
			weatherData.registerObserver(this);
		}

	public void display() {
		System.out.println("CurrentConditionDisplay System Temprature is changed:: temperature="+ this.temperature + " humidity="+this.humidity+ " and pressure="+ this.pressure);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();
	}
}
