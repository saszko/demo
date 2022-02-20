package com.gaz.websocket;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;


public class Greeting {
    @JsonProperty
    private String content;

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
