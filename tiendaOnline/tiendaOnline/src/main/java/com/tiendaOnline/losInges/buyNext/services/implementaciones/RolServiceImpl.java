package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.Rol;
import com.tiendaOnline.losInges.buyNext.repositories.RolRepository;
import com.tiendaOnline.losInges.buyNext.services.RolService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;

    public RolServiceImpl (RolRepository rolRepository){
        this.rolRepository = rolRepository;
    }
    @Override
    public Optional<Rol> getById(long id) {
        return rolRepository.findById(id);
    }

    @Override
    public List<Rol> getAll() {
        return rolRepository.findAll();
    }

    @Override
    public Optional<Rol> update(long id, Rol rol) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(long id) {
        if(rolRepository.existsById(id)){
            rolRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Rol create(Rol rol) {
        return null;
    }
}
