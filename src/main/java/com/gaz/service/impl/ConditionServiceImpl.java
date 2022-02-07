package com.gaz.service.impl;

import com.gaz.model.Condition;
import com.gaz.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gaz.repository.ConditionRepository;

import java.util.List;

@Service
public class ConditionServiceImpl implements ConditionService {
    @Autowired
    ConditionRepository conditionRepository;

    @Override
    public void addCondition(Condition condition) {
        conditionRepository.addCondition(condition.getControllerId(), condition.getMetricUnit(), condition.getSensorName(), condition.getValue());
    }

    @Override
    public Condition getConditionByControllerId(String controllerId) {
        return null;
    }

    @Override
    public void addAll(List<Condition> list) {
        conditionRepository.saveAllAndFlush(list);
    }


}
