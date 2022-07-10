/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.listas.service;

import com.practica.listas.model.Listareproduccion;
import com.practica.listas.repository.listasReproduccionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author patri
 */
@Service
public class ListaReproduccionServiceImpl implements ListaReproduccionService{
    
    @Autowired
     private listasReproduccionRepository  casasRepository;
    
    @Override
    public Listareproduccion crear(Listareproduccion p) {
    return casasRepository.save(p);
    }

    @Override
    public Listareproduccion findById(Long id) {
        return casasRepository.findById(id).orElse(null);
    }

    @Override
    public List<Listareproduccion> finByAll() {
        return casasRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        casasRepository.deleteById(id);
    }
}
