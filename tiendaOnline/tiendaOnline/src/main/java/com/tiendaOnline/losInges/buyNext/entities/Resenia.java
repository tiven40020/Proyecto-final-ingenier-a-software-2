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

@Table(name = "resenias")
@Entity
public class Resenia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idResenia;
    private String comentario;
    private int calificacion;
    private LocalDateTime fecha;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

}
