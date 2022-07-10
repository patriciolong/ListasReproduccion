/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.listas.service;

import com.practica.listas.model.Canciones;
import com.practica.listas.repository.cancionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author patri
 */
@Service
public class CancionesServiceImpl implements CancionesService{

    @Autowired
     private cancionesRepository  casasRepository;
    
    @Override
    public Canciones crear(Canciones p) {
    return casasRepository.save(p);
    }

    @Override
    public Canciones findById(Long id) {
        return casasRepository.findById(id).orElse(null);
    }

    @Override
    public List<Canciones> finByAll() {
        return casasRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        casasRepository.deleteById(id);
    }
}
