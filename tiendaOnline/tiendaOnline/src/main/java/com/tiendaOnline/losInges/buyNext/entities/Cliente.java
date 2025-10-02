package com.tiendaOnline.losInges.buyNext.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;
    @OneToOne(mappedBy = "id_persona", cascade = CascadeType.ALL)
    private Persona persona;
    @OneToOne(mappedBy = "id_usuario", cascade = CascadeType.ALL)
    private Usuario usuario;

}
