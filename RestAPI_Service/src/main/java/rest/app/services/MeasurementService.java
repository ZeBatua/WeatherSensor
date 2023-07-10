package rest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rest.app.models.Measurement;
import rest.app.repositories.MeasurementRepository;

@Service
@Transactional(readOnly = true)
public class MeasurementService {

    MeasurementRepository measurementRepository;

    @Autowired
    public MeasurementService(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    @Transactional
    public void addMeasurement(Measurement measurement) {
        measurementRepository.save(measurement);
    }
}
