package com.tiendaOnline.losInges.buyNext.services;

import com.tiendaOnline.losInges.buyNext.entities.Usuario;

import java.util.*;

public interface UsuarioService {

    Optional<Usuario> getById(long id);

    List<Usuario> getAll();

    Optional<Usuario> update(long id, Usuario usuarioActualizado);

    boolean deleteById(long id);

    Usuario create(Usuario usuario);

    Optional<Usuario> login(String correo, String password);
}
