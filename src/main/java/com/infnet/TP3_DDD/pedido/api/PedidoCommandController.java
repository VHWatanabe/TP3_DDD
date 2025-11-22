package com.infnet.TP3_DDD.pedido.api;

import java.util.concurrent.CompletableFuture;

import com.infnet.TP3_DDD.pedido.command.PedidoCommandService;
import com.infnet.TP3_DDD.pedido.dto.CriarPedidoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoCommandController {

    private final PedidoCommandService pedidoCommandService;

    public PedidoCommandController(PedidoCommandService pedidoCommandService) {
        this.pedidoCommandService = pedidoCommandService;
    }

    @PostMapping
    public ResponseEntity<String> criarPedido(@RequestBody CriarPedidoRequest request) {
        CompletableFuture<String> future = pedidoCommandService.criarPedido(request.getClienteId());
        String id = future.join();
        return ResponseEntity.ok(id);
    }
}