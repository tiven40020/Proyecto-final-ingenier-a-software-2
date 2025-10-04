package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.Resenia;
import com.tiendaOnline.losInges.buyNext.repositories.ReseniaRepository;
import com.tiendaOnline.losInges.buyNext.services.ReseniaService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ReseniaServiceImpl implements ReseniaService {

    private final ReseniaRepository reseniaRepository;

    public ReseniaServiceImpl (ReseniaRepository reseniaRepository){
        this.reseniaRepository = reseniaRepository;
    }


    @Override
    public Optional<Resenia> getById(long id) {
        return reseniaRepository.findById(id);
    }

    @Override
    public List<Resenia> getAll() {
        return reseniaRepository.findAll();
    }

    @Override
    public Optional<Resenia> update(long id, Resenia resenia) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(long id) {
        if(reseniaRepository.existsById(id)){
            reseniaRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Resenia create(Resenia resenia) {
        return null;
    }
}
