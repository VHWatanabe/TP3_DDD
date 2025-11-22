package com.infnet.TP3_DDD.core.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public abstract class BaseCommand {

    @TargetAggregateIdentifier
    private final String id;

    protected BaseCommand(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
