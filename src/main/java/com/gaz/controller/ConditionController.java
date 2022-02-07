package com.gaz.controller;

import com.gaz.model.Condition;
import com.gaz.service.ConditionService;
import com.gaz.service.impl.ConditionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "condition")
public class ConditionController {
    ConditionServiceImpl service;

    @Autowired
    public  void setConditionService(ConditionServiceImpl conditionService){
        this.service = conditionService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Condition addCondition(@RequestBody Condition condition) {
        service.addCondition(condition);
        return condition;
    }
    @RequestMapping(value = "/addAll", method = RequestMethod.POST)
    public List<Condition> addAllCondition(@RequestBody List<Condition> condition) {
        service.addAll(condition);
        return condition;
    }
}
