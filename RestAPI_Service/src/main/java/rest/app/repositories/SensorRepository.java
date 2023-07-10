package rest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest.app.models.Measurement;

@Repository
public interface SensorRepository extends JpaRepository<Measurement, Integer> {
}
