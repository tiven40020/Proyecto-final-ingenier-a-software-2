package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.Producto;
import com.tiendaOnline.losInges.buyNext.repositories.ProductoRepository;
import com.tiendaOnline.losInges.buyNext.services.ProductoService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductoServiceImpl implements ProductoService {


    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }
    @Override
    public Optional<Producto> getById(long id) {
        return productoRepository.findById(id);
    }

    @Override
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> update(long id, Producto productoActualizado) {
        return productoRepository.findById(id)
                .map(producto -> {
                    producto.setNombre(productoActualizado.getNombre());
                    producto.setDescripcion(productoActualizado.getDescripcion());
                    producto.setPrecio(productoActualizado.getPrecio());
                    producto.setStock(productoActualizado.getStock());
                    producto.setImagen(productoActualizado.getImagen());
                    producto.setCategoria(productoActualizado.getCategoria());
                    return productoRepository.save(producto);
                });
    }

    @Override
    public boolean deleteById(long id) {
        if(productoRepository.existsById(id)){
            productoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }
}
