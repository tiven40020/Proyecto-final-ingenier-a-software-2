package com.tiendaOnline.losInges.buyNext.controllers;

import com.tiendaOnline.losInges.buyNext.entities.DetallePedido;
import com.tiendaOnline.losInges.buyNext.services.CategoriaService;
import com.tiendaOnline.losInges.buyNext.services.DetallePedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalleProductos")
public class DetallePedidoController {
    private final DetallePedidoService detallePedidoService;

    public DetallePedidoController(DetallePedidoService detallePedidoService){
        this.detallePedidoService = detallePedidoService;
    }

    @GetMapping("/{idUsuario}")
    public Optional<DetallePedido> obtenerCarrito(@PathVariable Long idUsuario) {
        return detallePedidoService.getById(idUsuario);
    }

    @PostMapping
    public DetallePedido agregarProducto(@RequestBody DetallePedido detalle) {
        return detallePedidoService.create(detalle);
    }

    @PutMapping("/{idDetalle}")
    public Optional<DetallePedido> actualizar(@PathVariable Long idDetalle, @RequestBody DetallePedido detalle) {
        return detallePedidoService.update(idDetalle, detalle);
    }

    @DeleteMapping("/{idDetalle}")
    public void eliminar(@PathVariable Long idDetalle) {
        detallePedidoService.deleteById(idDetalle);
    }

}
