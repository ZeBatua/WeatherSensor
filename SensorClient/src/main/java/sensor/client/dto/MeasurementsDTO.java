package sensor.client.dto;

public class MeasurementsDTO {

    private Double temperature;
    private Boolean rainStatus;
    private SensorDTO sensor;

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Boolean getRainStatus() {
        return rainStatus;
    }

    public void setRainStatus(Boolean rainStatus) {
        this.rainStatus = rainStatus;
    }

    public SensorDTO getSensor() {
        return sensor;
    }

    public void setSensor(SensorDTO sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "MeasurementsDTO{" +
                "temperature=" + temperature +
                ", rainStatus=" + rainStatus +
                ", sensor=" + sensor +
                '}';
    }

}

