package com.tiendaOnline.losInges.buyNext.services;

import com.tiendaOnline.losInges.buyNext.entities.Estado;
import java.util.*;

public interface EstadoService {

    Optional<Estado> getById(long id);

    List<Estado> getAll();

    Optional<Estado> update(long id, Estado estado);

    boolean deleteById(long id);

    Estado create (Estado estado);
}
