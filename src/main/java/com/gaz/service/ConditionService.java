package com.gaz.service;

import com.gaz.model.Condition;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ConditionService {
    void addCondition(Condition condition);
    Condition getConditionByControllerId(String controllerId);
    void addAll(List<Condition> list);
}
