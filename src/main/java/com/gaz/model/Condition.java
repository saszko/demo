package com.gaz.model;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.TABLE;

@Entity
@Table(name = "conditions")
public class Condition {
    @Id
    @GeneratedValue(strategy = TABLE)
    @Column(name = "id", unique = true)
    private Long id;

   // @Temporal(TemporalType.TIMESTAMP)
   //@GeneratedValue(strategy = TABLE)
    //@Column(name = "timestamp")
    Date timestamp;

    @Column(name = "values")
    private float value;

    @Column(name = "metric_unit", length = 12)
    String metricUnit;

    @Column(name = "sensor_name", length = 12)
    String sensorName;

    @JoinColumn(name = "controller_id", referencedColumnName = "controller_id")
    @Column
    String controllerId;


    public Condition() {
    }

    public Condition(float value, String metricUnit, String sensorName, String controllerId) {
        this.value = value;
        this.metricUnit = metricUnit;
        this.sensorName = sensorName;
        this.controllerId = controllerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getMetricUnit() {
        return metricUnit;
    }

    public void setMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getControllerId() {
        return controllerId;
    }

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    @Override
    public String toString() {
        return "Indicator{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", value=" + value +
                ", metricUnit='" + metricUnit + '\'' +
                ", sensorName='" + sensorName + '\'' +
                ", controllerId=" + controllerId +
                '}';
    }
}
