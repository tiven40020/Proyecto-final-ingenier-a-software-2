package com.tiendaOnline.losInges.buyNext.services;

import com.tiendaOnline.losInges.buyNext.dto.response.ReseniaResponseDTO;
import com.tiendaOnline.losInges.buyNext.entities.Resenia;
import java.util.*;

public interface ReseniaService {

    Optional<Resenia> getById(long id);

    List<Resenia> getAll();

    Optional<Resenia> update(long id, Resenia resenia);

    boolean deleteById(long id);

    Resenia create(Long usuaruiId, Long productoId, Resenia resenia);

    List<ReseniaResponseDTO> getByProducto(Long productoId);

    Double obtenerPromedioCalificacion(Long productoId);
}
