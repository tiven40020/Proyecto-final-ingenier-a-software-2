package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.DetallePedido;
import com.tiendaOnline.losInges.buyNext.repositories.DetallePedidoRepository;
import com.tiendaOnline.losInges.buyNext.services.DetallePedidoService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {

    private final DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoServiceImpl(DetallePedidoRepository detallePedidoRepository){
        this.detallePedidoRepository = detallePedidoRepository;
    }

    @Override
    public Optional<DetallePedido> getById(long id) {
        return detallePedidoRepository.findById(id);
    }

    @Override
    public List<DetallePedido> getAll() {
        return detallePedidoRepository.findAll();
    }

    @Override
    public Optional<DetallePedido> update(long id, DetallePedido detallePedido) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(long id) {
        if(detallePedidoRepository.existsById(id)){
            detallePedidoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public DetallePedido create(DetallePedido detallePedido) {
        return null;
    }
}
