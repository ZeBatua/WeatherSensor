package sensor.client;

import java.util.List;

public class MeasurementsResponse {
    List<Measurements> measurements;

    public List<Measurements> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<Measurements> measurements) {
        this.measurements = measurements;
    }
}
