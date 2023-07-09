package rest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherSensorRestApiApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(WeatherSensorRestApiApplication.class, args);
	}

}
