package com.infnet.TP3_DDD.pedido.repository;

import com.infnet.TP3_DDD.pedido.aggregate.PedidoAggregate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoAggregate, String> {
}