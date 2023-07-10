package rest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest.app.models.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer> {
}
