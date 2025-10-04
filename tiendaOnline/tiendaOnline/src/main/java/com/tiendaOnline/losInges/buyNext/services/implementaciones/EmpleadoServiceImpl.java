package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.Empleado;
import com.tiendaOnline.losInges.buyNext.repositories.EmpleadoRepository;
import com.tiendaOnline.losInges.buyNext.services.EmpleadoService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoServiceImpl (EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public Optional<Empleado> getById(long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public List<Empleado> getAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public Optional<Empleado> update(long id, Empleado empleado) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(long id) {
        if(empleadoRepository.existsById(id)){
            empleadoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Empleado create(Empleado empleado) {
        return null;
    }
}
