package com.infnet.TP3_DDD.pedido.query;

import java.util.List;
import java.util.Optional;

import com.infnet.TP3_DDD.pedido.aggregate.PedidoAggregate;
import com.infnet.TP3_DDD.pedido.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoQueryService {

    private final PedidoRepository pedidoRepository;

    public PedidoQueryService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<PedidoAggregate> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Optional<PedidoAggregate> buscarPorId(String id) {
        return pedidoRepository.findById(id);
    }
}