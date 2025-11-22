package com.infnet.TP3_DDD.pedido.command;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

@Service
public class PedidoCommandService {

    private final CommandGateway commandGateway;

    public PedidoCommandService(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    public CompletableFuture<String> criarPedido(String clienteId) {
        String id = UUID.randomUUID().toString();
        CreatePedidoCommand command = new CreatePedidoCommand(id, clienteId);
        return commandGateway.send(command);
    }
}