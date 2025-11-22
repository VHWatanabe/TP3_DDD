package com.infnet.TP3_DDD.pedido.command;

import com.infnet.TP3_DDD.core.command.BaseCommand;

public class CreatePedidoCommand extends BaseCommand {

    private final String clienteId;

    public CreatePedidoCommand(String id, String clienteId) {
        super(id);
        this.clienteId = clienteId;
    }

    public String getClienteId() {
        return clienteId;
    }
}