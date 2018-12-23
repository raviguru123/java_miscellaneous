public class WeatherStation {
	//public static void main(String[] args) {
	  public static void main(String[] args) {
		WeatherData weatherData= new WeatherData();
		System.out.println(weatherData);
		CurrentConditionDisplay currentconditiondisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(12.0f, 45.0f, 56.7f); 
	        //weatherData.setMeasurements(80, 65, 30.4f);
			
		//currentconditiondisplay.display();	
	}
}
