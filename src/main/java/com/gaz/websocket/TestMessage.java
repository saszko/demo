package com.gaz.websocket;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;


public class TestMessage {
    @JsonProperty
    String name;

    public TestMessage(String name) {
        this.name = name;
    }

    public TestMessage() {
    }

    public String getMessage() {
        return name;
    }

    public void setMessage(String name) {
        this.name = name;
    }
}
