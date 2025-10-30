package com.tiendaOnline.losInges.buyNext.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private String email;

    @ManyToOne
    @JoinColumn(name ="id_rol", nullable = false)
    private Rol rol;

}
