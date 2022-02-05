package repository;

import model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface SensorRepository extends JpaRepository<Sensor, Long> {

}
