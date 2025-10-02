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
@Table(name = "personas")
public class Persona {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long idPersona;
    private String nombre;
    private String apellido;
    private String documento;
    private String direccion;
    private String telefono;

}
