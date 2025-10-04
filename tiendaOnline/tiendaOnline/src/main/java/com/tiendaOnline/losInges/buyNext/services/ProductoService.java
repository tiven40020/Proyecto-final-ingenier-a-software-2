package com.tiendaOnline.losInges.buyNext.services;

import com.tiendaOnline.losInges.buyNext.entities.Producto;
import java.util.*;

public interface ProductoService {

    Optional<Producto> getById(long id);

    List<Producto> getAll();

    Optional<Producto> update(long id, Producto producto);

    boolean deleteById(long id);

    Producto create(Producto producto);
}
