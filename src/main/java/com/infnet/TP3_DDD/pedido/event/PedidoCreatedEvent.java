package com.infnet.TP3_DDD.pedido.event;

import com.infnet.TP3_DDD.core.event.BaseEvent;

public class PedidoCreatedEvent extends BaseEvent {

    private final String clienteId;
    private final String status;

    public PedidoCreatedEvent(String id, String clienteId, String status) {
        super(id);
        this.clienteId = clienteId;
        this.status = status;
    }

    public String getClienteId() {
        return clienteId;
    }

    public String getStatus() {
        return status;
    }
}