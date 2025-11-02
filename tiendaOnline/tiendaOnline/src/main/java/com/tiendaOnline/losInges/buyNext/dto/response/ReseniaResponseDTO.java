package com.tiendaOnline.losInges.buyNext.dto.response;

import java.time.LocalDateTime;

public record ReseniaResponseDTO(
        Long idResenia,
        String comentario,
        int calificacion,
        String nombreUsuario,
        LocalDateTime fecha
) {
}
