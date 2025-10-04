package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.Estado;
import com.tiendaOnline.losInges.buyNext.repositories.EstadoRepository;
import com.tiendaOnline.losInges.buyNext.services.EstadoService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EstadoServiceImpl implements EstadoService {

    private final EstadoRepository estadoRepository;

    public EstadoServiceImpl (EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    public Optional<Estado> getById(long id) {
        return estadoRepository.findById(id);
    }

    @Override
    public List<Estado> getAll() {
        return estadoRepository.findAll();
    }

    @Override
    public Optional<Estado> update(long id, Estado estado) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(long id) {
        if(estadoRepository.existsById(id)){
            estadoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Estado create(Estado estado) {
        return null;
    }
}
