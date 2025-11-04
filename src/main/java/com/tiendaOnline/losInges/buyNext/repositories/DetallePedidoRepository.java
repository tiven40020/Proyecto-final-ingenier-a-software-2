package com.tiendaOnline.losInges.buyNext.repositories;

import com.tiendaOnline.losInges.buyNext.entities.Categoria;
import com.tiendaOnline.losInges.buyNext.entities.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
}
