package sensor.client.dto;

import java.util.List;

public class MeasurementsResponse {

    List<MeasurementsDTO> measurements;

    public List<MeasurementsDTO> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<MeasurementsDTO> measurements) {
        this.measurements = measurements;
    }

    @Override
    public String toString() {
        return "MeasurementsResponse{" +
                "measurements=" + measurements +
                '}';
    }

}
