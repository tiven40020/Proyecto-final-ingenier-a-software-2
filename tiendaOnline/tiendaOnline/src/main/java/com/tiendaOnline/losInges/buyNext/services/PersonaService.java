package com.tiendaOnline.losInges.buyNext.services;

import com.tiendaOnline.losInges.buyNext.entities.Persona;
import java.util.*;

public interface PersonaService {

    Optional<Persona> getById(long id);

    List<Persona> getAll();

    Optional<Persona> update(long id, Persona persona);

    boolean deleteById(long id);

    Persona create(Persona persona);
}
