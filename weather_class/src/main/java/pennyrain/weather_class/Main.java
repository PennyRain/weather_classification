package pennyrain.weather_class;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Generate random temperature values for 30 days
		List<WeatherData> weatherDataList = new ArrayList<WeatherData>();

		// Sample weather data
		weatherDataList.add(new WeatherData(21, 65));
		weatherDataList.add(new WeatherData(32, 80));
		weatherDataList.add(new WeatherData(15, 50));
		weatherDataList.add(new WeatherData(28, 78));
		weatherDataList.add(new WeatherData(9, 40));

		KMeans kMeans = new KMeans(2, weatherDataList);
		kMeans.cluster();
		kMeans.printClusters();
	}
}
