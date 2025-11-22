package com.infnet.TP3_DDD.core.event;

public abstract class BaseEvent {

    private final String id;

    protected BaseEvent(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}