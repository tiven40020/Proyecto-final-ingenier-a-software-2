package com.tiendaOnline.losInges.buyNext.services;

import com.tiendaOnline.losInges.buyNext.entities.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {

    Optional<Cliente> getById(long id);

    List<Cliente> getAll();

    Optional<Cliente> update(long id, Cliente cliente);

    boolean deleteById(long id);

    Cliente create(Cliente cliente);
}
