package controller;

import model.ArduinoController;
import model.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.ArduinoControllerService;
import service.ConditionService;
import service.impl.ArduinoControllerServiceImpl;
import service.impl.SensorServiceImpl;


@Controller
public class ArduinoConController {
    ArduinoControllerService service;

    @Autowired
    public void setService(ArduinoControllerServiceImpl service) {
        this.service = service;
    }

    @RequestMapping(value = "/plates", method = RequestMethod.GET)
    public String listPlates(Model model) {
        model.addAttribute("plates", service.getAllControllers());
        System.out.println("Returning plates:");
        return "plates";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addPlates(Model model) throws InterruptedException {
        testJPA();
        System.out.println("plates in db");
        return "index";
    }

    @EventListener(ApplicationReadyEvent.class)
    public void testJPA() throws InterruptedException {
        //Thread.sleep(5000);
        ArduinoController controller = new ArduinoController();
        controller.setControllerId("1264h323076");
        controller.setLatitude("30.954334");
        controller.setLongitude("51.7646364");
        controller.setName("Nano");
        controller.setLocationDescription("Kiev");

        Sensor sensor = new Sensor();
        sensor.setControllerId(controller);
        sensor.setName("DDK");

        SensorServiceImpl sensorService = new SensorServiceImpl();
        sensorService.addSensor(sensor);

        ArduinoControllerServiceImpl controllerService = new ArduinoControllerServiceImpl();
        controllerService.addController(controller);


        //System.out.println(controllerService.getControllerById("1264h323076"));
        //System.out.println(sensorService.getSensorByControllerId("1264h323076").toString());

    }
}
