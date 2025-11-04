package com.tiendaOnline.losInges.buyNext.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String imagen;
    @ManyToOne
    @JsonIgnoreProperties("productos")
    private Categoria categoria;
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("producto")
    private List<Resenia> resenias;

}
