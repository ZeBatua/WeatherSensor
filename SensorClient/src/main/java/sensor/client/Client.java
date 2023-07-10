package sensor.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        final String sensor = "TestSensor_6";

        registerSensor(sensor);
        getMeasurement(sensor);
    }

    private static void registerSensor(String sensor) {
        final String url = "http://localhost:8080/sensors/registration";

        Map<String, Object> jsonData = new HashMap<>();
        jsonData.put("name", sensor);

        makePostRequestWithJSONSensorData(url, jsonData);
    }

    private static void getMeasurement(String sensor) {
        Random random = new Random();

        double minTemperature = -55.0;
        double maxTemperature = 125.0;
        for (int i = 0; i < 1; i++) {
            System.out.println(i);
            sendMeasurement(random.doubles(-55.0, 125).iterator().nextDouble(),
                    random.nextBoolean(), sensor);
        }
    }

    private static void sendMeasurement(double temperature, boolean rainStatus, String sensorName) {
        final String url = "http://localhost:8080/measurements/add";

        Map<String, Object> jsonData = new HashMap<>();
        jsonData.put("temperature", temperature);
        jsonData.put("rainStatus", rainStatus);
        jsonData.put("sensor", Map.of("name", sensorName));

        makePostRequestWithJSONSensorData(url, jsonData);
    }

    private static void makePostRequestWithJSONSensorData(String url, Map<String, Object> jsonData) {
        final RestTemplate restTemplate = new RestTemplate();

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> request = new HttpEntity<>(jsonData, headers);
        System.out.println("jsonData = " + jsonData);

        try {
            restTemplate.postForObject(url, request, String.class);
            System.out.println("Measurements were send!");
        } catch (HttpClientErrorException e) {
            System.out.println("Error!");
            System.out.println(e.getMessage());
        }
    }

}
