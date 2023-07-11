package rest.app.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import rest.app.models.Sensor;

public class MeasurementDTO {

    @Size(min = -55, max = 125, message = "Недопустимые значения температуры. Должно быть [-55; 125]")
    @NotNull(message = "Не удалось измерить температуру")
    private Double temperature;

    @NotNull(message = "Не удалось зафиксировать идет ли дождь")
    private Boolean rainStatus;

    @NotNull(message = "Не найден сенсор, который произвел измерения")
    private Sensor sensor;

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

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

}
