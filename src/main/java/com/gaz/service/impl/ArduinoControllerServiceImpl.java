package com.gaz.service.impl;

import com.gaz.model.ArduinoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gaz.repository.AdruinoControllerRepository;
import com.gaz.service.ArduinoControllerService;

import java.util.List;

@Service
public class ArduinoControllerServiceImpl implements ArduinoControllerService {
    @Autowired
    AdruinoControllerRepository  adruinoControllerRepository;

    @Override
    public void addController(ArduinoController arduinoController) {
        adruinoControllerRepository.saveAndFlush(arduinoController);
    }

    @Override
    public ArduinoController getControllerById(String controllerId) {
        return adruinoControllerRepository.getById(controllerId);
    }

    @Override
    public List<ArduinoController> getAllControllers() {
        return adruinoControllerRepository.findAll();
    }
}
