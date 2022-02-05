package service.impl;

import model.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SensorRepository;
import service.SensorService;

import java.util.List;

@Service
public class SensorServiceImpl implements SensorService {
    @Autowired
    SensorRepository sensorRepository;

    @Override
    public void addSensor(Sensor sensor) {
        sensorRepository.saveAndFlush(sensor);

    }

    @Override
    public List<Sensor> getSensorByControllerId(String controllerId) {
       return sensorRepository.findAll();
    }
}
