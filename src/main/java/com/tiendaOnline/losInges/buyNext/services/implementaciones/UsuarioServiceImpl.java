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
    public Optional<Usuario> update(long id, Usuario usuarioActualizado) {
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuario.setNombre(usuarioActualizado.getNombre());
                    usuario.setApellido(usuarioActualizado.getApellido());
                    usuario.setCorreo(usuarioActualizado.getCorreo());
                    usuario.setContrasenia(usuarioActualizado.getContrasenia());
                    usuario.setRol(usuarioActualizado.getRol());
                    return usuarioRepository.save(usuario);
                });
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
        try{
            if (usuarioRepository.existsByCorreo(usuario.getCorreo())){
                throw new RuntimeException("El correo ya esta registrado");
            }
            return usuarioRepository.save(usuario);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Optional<Usuario> login(String correo, String contrasenia) {
        return usuarioRepository.findByCorreoAndContrasenia(correo, contrasenia);
    }
}
