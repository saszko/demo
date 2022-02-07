package com.gaz.service;

import com.gaz.model.Sensor;

import java.util.List;


public interface SensorService {
    void addSensor(Sensor sensor);
    List<Sensor> getSensorByControllerId(String controllerId);

}
