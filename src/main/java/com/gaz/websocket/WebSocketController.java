package com.gaz.websocket;

import com.gaz.model.Condition;
import com.gaz.service.impl.ConditionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Controller
public class WebSocketController {
    ConditionServiceImpl service;

    @Autowired
    public void setConditionService(ConditionServiceImpl conditionService) {
        this.service = conditionService;
    }
    Map<String, WebSocketSession> sessionMap = new ConcurrentHashMap<>();

    @MessageMapping("/hellol")
    public void addConditions(ReportMessage message, WebSocketSession session) throws Exception {
        sessionMap.put(message.getControllerId(), session);
        List<Condition> conditionList = message.getConditionList()
                .stream()
                .map(c -> new Condition(c.getValue(), c.getMetricUnit(), c.getSensorName(), message.getControllerId()))
                .collect(Collectors.toList());
        conditionList.forEach(System.out::println);

        sendMessage(message.getControllerId(), conditionList.get(0).toString());
    }

    public void sendMessage(String controllerId, String message) throws IOException {
        WebSocketSession session = sessionMap.get(controllerId);
        byte[] bytes = message.getBytes(message);
        session.sendMessage(new TextMessage(bytes));

    }

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(TestMessage message) throws Exception {
        Thread.sleep(3000); // simulated delay
        return new Greeting("Hello, " + message.getMessage() + "!");
    }



}
