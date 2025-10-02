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
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;
    @OneToOne(mappedBy = "id_persona", cascade = CascadeType.ALL)
    private Persona idPersona;
    @OneToOne(mappedBy = "id_usuario", cascade = CascadeType.ALL)
    private Usuario idUsuario;
}
