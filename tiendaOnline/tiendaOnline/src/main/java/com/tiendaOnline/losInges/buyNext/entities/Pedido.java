package com.tiendaOnline.losInges.buyNext.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPedido;
    private LocalDateTime fecha;
    private double total;
    @ManyToOne
    private Estado estado;
    @ManyToOne()
    private Usuario usuario;

}
