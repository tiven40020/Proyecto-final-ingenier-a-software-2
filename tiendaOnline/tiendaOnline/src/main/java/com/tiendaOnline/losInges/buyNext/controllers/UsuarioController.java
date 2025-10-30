package com.tiendaOnline.losInges.buyNext.controllers;

import com.tiendaOnline.losInges.buyNext.entities.Usuario;
import com.tiendaOnline.losInges.buyNext.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class UsuarioController {
    private UsuarioService usuarioService;

    @PostMapping("/registro")
    public Usuario registrar(@RequestBody Usuario usuario) {
        return usuarioService.registrar(usuario);
    }

    @PostMapping("/login")
    public Optional<Usuario> login(@RequestBody Usuario usuario) {
        return usuarioService.login(usuario.getEmail(), usuario.getPassword());
    }

    @GetMapping("/{id}")
    public Optional<Usuario> obtener(@PathVariable Long id) {
        return usuarioService.getById(id);
    }

    @PutMapping("/{id}")
    public Optional<Usuario> actualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.update(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        usuarioService.deleteById(id);
    }
}
