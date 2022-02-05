package service.impl;

import model.ArduinoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AdruinoControllerRepository;
import service.ArduinoControllerService;

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
