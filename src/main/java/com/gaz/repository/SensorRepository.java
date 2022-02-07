package com.gaz.repository;

import com.gaz.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SensorRepository extends JpaRepository<Sensor, Long> {

}
