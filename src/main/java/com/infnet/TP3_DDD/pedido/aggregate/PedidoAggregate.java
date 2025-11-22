package com.infnet.TP3_DDD.pedido.aggregate;

import java.time.Instant;

import com.infnet.TP3_DDD.pedido.command.CreatePedidoCommand;
import com.infnet.TP3_DDD.pedido.event.PedidoCreatedEvent;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
@Entity
public class PedidoAggregate {

    @Id
    @AggregateIdentifier
    private String id;

    private String clienteId;

    private String status;

    @Column(name = "data_criacao")
    private Instant dataCriacao;

    protected PedidoAggregate() {
    }

    @CommandHandler
    public PedidoAggregate(CreatePedidoCommand command) {
        apply(new PedidoCreatedEvent(command.getId(), command.getClienteId(), "CRIADO"));
    }

    @EventSourcingHandler
    public void on(PedidoCreatedEvent event) {
        this.id = event.getId();
        this.clienteId = event.getClienteId();
        this.status = event.getStatus();
        this.dataCriacao = Instant.now();
    }

    public String getId() {
        return id;
    }

    public String getClienteId() {
        return clienteId;
    }

    public String getStatus() {
        return status;
    }

    public Instant getDataCriacao() {
        return dataCriacao;
    }
}