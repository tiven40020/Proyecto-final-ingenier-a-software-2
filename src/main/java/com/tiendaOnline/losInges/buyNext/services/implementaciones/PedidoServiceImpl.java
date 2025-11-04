package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.Pedido;
import com.tiendaOnline.losInges.buyNext.repositories.PedidoRepository;
import com.tiendaOnline.losInges.buyNext.services.PedidoService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoServiceImpl (PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }
    @Override
    public Optional<Pedido> getById(long id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public List<Pedido> getAll() {
        return pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> update(long id, Pedido pedidoActualizado) {
        return pedidoRepository.findById(id)
                .map(pedido -> {
                    pedido.setFecha(pedidoActualizado.getFecha());
                    pedido.setTotal(pedidoActualizado.getTotal());
                    pedido.setUsuario(pedidoActualizado.getUsuario());
                    return pedidoRepository.save(pedido);
                });
    }

    @Override
    public boolean deleteById(long id) {
        if(pedidoRepository.existsById(id)){
            pedidoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Pedido create(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}
