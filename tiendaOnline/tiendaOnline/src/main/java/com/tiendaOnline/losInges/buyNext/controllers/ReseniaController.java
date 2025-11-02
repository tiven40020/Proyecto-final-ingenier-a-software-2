package com.tiendaOnline.losInges.buyNext.controllers;

import com.tiendaOnline.losInges.buyNext.entities.Resenia;
import com.tiendaOnline.losInges.buyNext.services.ReseniaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resenias")
public class ReseniaController {

    private final ReseniaService reseniaService;

    public ReseniaController(ReseniaService reseniaService) {
        this.reseniaService = reseniaService;
    }

    @GetMapping
    public List<Resenia> getAllResenias() {
        return reseniaService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resenia> getReseniaById(@PathVariable Long id) {
        return reseniaService.getById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Resenia> createResenia(@RequestBody Resenia resenia) {
        Resenia nuevaResenia = reseniaService.create(resenia);
        return ResponseEntity.ok(nuevaResenia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resenia> updateResenia(@PathVariable Long id, @RequestBody Resenia reseniaActualizada) {
        return reseniaService.update(id, reseniaActualizada)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResenia(@PathVariable Long id) {
        if (reseniaService.deleteById(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
