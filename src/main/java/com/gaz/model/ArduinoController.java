package com.gaz.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.util.List;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "controllers")
public class ArduinoController {
    @Id
    @Column(name = "controller_id", unique = true, nullable = false)
    private String controllerId;
    @Column(name = "name")
    private String name;
    @Column(name = "location_description")
    private String locationDescription;
    @Column(name = "latitude")
    private String latitude;
    @Column(name = "longitude")
    private String longitude;
    @Transient
    private List<Sensor> sensorList;

    public ArduinoController(String controllerId, String name, String locationDescription, String latitude, String longitude) {
        this.controllerId = controllerId;
        this.name = name;
        this.locationDescription = locationDescription;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public ArduinoController() {
    }

    public String getControllerId() {
        return controllerId;
    }

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<Sensor> getSensorList() {
        return sensorList;
    }

    public void setSensorList(List<Sensor> sensorList) {
        this.sensorList = sensorList;
    }

    @Override
    public String toString() {
        return "ArduinoController{" +
                "controllerId='" + controllerId + '\'' +
                ", name='" + name + '\'' +
                ", locationDescription='" + locationDescription + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", sensorList=" + sensorList +
                '}';
    }
}
