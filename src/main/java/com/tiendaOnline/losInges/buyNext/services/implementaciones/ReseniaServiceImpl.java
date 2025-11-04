package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.dto.response.ReseniaResponseDTO;
import com.tiendaOnline.losInges.buyNext.entities.Producto;
import com.tiendaOnline.losInges.buyNext.entities.Resenia;
import com.tiendaOnline.losInges.buyNext.entities.Usuario;
import com.tiendaOnline.losInges.buyNext.repositories.ProductoRepository;
import com.tiendaOnline.losInges.buyNext.repositories.ReseniaRepository;
import com.tiendaOnline.losInges.buyNext.repositories.UsuarioRepository;
import com.tiendaOnline.losInges.buyNext.services.ReseniaService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class ReseniaServiceImpl implements ReseniaService {

    private final ReseniaRepository reseniaRepository;
    private final UsuarioRepository usuarioRepository;
    private final ProductoRepository productoRepository;

    public ReseniaServiceImpl (ReseniaRepository reseniaRepository,UsuarioRepository usuarioRepository
                                                                ,ProductoRepository productoRepository){
        this.reseniaRepository = reseniaRepository;
        this.usuarioRepository = usuarioRepository;
        this.productoRepository = productoRepository;
    }


    @Override
    public Optional<Resenia> getById(long id) {
        return reseniaRepository.findById(id);
    }

    @Override
    public List<Resenia> getAll() {
        return reseniaRepository.findAll();
    }

    @Override
    public Optional<Resenia> update(long id, Resenia reseniaActualizada) {
        return reseniaRepository.findById(id)
                .map(resenia -> {
                    resenia.setComentario(reseniaActualizada.getComentario());
                    resenia.setCalificacion(reseniaActualizada.getCalificacion());
                    return reseniaRepository.save(resenia);
                });
    }

    @Override
    public boolean deleteById(long id) {
        if(reseniaRepository.existsById(id)){
            reseniaRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Resenia create(Long usuaruiId, Long productoId, Resenia resenia) {
        Usuario usuario = usuarioRepository.findById(usuaruiId)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Producto producto = productoRepository.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        resenia.setUsuario(usuario);
        resenia.setProducto(producto);
        resenia.setFecha(LocalDateTime.now());

        return reseniaRepository.save(resenia);
    }

    @Override
    public List<ReseniaResponseDTO> getByProducto(Long productoId) {
        return reseniaRepository.findByProductoIdProducto(productoId)
                .stream()
                .map(resenia -> new ReseniaResponseDTO(
                        resenia.getIdResenia(),
                        resenia.getComentario(),
                        resenia.getCalificacion(),
                        resenia.getUsuario().getNombre(),
                        resenia.getFecha()
                ))
                .toList();
    }

    @Override
    public Double obtenerPromedioCalificacion(Long productoId) {
        return reseniaRepository.obtenerPromedio(productoId);
    }
}
