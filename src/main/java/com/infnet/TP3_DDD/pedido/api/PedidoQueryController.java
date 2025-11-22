package com.infnet.TP3_DDD.pedido.api;

import java.util.List;

import com.infnet.TP3_DDD.pedido.aggregate.PedidoAggregate;
import com.infnet.TP3_DDD.pedido.query.PedidoQueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoQueryController {

    private final PedidoQueryService pedidoQueryService;

    public PedidoQueryController(PedidoQueryService pedidoQueryService) {
        this.pedidoQueryService = pedidoQueryService;
    }

    @GetMapping
    public List<PedidoAggregate> listarTodos() {
        return pedidoQueryService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoAggregate> buscarPorId(@PathVariable String id) {
        return pedidoQueryService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}