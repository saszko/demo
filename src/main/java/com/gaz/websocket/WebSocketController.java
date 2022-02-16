package com.gaz.websocket;

import com.gaz.model.Condition;
import com.gaz.service.impl.ConditionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.net.ConnectException;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class WebSocketController {
    ConditionServiceImpl service;

    @Autowired
    public void setConditionService(ConditionServiceImpl conditionService) {
        this.service = conditionService;
    }

    @MessageMapping("/stomp")
    public void addConditions(ReportMessage message) throws Exception {
        List<Condition> conditionList = message.getConditionList()
                .stream()
                .map(c -> new Condition(c.getValue(), c.getMetricUnit(), c.getSensorName(), message.getControllerId()))
                .collect(Collectors.toList());
        //
        // service.addAll(conditionList);
        conditionList.forEach(System.out::println);


    }

}
