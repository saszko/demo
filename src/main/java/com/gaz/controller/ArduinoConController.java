package com.gaz.controller;

import com.gaz.model.ArduinoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gaz.service.ArduinoControllerService;
import com.gaz.service.impl.ArduinoControllerServiceImpl;


@RestController
@RequestMapping("plate")
public class ArduinoConController {
    ArduinoControllerService service;

    @Autowired
    public void setService(ArduinoControllerServiceImpl service) {
        this.service = service;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ArduinoController addPlates(@RequestBody ArduinoController conn) throws InterruptedException {
       service.addController(conn);
        System.out.println("plates in db");
        return conn;
    }
}
