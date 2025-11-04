package com.tiendaOnline.losInges.buyNext.services;

import com.tiendaOnline.losInges.buyNext.entities.Pedido;
import java.util.*;

public interface PedidoService {

    Optional<Pedido> getById(long id);

    List<Pedido> getAll();

    Optional<Pedido> update(long id, Pedido pedido);

    boolean deleteById(long id);

    Pedido create(Pedido pedido);
}
