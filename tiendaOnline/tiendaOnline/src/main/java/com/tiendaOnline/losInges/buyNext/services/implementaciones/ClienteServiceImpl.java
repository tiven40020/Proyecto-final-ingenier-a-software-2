package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.Cliente;
import com.tiendaOnline.losInges.buyNext.repositories.ClienteRepository;
import com.tiendaOnline.losInges.buyNext.services.ClienteService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl (ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }
    @Override
    public Optional<Cliente> getById(long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> update(long id, Cliente cliente) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(long id) {
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Cliente create(Cliente cliente) {
        return null;
    }
}
