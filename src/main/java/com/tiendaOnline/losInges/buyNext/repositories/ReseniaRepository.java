package com.tiendaOnline.losInges.buyNext.repositories;

import com.tiendaOnline.losInges.buyNext.entities.Categoria;
import com.tiendaOnline.losInges.buyNext.entities.Resenia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReseniaRepository extends JpaRepository<Resenia, Long> {
    List<Resenia> findByProductoIdProducto(Long idProducto);

    @Query("SELECT AVG(r.calificacion) FROM Resenia r WHERE r.producto.idProducto = :productoId")
    Double obtenerPromedio(Long productoId);
}
