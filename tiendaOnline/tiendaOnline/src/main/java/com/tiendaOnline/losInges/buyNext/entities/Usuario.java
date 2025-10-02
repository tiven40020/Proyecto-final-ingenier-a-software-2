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
    private String correo;
    private String contrasenia;
    @OneToMany(mappedBy = "id_rol", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Rol> roles = new HashSet<>();
    @OneToOne(mappedBy = "id_persona", cascade = CascadeType.ALL)
    private Persona persona;
}
