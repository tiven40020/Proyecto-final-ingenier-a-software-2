package com.tiendaOnline.losInges.buyNext.services.implementaciones;

import com.tiendaOnline.losInges.buyNext.entities.Persona;
import com.tiendaOnline.losInges.buyNext.repositories.PersonaRepository;
import com.tiendaOnline.losInges.buyNext.services.PersonaService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaServiceImpl (PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }
    @Override
    public Optional<Persona> getById(long id) {
        return personaRepository.findById(id);
    }

    @Override
    public List<Persona> getAll() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> update(long id, Persona persona) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(long id) {
        if(personaRepository.existsById(id)){
            personaRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Persona create(Persona persona) {
        return null;
    }
}
