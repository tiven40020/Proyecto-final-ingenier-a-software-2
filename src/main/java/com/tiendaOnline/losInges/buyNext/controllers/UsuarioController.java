package com.tiendaOnline.losInges.buyNext.controllers;

import com.tiendaOnline.losInges.buyNext.dto.request.LoginRequest;
import com.tiendaOnline.losInges.buyNext.entities.Usuario;
import com.tiendaOnline.losInges.buyNext.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> getAll() {
        return usuarioService.getAll();
    }

    @PostMapping("/registro")
    public Usuario registrar(@RequestBody Usuario usuario) {
        return usuarioService.create(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody LoginRequest loginRequest) {
        Optional<Usuario> usuario = usuarioService.login(loginRequest.correo(), loginRequest.contrasenia());
        return usuario.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(401).build());
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getById(@PathVariable Long id) {
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
