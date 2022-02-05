package service;

import model.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SensorRepository;

import java.util.List;


public interface SensorService {
    void addSensor(Sensor sensor);
    List<Sensor> getSensorByControllerId(String controllerId);

}
