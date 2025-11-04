package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.Categoria;
import com.tiendaOnline.losInges.buyNext.repositories.CategoriaRepository;
import com.tiendaOnline.losInges.buyNext.services.CategoriaService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl (CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Optional<Categoria> getById(long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> update(long id, Categoria categoriaActualizada) {
        return categoriaRepository.findById(id)
                .map(categoria -> {
                    categoria.setNombre(categoriaActualizada.getNombre());
                    categoria.setDescripcion(categoriaActualizada.getDescripcion());
                    return categoriaRepository.save(categoria);
                });
    }

    @Override
    public boolean deleteById(long id) {
        if(categoriaRepository.existsById(id)){
            categoriaRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Categoria create(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
