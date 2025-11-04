package com.tiendaOnline.losInges.buyNext.repositories;

import com.tiendaOnline.losInges.buyNext.entities.Categoria;
import com.tiendaOnline.losInges.buyNext.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
}
