package com.tiendaOnline.losInges.buyNext.services;

import com.tiendaOnline.losInges.buyNext.entities.Rol;
import java.util.*;

public interface RolService {

    Optional<Rol> getById(long id);

    List<Rol> getAll();

    Optional<Rol> update(long id, Rol rol);

    boolean deleteById(long id);

    Rol create(Rol rol);
}
