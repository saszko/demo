package com.gas;

import model.ArduinoController;
import model.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import repository.AdruinoControllerRepository;
import repository.SensorRepository;
import service.ArduinoControllerService;
import service.SensorService;
import service.impl.ArduinoControllerServiceImpl;
import service.impl.SensorServiceImpl;

@SpringBootApplication
public class DeviceManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceManagerApplication.class, args);

	}

	}

