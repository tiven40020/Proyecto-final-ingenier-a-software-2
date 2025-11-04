package com.tiendaOnline.losInges.buyNext.dto.request;

public record ReseniaRequestDTO(
        Long idUsuario,
        Long idProducto,
        String comentario,
        int calificacion
) {
}
