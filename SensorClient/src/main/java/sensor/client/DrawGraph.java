package sensor.client;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.springframework.web.client.RestTemplate;
import sensor.client.dto.MeasurementsDTO;
import sensor.client.dto.MeasurementsResponse;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DrawGraph {

    public static void main(String[] args) {
        List<Double> temparatures = getTemperaturesData();
        draw(temparatures);
    }

    private static List<Double> getTemperaturesData() {
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/measurements";
        MeasurementsResponse jsonResponse = restTemplate.getForObject(url, MeasurementsResponse.class);

        if (jsonResponse == null || jsonResponse.getMeasurements() == null)
            return Collections.emptyList();

        return jsonResponse.getMeasurements().stream().map(MeasurementsDTO::getTemperature)
                .collect(Collectors.toList());
    }

    private static void draw(List<Double> temperatures) {
        double[] xData = IntStream.range(0, temperatures.size()).asDoubleStream().toArray();
        double[] yData = temperatures.stream().mapToDouble(x -> x).toArray();

        XYChart chart = QuickChart.getChart("Temperatures", "X", "Y", "temperature",
                xData, yData);

        new SwingWrapper(chart).displayChart();
    }

}
