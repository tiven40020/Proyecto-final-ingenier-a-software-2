package com.tiendaOnline.losInges.buyNext.dto;

import jakarta.validation.constraints.*;

public record LoginRequest(
        @NotBlank(message = "El correo electrónico es obligatorio.")
        @Email(message = "El formato del correo electrónico no es válido.")
        @Size(max = 100, message = "El correo no puede superar los 100 caracteres.")
        String correo,
        @NotBlank(message = "La contraseña es obligatoria.")
        @Size(min = 2, message = "La contraseña debe tener al menos 2 caracteres.")
        String contrasenia
) {
}
