package com.gaz.service;

import com.gaz.model.ArduinoController;

import java.util.List;


public interface ArduinoControllerService{

    void addController(ArduinoController arduinoController);

    ArduinoController getControllerById(String controllerId);

    List<ArduinoController> getAllControllers();

}
