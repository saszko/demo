package com.gaz.repository;

import com.gaz.model.Condition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;


public interface ConditionRepository extends JpaRepository<Condition, String> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "insert into conditions (controller_id, metric_unit, sensor_name, values) values(:controllerId, :metricUnit, :sensorName, :values)", nativeQuery = true )
    void addCondition(@Param("controllerId") String controllerId, @Param("metricUnit") String metricUnit, @Param("sensorName") String sensorName, @Param("values") float values);

}
