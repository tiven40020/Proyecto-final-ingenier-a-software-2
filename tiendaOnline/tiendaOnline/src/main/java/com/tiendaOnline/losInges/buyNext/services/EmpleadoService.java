package com.tiendaOnline.losInges.buyNext.services;

import com.tiendaOnline.losInges.buyNext.entities.Empleado;
import java.util.List;
import java.util.Optional;

public interface EmpleadoService {

    Optional<Empleado> getById(long id);

    List<Empleado> getAll();

    Optional<Empleado> update(long id, Empleado empleado);

    boolean deleteById(long id);

    Empleado create(Empleado empleado);
}
