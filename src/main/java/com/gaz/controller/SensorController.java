package com.gaz.controller;

import com.gaz.model.ArduinoController;
import com.gaz.model.Sensor;
import com.gaz.service.ArduinoControllerService;
import com.gaz.service.impl.ArduinoControllerServiceImpl;
import com.gaz.service.impl.SensorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sensor")
public class SensorController {
    SensorServiceImpl service;

    @Autowired
    public void setService(SensorServiceImpl service) {
        this.service = service;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public Sensor addSensor(@RequestBody Sensor sensor) throws InterruptedException {
        service.addSensor(sensor);
        System.out.println("sensor in db");
        return sensor;
    }
}
