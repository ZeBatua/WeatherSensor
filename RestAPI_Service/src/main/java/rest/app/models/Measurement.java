package rest.app.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
@Table(name = "Measurements")
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Size(min = -55, max = 125, message = "Недопустимые значения температуры. Должно быть [-55; 125]")
    @NotNull(message = "Не удалось измерить температуру")
    @Column(name = "temperature")
    private Double temperature;


    @NotNull(message = "Не удалось зафиксировать идет ли дождь")
    @Column(name = "rain_status")
    private Boolean rainStatus;

    @NotNull(message = "Не удалось установить время измерения")
    @Column(name = "measurement_time")
    private LocalDateTime measurementTime;

    @NotNull(message = "Не найден сенсор, который произвел измерения")
    @ManyToOne
    @JoinColumn(name = "sensor", referencedColumnName = "name")
    private Sensor sensor;

    public Measurement() {
    }

    public Measurement(Double temperature, Boolean rainStatus, LocalDateTime measurementTime, Sensor sensor) {
        this.temperature = temperature;
        this.rainStatus = rainStatus;
        this.measurementTime = measurementTime;
        this.sensor = sensor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Boolean isRainStatus() {
        return rainStatus;
    }

    public void setRainStatus(Boolean rainStatus) {
        this.rainStatus = rainStatus;
    }

    public LocalDateTime getMeasurementTime() {
        return measurementTime;
    }

    public void setMeasurementTime(LocalDateTime measurementTime) {
        this.measurementTime = measurementTime;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "Measurements{" +
                "id=" + id +
                ", temperature=" + temperature +
                ", rainStatus=" + rainStatus +
                ", measurementTime=" + measurementTime +
                '}';
    }
}
