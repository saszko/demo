package com.gaz.websocket;

import com.gaz.model.Condition;

import java.util.List;

public class ReportMessage {
    String controllerId;
    List<Condition> conditionList;

    public ReportMessage(String controllerId, List<Condition> conditionList) {
        this.controllerId = controllerId;
        this.conditionList = conditionList;
    }

    public ReportMessage() {
    }

    public String getControllerId() {
        return controllerId;
    }

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    public List<Condition> getConditionList() {
        return conditionList;
    }

    public void setConditionList(List<Condition> conditionList) {
        this.conditionList = conditionList;
    }
}
