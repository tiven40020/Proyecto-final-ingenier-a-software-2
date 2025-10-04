package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.Usuario;
import com.tiendaOnline.losInges.buyNext.repositories.UsuarioRepository;
import com.tiendaOnline.losInges.buyNext.services.UsuarioService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UsuarioServiceImpl implements UsuarioService {


    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl (UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    @Override
    public Optional<Usuario> getById(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> update(long id, Usuario usuario) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(long id) {
        if(usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Usuario create(Usuario usuario) {
        return null;
    }
}
